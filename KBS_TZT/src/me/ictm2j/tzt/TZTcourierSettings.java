package me.ictm2j.tzt;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Button;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import java.awt.Choice;
import javax.swing.JTabbedPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TZTcourierSettings extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TZTcourierSettings frame = new TZTcourierSettings();
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
	public TZTcourierSettings() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 785, 646);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelSettings = new JPanel();
		panelSettings.setBounds(0, 0, 769, 607);
		contentPane.add(panelSettings);
		panelSettings.setLayout(null);
		
		JPanel panelNavSet = new JPanel();
		panelNavSet.setBackground(new Color(51, 51, 51));
		panelNavSet.setBounds(0, 0, 125, 607);
		panelSettings.add(panelNavSet);
		panelNavSet.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\natha\\OneDrive\\Afbeeldingen\\TZT.png"));
		label.setBackground(Color.WHITE);
		label.setBounds(10, 11, 87, 41);
		panelNavSet.add(label);
		
		Button buttonDashSet = new Button("Dashboard");
		buttonDashSet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelSettings.setVisible(false);
				new TZTcourierDashboard().setVisible(true);
			}
		});
		buttonDashSet.setForeground(new Color(255, 153, 0));
		buttonDashSet.setFont(new Font("Arial", Font.BOLD, 12));
		buttonDashSet.setBackground(new Color(51, 51, 51));
		buttonDashSet.setBounds(0, 138, 125, 54);
		panelNavSet.add(buttonDashSet);
		
		Button buttonLevSet = new Button("Leveringen");
		buttonLevSet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelSettings.setVisible(false);
				new TZTcourierDelivery().setVisible(true);
			}
		});
		buttonLevSet.setForeground(new Color(255, 153, 0));
		buttonLevSet.setFont(new Font("Arial", Font.BOLD, 12));
		buttonLevSet.setBackground(new Color(51, 51, 51));
		buttonLevSet.setBounds(0, 198, 125, 54);
		panelNavSet.add(buttonLevSet);
		
		Button buttonMelSet = new Button("Meldingen\r\n");
		buttonMelSet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelSettings.setVisible(false);
				new TZTcourierNotifications().setVisible(true);			
			}
		});
		buttonMelSet.setActionCommand("Meldingen\r\n");
		buttonMelSet.setForeground(new Color(255, 153, 0));
		buttonMelSet.setFont(new Font("Arial", Font.BOLD, 12));
		buttonMelSet.setBackground(new Color(51, 51, 51));
		buttonMelSet.setBounds(0, 258, 125, 54);
		panelNavSet.add(buttonMelSet);
		
		Button buttonSetSet = new Button("instellingen");
		buttonSetSet.setForeground(Color.BLACK);
		buttonSetSet.setFont(new Font("Arial", Font.BOLD, 12));
		buttonSetSet.setBackground(new Color(255, 153, 0));
		buttonSetSet.setBounds(0, 318, 125, 54);
		panelNavSet.add(buttonSetSet);
		
		JPanel panelSetTop = new JPanel();
		panelSetTop.setBackground(new Color(255, 153, 0));
		panelSetTop.setBounds(124, 0, 645, 75);
		panelSettings.add(panelSetTop);
		panelSetTop.setLayout(null);
		
		JTextPane textPane_4 = new JTextPane();
		textPane_4.setBounds(487, 11, 148, 53);
		panelSetTop.add(textPane_4);
		
		JPanel panelSetCont = new JPanel();
		panelSetCont.setBackground(Color.WHITE);
		panelSetCont.setBounds(187, 139, 549, 397);
		panelSettings.add(panelSetCont);
		panelSetCont.setLayout(null);
		
		JLabel lblInstellingen = new JLabel("Instellingen");
		lblInstellingen.setFont(new Font("Arial", Font.BOLD, 11));
		lblInstellingen.setBounds(10, 11, 113, 25);
		panelSetCont.add(lblInstellingen);
		
		JLabel lblVoornaam = new JLabel("Voornaam");
		lblVoornaam.setBounds(10, 47, 66, 25);
		panelSetCont.add(lblVoornaam);
		
		JLabel lblAchternaam = new JLabel("Achternaam\r\n");
		lblAchternaam.setBounds(10, 83, 66, 25);
		panelSetCont.add(lblAchternaam);
		
		JLabel lblFunctie = new JLabel("Functie\r\n");
		lblFunctie.setBounds(266, 47, 66, 25);
		panelSetCont.add(lblFunctie);
		
		JLabel label_3 = new JLabel("Voornaam");
		label_3.setBounds(266, 83, 66, 25);
		panelSetCont.add(label_3);
		
		JTextPane textPane = new JTextPane();
		textPane.setBackground(new Color(255, 153, 0));
		textPane.setBounds(86, 47, 151, 25);
		panelSetCont.add(textPane);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBackground(new Color(255, 153, 0));
		textPane_1.setBounds(86, 83, 151, 25);
		panelSetCont.add(textPane_1);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setBackground(new Color(255, 153, 0));
		textPane_2.setBounds(342, 47, 151, 25);
		panelSetCont.add(textPane_2);
		
		JTextPane textPane_3 = new JTextPane();
		textPane_3.setBackground(new Color(255, 153, 0));
		textPane_3.setBounds(342, 83, 151, 25);
		panelSetCont.add(textPane_3);
		
		JLabel lblTraject = new JLabel("Traject:\r\n");
		lblTraject.setBounds(10, 147, 66, 25);
		panelSetCont.add(lblTraject);
		
		JLabel lblMeldingen = new JLabel("Meldingen\r\n");
		lblMeldingen.setBounds(266, 147, 66, 25);
		panelSetCont.add(lblMeldingen);
		
		Choice choice = new Choice();
		choice.setBounds(86, 152, 151, 25);
		panelSetCont.add(choice);
		
		Choice choice_1 = new Choice();
		choice_1.setBounds(338, 152, 151, 20);
		panelSetCont.add(choice_1);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 259, 483, 102);
		panelSetCont.add(tabbedPane);
		
		JTabbedPane tabbedPane_ma = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("Ma\r\n\r\n\r\n\r\n\r\n", null, tabbedPane_ma, null);
		
		JTabbedPane tabbedPane_di = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("Di", null, tabbedPane_di, null);
		
		JTabbedPane tabbedPane_Wo = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("Wo", null, tabbedPane_Wo, null);
		
		JTabbedPane tabbedPane_Do = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("Do", null, tabbedPane_Do, null);
		
		JTabbedPane tabbedPane_vrij = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("Vrij", null, tabbedPane_vrij, null);
		
		JTabbedPane tabbedPane_Za = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("Za\r\n", null, tabbedPane_Za, null);
		
		JTabbedPane tabbedPane_zo = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("Zo", null, tabbedPane_zo, null);
	}
}
