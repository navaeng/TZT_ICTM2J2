package me.ictm2j.tzt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Panel;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import java.awt.Choice;
import javax.swing.JTextField;
import javax.swing.JTabbedPane;
import javax.swing.JTextPane;

public class Instellingen_TZTbezorger extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Instellingen_TZTbezorger frame = new Instellingen_TZTbezorger();
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
	public Instellingen_TZTbezorger() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 785, 646);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(247, 247, 247));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Panel panel_7 = new Panel();
		panel_7.setBackground(Color.WHITE);
		panel_7.setBounds(225, 131, 510, 420);
		contentPane.add(panel_7);
		panel_7.setLayout(null);
		
		Choice choice = new Choice();
		choice.setBounds(10, 172, 164, 42);
		panel_7.add(choice);
		
		Choice choice_1 = new Choice();
		choice_1.setBounds(10, 239, 164, 20);
		panel_7.add(choice_1);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBackground(new Color(247, 247, 247));
		tabbedPane.setBounds(10, 295, 490, 114);
		panel_7.add(tabbedPane);
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("Maandag\r\n", null, tabbedPane_1, null);
		tabbedPane.setBackgroundAt(0, Color.LIGHT_GRAY);
		
		JTabbedPane tabbedPane_2 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("Dinsdag\r\n", null, tabbedPane_2, null);
		
		JTabbedPane tabbedPane_3 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("Woensdag\r\n\r\n", null, tabbedPane_3, null);
		
		JTabbedPane tabbedPane_4 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("Donderdag\r\n", null, tabbedPane_4, null);
		
		JTabbedPane tabbedPane_5 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("Vrijdag\r\n", null, tabbedPane_5, null);
		
		JTabbedPane tabbedPane_6 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("Zaterdag\r\n", null, tabbedPane_6, null);
		
		JTabbedPane tabbedPane_7 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("Zondag\r\n", null, tabbedPane_7, null);
		
		JLabel lblRooster = new JLabel("Rooster");
		lblRooster.setFont(new Font("Arial", Font.BOLD, 11));
		lblRooster.setBounds(10, 270, 46, 14);
		panel_7.add(lblRooster);
		
		JLabel lblMijnTraject = new JLabel("Mijn traject:");
		lblMijnTraject.setFont(new Font("Arial", Font.BOLD, 11));
		lblMijnTraject.setBounds(10, 219, 76, 14);
		panel_7.add(lblMijnTraject);
		
		JLabel lblMeldingen = new JLabel("Meldingen\r\n");
		lblMeldingen.setFont(new Font("Arial", Font.BOLD, 11));
		lblMeldingen.setBounds(10, 152, 64, 14);
		panel_7.add(lblMeldingen);
		
		JLabel lblInstellingen = new JLabel("Instellingen");
		lblInstellingen.setFont(new Font("Arial", Font.BOLD, 13));
		lblInstellingen.setBounds(10, 11, 76, 20);
		panel_7.add(lblInstellingen);
		
		JLabel lblVoornaam = new JLabel("Voornaam");
		lblVoornaam.setBounds(10, 42, 64, 20);
		panel_7.add(lblVoornaam);
		
		JLabel lblAchternaam = new JLabel("Achternaam");
		lblAchternaam.setBounds(10, 60, 64, 20);
		panel_7.add(lblAchternaam);
		
		JLabel lblFunctie = new JLabel("Functie");
		lblFunctie.setBounds(10, 79, 64, 20);
		panel_7.add(lblFunctie);
		
		JLabel lblRekeningnummer = new JLabel("Rekeningnummer\r\n");
		lblRekeningnummer.setBounds(10, 98, 90, 20);
		panel_7.add(lblRekeningnummer);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(146, 42, 182, 20);
		panel_7.add(textPane);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBounds(146, 60, 182, 20);
		panel_7.add(textPane_1);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setBounds(146, 79, 182, 20);
		panel_7.add(textPane_2);
		
		JTextPane textPane_3 = new JTextPane();
		textPane_3.setBounds(146, 98, 182, 20);
		panel_7.add(textPane_3);
		
		Panel panel_8 = new Panel();
		panel_8.setFont(new Font("Arial", Font.BOLD, 12));
		panel_8.setForeground(new Color(255, 153, 51));
		panel_8.setBackground(new Color(51, 51, 51));
		panel_8.setBounds(0, 0, 178, 616);
		contentPane.add(panel_8);
		panel_8.setLayout(null);
		
		Button button_1 = new Button("Melding\r\nen");
		button_1.setForeground(new Color(255, 153, 51));
		button_1.setFont(new Font("Arial", Font.BOLD, 12));
		button_1.setBackground(new Color(51, 51, 51));
		button_1.setBounds(0, 190, 178, 52);
		panel_8.add(button_1);
		
		Button button_2 = new Button("Levering");
		button_2.setFont(new Font("Arial", Font.BOLD, 12));
		button_2.setForeground(new Color(255, 153, 51));
		button_2.setBackground(new Color(51, 51, 51));
		button_2.setBounds(0, 138, 178, 52);
		panel_8.add(button_2);
		
		Button button_3 = new Button("Dashboard");
		button_3.setFont(new Font("Arial", Font.BOLD, 12));
		button_3.setBackground(new Color(51, 51, 51));
		button_3.setBounds(0, 80, 178, 52);
		panel_8.add(button_3);
		
		Button button = new Button("Instellingen");
		button.setForeground(new Color(0, 0, 0));
		button.setFont(new Font("Arial", Font.BOLD, 12));
		button.setBackground(new Color(255, 153, 51));
		button.setBounds(0, 249, 178, 52);
		panel_8.add(button);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(36, 0, 142, 57);
		panel_8.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\natha\\OneDrive\\Afbeeldingen\\TZT.png"));
		lblNewLabel.setBackground(Color.WHITE);
		
		Panel panel_9 = new Panel();
		panel_9.setBackground(new Color(255, 153, 0));
		panel_9.setBounds(175, 0, 594, 69);
		contentPane.add(panel_9);
		panel_9.setLayout(null);
		
		Panel panel_10 = new Panel();
		panel_10.setBackground(UIManager.getColor("Button.highlight"));
		panel_10.setBounds(451, 10, 133, 49);
		panel_9.add(panel_10);
		panel_10.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 5, 113, 33);
		panel_10.add(textArea);
	}
}
