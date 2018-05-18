package me.ictm2j.tzt;

import javax.swing.JPanel;
import java.awt.Rectangle;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class AdminPackage extends JPanel implements ActionListener {
	private JTextField textFieldLengte;
	private JTextField textFieldBreedte;
	private JTextField textFieldHoogte;
	private JTextField textFieldPackageID;

	/**
	 * Create the panel.
	 */
	public AdminPackage() {
		setBounds(new Rectangle(10, 11, 452, 291));
		setLayout(null);
		
		textFieldLengte = new JTextField();
		textFieldLengte.setBounds(100, 48, 110, 20);
		add(textFieldLengte);
		textFieldLengte.setColumns(10);
		
		textFieldBreedte = new JTextField();
		textFieldBreedte.setColumns(10);
		textFieldBreedte.setBounds(100, 79, 110, 20);
		add(textFieldBreedte);
		
		textFieldHoogte = new JTextField();
		textFieldHoogte.setColumns(10);
		textFieldHoogte.setBounds(100, 110, 110, 20);
		add(textFieldHoogte);
		
		textFieldPackageID = new JTextField();
		textFieldPackageID.setColumns(10);
		textFieldPackageID.setBounds(100, 141, 139, 20);
		add(textFieldPackageID);
		
		JLabel lblLengte = new JLabel("Lengte");
		lblLengte.setBounds(10, 48, 59, 20);
		add(lblLengte);
		
		JLabel lblBreedte = new JLabel("Breedte");
		lblBreedte.setBounds(10, 82, 59, 20);
		add(lblBreedte);
		
		JLabel lblHoogte = new JLabel("Hoogte");
		lblHoogte.setBounds(10, 110, 59, 20);
		add(lblHoogte);
		
		JLabel lblGewicht = new JLabel("Package ID");
		lblGewicht.setBounds(10, 141, 59, 20);
		add(lblGewicht);
		
		JLabel lblCm = new JLabel("CM");
		lblCm.setBounds(220, 113, 59, 20);
		add(lblCm);
		
		JLabel label = new JLabel("CM");
		label.setBounds(220, 82, 59, 20);
		add(label);
		
		JLabel label_1 = new JLabel("CM");
		label_1.setBounds(220, 48, 59, 20);
		add(label_1);
		
		JLabel lblPakket = new JLabel("Pakket");
		lblPakket.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblPakket.setBounds(10, 11, 72, 26);
		add(lblPakket);
		
		JButton btnNewButton = new JButton("Pakket toevoegen");
		btnNewButton.addActionListener(this);
		btnNewButton.setBounds(101, 201, 138, 26);
		add(btnNewButton);

	}
	
	public void actionPerformed(ActionEvent e) {
		
		
		//de velden naar de database uploaden
		try {
		String strl=textFieldLengte.getText();
		String strb=textFieldBreedte.getText();
		String strh=textFieldHoogte.getText();
		String strp=textFieldPackageID.getText();
		
		Statement s = Connection.connection.createStatement();
		
			
	
		s.execute("INSERT INTO Package (packageID,lengte,breedte,hoogte)values('"+ strp + "' , '"+ strl + "', '" + strb + "', '" + strh + "')");
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		repaint();
	}
	}

