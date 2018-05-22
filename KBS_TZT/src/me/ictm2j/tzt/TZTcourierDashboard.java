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
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TZTcourierDashboard extends JFrame implements ActionListener {

	private JPanel contentPanel;
	private JPanel sidePanel;
	private JPanel navPanel;
	private JPanel centerPanel;
	private JPanel topPanel;
	private JLabel label;
	private JTextPane textPane;
	private Button buttonMelDash;
	private Button buttonLevDash;
	private Button buttonDashDash;
	private Button buttonSetDash;
	
	/**
	 * Create the frame.
	 */
	public TZTcourierDashboard() {
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
		topPanel.setLayout(null);
		topPanel.setBackground(new Color(255, 153, 0));
		contentPanel.add(topPanel);
		
		textPane = new JTextPane();
		textPane.setBounds(487, 11, 148, 53);
		topPanel.add(textPane);
		
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
		centerPanel.setBounds(125, 75, 642, 524);
		centerPanel.setBackground(Color.white);
		centerPanel.setBorder(new LineBorder(Color.green, 5));
		contentPanel.add(centerPanel);

		JPanel panel_3 = new JPanel();
		panel_3.setBounds(204, 141, 125, 125);
		centerPanel.add(panel_3);

		JPanel panel_4 = new JPanel();
		panel_4.setBounds(358, 141, 125, 125);
		centerPanel.add(panel_4);

		JPanel panel_5 = new JPanel();
		panel_5.setBounds(516, 141, 125, 125);
		centerPanel.add(panel_5);

		JPanel panel_6 = new JPanel();
		panel_6.setBounds(204, 293, 279, 125);
		centerPanel.add(panel_6);

		JPanel panel_7 = new JPanel();
		panel_7.setBounds(516, 293, 125, 125);
		centerPanel.add(panel_7);

		JPanel panel_8 = new JPanel();
		panel_8.setBounds(204, 441, 437, 90);
		panel_8.setBorder(new LineBorder(Color.green, 5));
		centerPanel.add(panel_8);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(buttonMelDash)) {
			centerPanel.setVisible(false);
			navPanel.setVisible(false);
			TZTcourierNotifications notification = new TZTcourierNotifications();
			contentPanel.add(notification.centerPanel);
			sidePanel.add(notification.navPanel);
		} else if (e.getSource().equals(buttonSetDash)){
			System.out.print("");
		}
	}

}
