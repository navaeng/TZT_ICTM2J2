package me.ictm2j.tzt;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Button;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;

public class Dashboard extends JFrame implements ActionListener {

	private Employee employee;
	private JPanel contentPanel;
	private JPanel sidePanel;
	private JPanel navPanel;
	private JPanel centerPanel;
	private JPanel topPanel;
	private JLabel label;
	private Button buttonMelDash;
	private Button buttonLevDash;
	private Button buttonDashDash;
	private Button buttonSetDash;
	private JPanel panel;
	private JPanel panel_2;
	private JPanel panel_3;
	private JPanel panel_4;

	/**
	 * Create the frame.
	 */
	public Dashboard(Employee employee) {

		this.employee = employee;

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 785, 646);
		contentPanel = new JPanel();
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPanel);
		contentPanel.setLayout(null);

		sidePanel = new JPanel();
		sidePanel.setBorder(new LineBorder(Color.blue, 5));
		sidePanel.setBackground(Color.WHITE);
		sidePanel.setBounds(0, 0, 125, 607);
		contentPanel.add(sidePanel);
		sidePanel.setLayout(null);

		label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\natha\\OneDrive\\Afbeeldingen\\TZT.png"));
		label.setBackground(Color.WHITE);
		label.setBounds(10, 11, 87, 41);
		sidePanel.add(label);

		topPanel = new JPanel();
		topPanel.setBounds(124, 0, 645, 75);
		topPanel.setBackground(new Color(255, 153, 0));
		contentPanel.add(topPanel);
		topPanel.setLayout(null);

		JLabel toplabel = new JLabel();
		toplabel.setFont(new Font("Arial", Font.BOLD, 15));
		toplabel.setBounds(12, 13, 621, 49);
		toplabel.setHorizontalAlignment(SwingConstants.CENTER);
		toplabel.setText("Welkom " + this.employee.getName());
		topPanel.add(toplabel);

		navPanel = new JPanel();
		navPanel.setBounds(0, 0, 125, 607);
		navPanel.setLayout(null);
		navPanel.setBackground(new Color(51, 51, 51));
		sidePanel.add(navPanel);

		buttonMelDash = new Button("Meldingen");
		buttonMelDash.addActionListener(this);
		buttonMelDash.setForeground(new Color(255, 153, 0));
		buttonMelDash.setFont(new Font("Arial", Font.BOLD, 12));
		buttonMelDash.setBackground(new Color(51, 51, 51));
		buttonMelDash.setBounds(0, 258, 125, 54);
		navPanel.add(buttonMelDash);

		buttonLevDash = new Button("Leveringen");
		buttonLevDash.addActionListener(this);
		buttonLevDash.setForeground(new Color(255, 153, 0));
		buttonLevDash.setFont(new Font("Arial", Font.BOLD, 12));
		buttonLevDash.setBackground(new Color(51, 51, 51));
		buttonLevDash.setBounds(0, 198, 125, 54);
		navPanel.add(buttonLevDash);

		buttonDashDash = new Button("Dashboard\r\n");
		buttonDashDash.addActionListener(this);
		buttonDashDash.setForeground(Color.BLACK);
		buttonDashDash.setFont(new Font("Arial", Font.BOLD, 12));
		buttonDashDash.setBackground(new Color(255, 153, 0));
		buttonDashDash.setBounds(0, 138, 125, 54);
		navPanel.add(buttonDashDash);

		buttonSetDash = new Button("Instellingen");
		buttonSetDash.addActionListener(this);
		buttonSetDash.setForeground(new Color(255, 153, 0));
		buttonSetDash.setFont(new Font("Arial", Font.BOLD, 12));
		buttonSetDash.setBackground(new Color(51, 51, 51));
		buttonSetDash.setActionCommand("Meldingen\r\n");
		buttonSetDash.setBounds(0, 318, 125, 54);
		navPanel.add(buttonSetDash);

		centerPanel = new JPanel();
		centerPanel.setBounds(124, 75, 644, 532);
		centerPanel.setBackground(Color.white);
		centerPanel.setBorder(new LineBorder(Color.black, 2));
		contentPanel.add(centerPanel);
		centerPanel.setLayout(null);

		JPanel personalMessages = new JPanel();
		personalMessages.setBackground(Color.WHITE);
		personalMessages.setBorder(new LineBorder(Color.BLACK, 3));
		personalMessages.setBounds(12, 98, 248, 413);
		centerPanel.add(personalMessages);
		personalMessages.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setVgap(48);
		flowLayout.setHgap(115);
		flowLayout.setAlignment(FlowLayout.LEFT);
		personalMessages.add(panel);

		panel_2 = new JPanel();
		FlowLayout flowLayout1 = (FlowLayout) panel_2.getLayout();
		flowLayout1.setVgap(48);
		flowLayout1.setHgap(115);
		flowLayout1.setAlignment(FlowLayout.LEFT);
		personalMessages.add(panel_2);

		panel_3 = new JPanel();
		FlowLayout flowLayout3 = (FlowLayout) panel_3.getLayout();
		flowLayout3.setVgap(48);
		flowLayout3.setHgap(115);
		flowLayout3.setAlignment(FlowLayout.LEFT);
		personalMessages.add(panel_3);

		panel_4 = new JPanel();
		FlowLayout flowLayout4 = (FlowLayout) panel_4.getLayout();
		flowLayout4.setVgap(48);
		flowLayout4.setHgap(115);
		flowLayout4.setAlignment(FlowLayout.LEFT);
		personalMessages.add(panel_4);


		JPanel personalMessagesTop = new JPanel();
		personalMessagesTop.setBounds(12, 13, 248, 90);
		centerPanel.add(personalMessagesTop);
		personalMessagesTop.setBackground(new Color(255, 153, 0));
		personalMessagesTop.setBorder(new LineBorder(Color.DARK_GRAY, 3));
		personalMessagesTop.setLayout(null);

		if (this.employee.toString().equalsIgnoreCase("Treinkoerier")) {
			JLabel lblBerichten = new JLabel("Mijn leveringen");
			lblBerichten.setFont(new Font("Arial", Font.PLAIN, 18));
			lblBerichten.setHorizontalAlignment(SwingConstants.CENTER);
			lblBerichten.setBounds(12, 13, 224, 64);
			personalMessagesTop.add(lblBerichten);
		} else if (this.employee.toString().equalsIgnoreCase("Systeembeheerder")) {
			JLabel lblBerichten = new JLabel("Berichten");
			lblBerichten.setFont(new Font("Arial", Font.PLAIN, 18));
			lblBerichten.setHorizontalAlignment(SwingConstants.CENTER);
			lblBerichten.setBounds(12, 13, 224, 64);
			personalMessagesTop.add(lblBerichten);
		} else {
			JLabel lblBerichten = new JLabel(this.employee.toString());
			lblBerichten.setFont(new Font("Arial", Font.PLAIN, 18));
			lblBerichten.setHorizontalAlignment(SwingConstants.CENTER);
			lblBerichten.setBounds(12, 13, 224, 64);
			personalMessagesTop.add(lblBerichten);
		}
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(buttonMelDash)) {
			centerPanel.setVisible(false);
			navPanel.setVisible(false);
			TZTcourierNotifications notification = new TZTcourierNotifications();
			contentPanel.add(notification.centerPanel);
			sidePanel.add(notification.navPanel);

		} else {
			System.out.print("false");
		}
	}

	private void displayMessages(Employee employee) {
		if (employee.toString().equalsIgnoreCase("Treinkoerier")) {
			try {
				PreparedStatement query = Connection.connection.prepareStatement("SELECT deliverID, lockerID, date, comment, status FROM Delivery WHERE userID=" + employee.getUserName() + ";");
				ResultSet rs = query.executeQuery();

				while (rs.next()) {
					int deliverID = rs.getInt("deliverID");
					int lockerID = rs.getInt("lockerID");
					String date = rs.getString("date");
					String comment = rs.getString("comment");
					String status = rs.getString("status");

				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}
}
