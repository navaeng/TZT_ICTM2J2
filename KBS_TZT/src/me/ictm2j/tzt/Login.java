package me.ictm2j.tzt;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import java.awt.Button;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class Login extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JPasswordField passwordField;
	private JTextField textField;
	private Button loginbutton;

	/**
	 * Create the frame.
	 */
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 576, 347);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(51, 51, 51));
		panel.setBounds(0, 0, 560, 308);
		contentPane.add(panel);
		panel.setLayout(null);

		loginbutton = new Button("Login");
		loginbutton.addActionListener(this);
		loginbutton.setFont(new Font("Arial Black", Font.BOLD, 16));
		loginbutton.setBackground(new Color(255, 153, 0));
		loginbutton.setBounds(215, 227, 112, 43);
		panel.add(loginbutton);

		passwordField = new JPasswordField();
		passwordField.setBackground(new Color(255, 153, 0));
		passwordField.setBounds(297, 164, 112, 28);
		panel.add(passwordField);

		textField = new JTextField();
		textField.setBackground(new Color(255, 153, 0));
		textField.setBounds(126, 164, 112, 28);
		panel.add(textField);
		textField.setColumns(10);

		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\natha\\OneDrive\\Afbeeldingen\\TZT.png"));
		label.setBounds(226, 78, 112, 43);
		panel.add(label);

		JLabel lblGebruikersnaam = new JLabel("Gebruikersnaam");
		lblGebruikersnaam.setForeground(Color.WHITE);
		lblGebruikersnaam.setBounds(126, 135, 112, 26);
		panel.add(lblGebruikersnaam);

		JLabel lblPassword = new JLabel("Wachtwoord");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setBounds(301, 140, 108, 16);
		panel.add(lblPassword);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(loginbutton)) {
			String password = passwordField.getText();
			int username = Integer.parseInt(textField.getText());
			try {
				if (DbHelper.useridExists(username) == true) {
					if (validatePassword(password, getPasswordByUser(username))) {
						this.setVisible(false);
						String role = DbHelper.getUserdataByUserID(username).get(1);

						Dashboard dashboard = null;
						if (role.equalsIgnoreCase("Treinkoerier")) {
							dashboard = new Dashboard (new Traincourier(username, DbHelper.getUserdataByUserID(username).get(0), null));
						} else if (role.equalsIgnoreCase("Fietskoerier")) {
							dashboard = new Dashboard (new Bikecourier(username, DbHelper.getUserdataByUserID(username).get(0), null));
						} else if (role.equalsIgnoreCase("Systeembeheerder")) {
							dashboard = new Dashboard (new Systemmanager(username, DbHelper.getUserdataByUserID(username).get(0)));
						}
						dashboard.setVisible(true);

					} else {
						System.out.println("Incorrect password");
					}
				} else {
					System.out.println("Username does not exist");
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	private static boolean validatePassword(String originalPassword, String storedPassword) throws NoSuchAlgorithmException, InvalidKeySpecException
	{
		String[] parts = storedPassword.split(":");
		int iterations = Integer.parseInt(parts[0]);
		byte[] salt = fromHex(parts[1]);
		byte[] hash = fromHex(parts[2]);

		PBEKeySpec spec = new PBEKeySpec(originalPassword.toCharArray(), salt, iterations, hash.length * 8);
		SecretKeyFactory skf = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
		byte[] testHash = skf.generateSecret(spec).getEncoded();

		int diff = hash.length ^ testHash.length;
		for(int i = 0; i < hash.length && i < testHash.length; i++)
		{
			diff |= hash[i] ^ testHash[i];
		}
		return diff == 0;
	}

	private static byte[] fromHex(String hex) throws NoSuchAlgorithmException
	{
		byte[] bytes = new byte[hex.length() / 2];
		for(int i = 0; i<bytes.length ;i++)
		{
			bytes[i] = (byte)Integer.parseInt(hex.substring(2 * i, 2 * i + 2), 16);
		}
		return bytes;
	}

	private static String getPasswordByUser(int user_id)
	{
		try {
			PreparedStatement selectsql = Connection.connection.prepareStatement("SELECT password FROM Userdata WHERE UserID=" + user_id + ";");
			ResultSet rs = selectsql.executeQuery();

			rs.next();

			return rs.getString("password");
		} catch (Exception E) {
			E.printStackTrace();
		}
		return null;
	}

}
