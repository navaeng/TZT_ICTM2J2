package me.ictm2j.tzt;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.Button;
import java.awt.Panel;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.UIManager;
import java.awt.Font;
import javax.swing.JLayeredPane;
import javax.swing.border.MatteBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JRadioButton;
import java.awt.Choice;
import javax.swing.JTabbedPane;
import java.awt.SystemColor;

public class Bezorger_dashboard extends JFrame {

	private JPanel contentPane;
	private JPanel panelDashboard;
	private JPanel panelSettings;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bezorger_dashboard frame = new Bezorger_dashboard();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Bezorger_dashboard() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 785, 646);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(245, 245, 245));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panelSettings = new JPanel();
		panelSettings.setBounds(0, 0, 769, 607);
		contentPane.add(panelSettings);
		panelSettings.setLayout(null);
		
		JPanel panelDashboard = new JPanel();
		panelDashboard.setBounds(0, 0, 769, 607);
		contentPane.add(panelDashboard);
		panelDashboard.setLayout(null);

		JPanel panelNavSet = new JPanel();
		panelNavSet.setLayout(null);
		panelNavSet.setBackground(new Color(51, 51, 51));
		panelNavSet.setBounds(0, 0, 125, 607);
		panelSettings.add(panelNavSet);

		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\natha\\OneDrive\\Afbeeldingen\\TZT.png"));
		label.setBackground(Color.WHITE);
		label.setBounds(10, 11, 87, 41);
		panelNavSet.add(label);

		Button button = new Button("Dashboard");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelDashboard.setVisible(true);
				panelSettings.setVisible(false);
				
			}
		});
		button.setForeground(new Color(255, 153, 0));
		button.setFont(new Font("Arial", Font.BOLD, 12));
		button.setBackground(new Color(51,51,51));
		button.setBounds(0, 138, 125, 54);
		panelNavSet.add(button);

		Button button_1 = new Button("Leveringen");
		button_1.setForeground(new Color(255, 153, 0));
		button_1.setFont(new Font("Arial", Font.BOLD, 12));
		button_1.setBackground(new Color(51, 51, 51));
		button_1.setBounds(0, 198, 125, 54);
		panelNavSet.add(button_1);

		Button button_2 = new Button("Meldingen");
		button_2.setForeground(new Color(255, 153, 0));
		button_2.setFont(new Font("Arial", Font.BOLD, 12));
		button_2.setBackground(new Color(51, 51, 51));
		button_2.setBounds(0, 258, 125, 54);
		panelNavSet.add(button_2);

		Button button_3 = new Button("instellingen");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelDashboard.setVisible(false);
				panelSettings.setVisible(true);
			}
		});
		button_3.setForeground(new Color(0, 0, 0));
		button_3.setFont(new Font("Arial", Font.BOLD, 12));
		button_3.setBackground(new Color(255, 153, 0));
		button_3.setBounds(0, 318, 125, 54);
		panelNavSet.add(button_3);
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelDashboard.setVisible(false);
				panelSettings.setVisible(true);
			}
		});

		JPanel panelTopSet = new JPanel();
		panelTopSet.setBackground(new Color(255, 153, 0));
		panelTopSet.setBounds(124, 0, 645, 75);
		panelSettings.add(panelTopSet);

		JPanel panelContentSettings = new JPanel();
		panelContentSettings.setBackground(Color.WHITE);
		panelContentSettings.setBounds(187, 120, 515, 382);
		panelSettings.add(panelContentSettings);
		panelContentSettings.setLayout(null);

		Choice choiceMelingenONOFF = new Choice();
		choiceMelingenONOFF.setBounds(37, 166, 124, 20);
		panelContentSettings.add(choiceMelingenONOFF);

		Choice choiceTraject = new Choice();
		choiceTraject.setBounds(37, 215, 124, 20);
		panelContentSettings.add(choiceTraject);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(37, 279, 468, 88);
		tabbedPane.setBackground(new Color(247, 247, 247));
		panelContentSettings.add(tabbedPane);

		JTabbedPane tabbedPaneMaandag = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("Ma", null, tabbedPaneMaandag, null);

		JTabbedPane tabbedPaneDinsdag = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("Di", null, tabbedPaneDinsdag, null);

		JTabbedPane tabbedPaneWoensdag = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("Wo", null, tabbedPaneWoensdag, null);

		JTabbedPane tabbedPaneDonderdag = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("Do", null, tabbedPaneDonderdag, null);

		JTabbedPane tabbedPaneVrijdag = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("Vrij", null, tabbedPaneVrijdag, null);

		JTabbedPane tabbedPaneZaterdag = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("Za", null, tabbedPaneZaterdag, null);

		JTabbedPane tabbedPaneZondag = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("Zo", null, tabbedPaneZondag, null);

		JLabel label_1 = new JLabel("Rooster");
		label_1.setBounds(37, 254, 44, 14);
		label_1.setFont(new Font("Arial", Font.BOLD, 11));
		panelContentSettings.add(label_1);

		JLabel label_2 = new JLabel("Mijn traject:");
		label_2.setBounds(37, 195, 64, 14);
		label_2.setFont(new Font("Arial", Font.BOLD, 11));
		panelContentSettings.add(label_2);

		JLabel label_3 = new JLabel("Meldingen\r\n");
		label_3.setBounds(37, 146, 58, 14);
		label_3.setFont(new Font("Arial", Font.BOLD, 11));
		panelContentSettings.add(label_3);

		JLabel label_4 = new JLabel("Instellingen");
		label_4.setBounds(40, 29, 74, 15);
		label_4.setFont(new Font("Arial", Font.BOLD, 13));
		panelContentSettings.add(label_4);

		JLabel label_5 = new JLabel("Voornaam");
		label_5.setBounds(50, 59, 64, 14);
		panelContentSettings.add(label_5);

		JLabel label_6 = new JLabel("Achternaam");
		label_6.setBounds(50, 80, 84, 14);
		panelContentSettings.add(label_6);

		JLabel label_7 = new JLabel("Functie");
		label_7.setBounds(50, 97, 64, 14);
		panelContentSettings.add(label_7);

		JLabel label_8 = new JLabel("Rekeningnummer\r\n");
		label_8.setBounds(50, 116, 111, 14);
		panelContentSettings.add(label_8);

		JTextPane textPaneVoornaam = new JTextPane();
		textPaneVoornaam.setBounds(186, 59, 107, 14);
		panelContentSettings.add(textPaneVoornaam);
		
		JTextPane textPaneAchternaam = new JTextPane();
		textPaneAchternaam.setBounds(186, 80, 107, 14);
		panelContentSettings.add(textPaneAchternaam);
		
		JTextPane textPaneFunctie = new JTextPane();
		textPaneFunctie.setBounds(186, 97, 107, 14);
		panelContentSettings.add(textPaneFunctie);
		
		JTextPane textPaneRekeningnummer = new JTextPane();
		textPaneRekeningnummer.setBounds(186, 116, 107, 14);
		panelContentSettings.add(textPaneRekeningnummer);



		JPanel panelNavDash = new JPanel();
		panelNavDash.setBounds(0, 0, 125, 607);
		panelNavDash.setBackground(new Color(51, 51, 51));
		panelDashboard.add(panelNavDash);
		panelNavDash.setLayout(null);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(10, 11, 87, 41);
		panelNavDash.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\natha\\OneDrive\\Afbeeldingen\\TZT.png"));
		lblNewLabel.setBackground(Color.WHITE);

		Button buttonDashboard = new Button("Dashboard");
		buttonDashboard.setBackground(new Color(255, 153, 0));
		buttonDashboard.setForeground(new Color(0, 0, 0));
		buttonDashboard.setFont(new Font("Arial", Font.BOLD, 12));
		buttonDashboard.setBounds(0, 138, 125, 54);
		panelNavDash.add(buttonDashboard);

		Button buttonLeveringen = new Button("Leveringen");
		buttonLeveringen.setForeground(new Color(255, 153, 0));
		buttonLeveringen.setFont(new Font("Arial", Font.BOLD, 12));
		buttonLeveringen.setBackground(new Color(51, 51, 51));
		buttonLeveringen.setBounds(0, 198, 125, 54);
		panelNavDash.add(buttonLeveringen);

		Button buttonMeldingen = new Button("Meldingen");
		buttonMeldingen.setForeground(new Color(255, 153, 0));
		buttonMeldingen.setFont(new Font("Arial", Font.BOLD, 12));
		buttonMeldingen.setBackground(new Color(51, 51, 51));
		buttonMeldingen.setBounds(0, 258, 125, 54);
		panelNavDash.add(buttonMeldingen);

		Button buttonInstellingen = new Button("instellingen");
		buttonInstellingen.setForeground(new Color(255, 153, 0));
		buttonInstellingen.setFont(new Font("Arial", Font.BOLD, 12));
		buttonInstellingen.setBackground(new Color(51, 51, 51));
		buttonInstellingen.setBounds(0, 318, 125, 54);
		panelNavDash.add(buttonInstellingen);
		buttonInstellingen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelDashboard.setVisible(false);
				panelSettings.setVisible(true);
			}
		});

		JPanel panelTopDash = new JPanel();
		panelTopDash.setBounds(124, 0, 645, 75);
		panelTopDash.setBackground(new Color(255, 153, 0));
		panelDashboard.add(panelTopDash);

		JPanel panel = new JPanel();
		panel.setBounds(219, 156, 144, 112);
		panel.setBackground(Color.WHITE);
		panelDashboard.add(panel);

		JPanel panel_3 = new JPanel();
		panel_3.setBounds(219, 296, 144, 75);
		panel_3.setBackground(Color.WHITE);
		panelDashboard.add(panel_3);

		JPanel panel_4 = new JPanel();
		panel_4.setBounds(412, 296, 144, 75);
		panel_4.setBackground(Color.WHITE);
		panelDashboard.add(panel_4);

		JPanel panel_5 = new JPanel();
		panel_5.setBounds(592, 296, 144, 68);
		panel_5.setBackground(Color.WHITE);
		panelDashboard.add(panel_5);

		JPanel panel_6 = new JPanel();
		panel_6.setBounds(219, 415, 337, 110);
		panel_6.setBackground(Color.WHITE);
		panelDashboard.add(panel_6);

		JPanel panel_7 = new JPanel();
		panel_7.setBounds(592, 415, 144, 110);
		panel_7.setBackground(Color.WHITE);
		panelDashboard.add(panel_7);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(412, 156, 144, 110);
		panel_1.setBackground(Color.WHITE);
		panelDashboard.add(panel_1);

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(592, 156, 144, 110);
		panel_2.setBackground(Color.WHITE);
		panelDashboard.add(panel_2);

	}
}
