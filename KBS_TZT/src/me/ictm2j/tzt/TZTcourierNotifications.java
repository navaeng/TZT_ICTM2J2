package me.ictm2j.tzt;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Button;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import java.awt.Choice;
import javax.swing.JTabbedPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TZTcourierNotifications extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TZTcourierNotifications frame = new TZTcourierNotifications();
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
	public TZTcourierNotifications() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 788, 648);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 769, 607);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(51, 51, 51));
		panel_1.setBounds(0, 0, 125, 607);
		panel.add(panel_1);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\natha\\OneDrive\\Afbeeldingen\\TZT.png"));
		label.setBackground(Color.WHITE);
		label.setBounds(10, 11, 87, 41);
		panel_1.add(label);
		
		Button buttonDasMel = new Button("Dashboard");
		buttonDasMel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(false);
				new TZTcourierDashboard().setVisible(true);
			}
		});
		buttonDasMel.setForeground(new Color(255, 153, 0));
		buttonDasMel.setFont(new Font("Arial", Font.BOLD, 12));
		buttonDasMel.setBackground(new Color(51, 51, 51));
		buttonDasMel.setBounds(0, 138, 125, 54);
		panel_1.add(buttonDasMel);
		
		Button buttonLevMel = new Button("Leveringen");
		buttonLevMel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(false);
				new TZTcourierDelivery().setVisible(true);
				
			}
		});
		buttonLevMel.setForeground(new Color(255, 153, 0));
		buttonLevMel.setFont(new Font("Arial", Font.BOLD, 12));
		buttonLevMel.setBackground(new Color(51, 51, 51));
		buttonLevMel.setBounds(0, 198, 125, 54);
		panel_1.add(buttonLevMel);
		
		Button buttonMelMel = new Button("Meldingen");
		buttonMelMel.setForeground(Color.BLACK);
		buttonMelMel.setFont(new Font("Arial", Font.BOLD, 12));
		buttonMelMel.setBackground(new Color(255, 153, 0));
		buttonMelMel.setBounds(0, 258, 125, 54);
		panel_1.add(buttonMelMel);
		
		Button buttonSetMel = new Button("Instellingen");
		buttonSetMel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(false);
				new TZTcourierSettings().setVisible(true);
			}
		});
		buttonSetMel.setForeground(new Color(255, 153, 0));
		buttonSetMel.setFont(new Font("Arial", Font.BOLD, 12));
		buttonSetMel.setBackground(new Color(51, 51, 51));
		buttonSetMel.setActionCommand("Meldingen\r\n");
		buttonSetMel.setBounds(0, 318, 125, 54);
		panel_1.add(buttonSetMel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 153, 0));
		panel_2.setBounds(124, 0, 645, 75);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setBounds(487, 11, 148, 53);
		panel_2.add(textPane_2);
		
		JPanel panelJouwTraject = new JPanel();
		panelJouwTraject.setLayout(null);
		panelJouwTraject.setBackground(Color.WHITE);
		panelJouwTraject.setBounds(187, 139, 549, 196);
		panel.add(panelJouwTraject);
		
		JLabel lblJouwTraject = new JLabel("Jouw traject:");
		lblJouwTraject.setBounds(10, 11, 117, 25);
		panelJouwTraject.add(lblJouwTraject);
		
		JTextPane textPane = new JTextPane();
		textPane.setBackground(new Color(255, 153, 0));
		textPane.setBounds(10, 47, 529, 138);
		panelJouwTraject.add(textPane);
		
		JPanel panelPriveMeldingen = new JPanel();
		panelPriveMeldingen.setLayout(null);
		panelPriveMeldingen.setBackground(Color.WHITE);
		panelPriveMeldingen.setBounds(187, 356, 549, 196);
		panel.add(panelPriveMeldingen);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBackground(new Color(255, 153, 0));
		textPane_1.setBounds(10, 47, 529, 138);
		panelPriveMeldingen.add(textPane_1);
		
		JLabel lblPrivMeldingen = new JLabel("Priv\u00E9 meldingen");
		lblPrivMeldingen.setBounds(10, 11, 149, 25);
		panelPriveMeldingen.add(lblPrivMeldingen);
	}

}
