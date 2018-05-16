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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TZTcourierDashboard extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TZTcourierDashboard frame = new TZTcourierDashboard();
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
	public TZTcourierDashboard() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 785, 646);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 769, 607);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 125, 607);
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(51, 51, 51));
		panel.add(panel_1);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\natha\\OneDrive\\Afbeeldingen\\TZT.png"));
		label.setBackground(Color.WHITE);
		label.setBounds(10, 11, 87, 41);
		panel_1.add(label);
		
		Button buttonMelDash = new Button("Meldingen");
		buttonMelDash.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(false);
				new TZTcourierNotifications().setVisible(true);
			}
		});
		buttonMelDash.setForeground(new Color(255, 153, 0));
		buttonMelDash.setFont(new Font("Arial", Font.BOLD, 12));
		buttonMelDash.setBackground(new Color(51, 51, 51));
		buttonMelDash.setBounds(0, 258, 125, 54);
		panel_1.add(buttonMelDash);
		
		Button buttonLevDash = new Button("Leveringen");
		buttonLevDash.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(false);
				new TZTcourierDelivery().setVisible(true);
			}
		});
		buttonLevDash.setForeground(new Color(255, 153, 0));
		buttonLevDash.setFont(new Font("Arial", Font.BOLD, 12));
		buttonLevDash.setBackground(new Color(51, 51, 51));
		buttonLevDash.setBounds(0, 198, 125, 54);
		panel_1.add(buttonLevDash);
		
		Button buttonDashDash = new Button("Dashboard\r\n");
		buttonDashDash.setForeground(Color.BLACK);
		buttonDashDash.setFont(new Font("Arial", Font.BOLD, 12));
		buttonDashDash.setBackground(new Color(255, 153, 0));
		buttonDashDash.setBounds(0, 138, 125, 54);
		panel_1.add(buttonDashDash);
		
		Button buttonSetDash = new Button("Instellingen");
		buttonSetDash.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(false);
				new TZTcourierSettings().setVisible(true);
			}
		});
		buttonSetDash.setForeground(new Color(255, 153, 0));
		buttonSetDash.setFont(new Font("Arial", Font.BOLD, 12));
		buttonSetDash.setBackground(new Color(51, 51, 51));
		buttonSetDash.setActionCommand("Meldingen\r\n");
		buttonSetDash.setBounds(0, 318, 125, 54);
		panel_1.add(buttonSetDash);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(124, 0, 645, 75);
		panel_2.setLayout(null);
		panel_2.setBackground(new Color(255, 153, 0));
		panel.add(panel_2);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(487, 11, 148, 53);
		panel_2.add(textPane);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(204, 141, 125, 125);
		panel.add(panel_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(358, 141, 125, 125);
		panel.add(panel_4);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(516, 141, 125, 125);
		panel.add(panel_5);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(204, 293, 279, 125);
		panel.add(panel_6);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBounds(516, 293, 125, 125);
		panel.add(panel_7);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBounds(204, 441, 437, 90);
		panel.add(panel_8);
	}

}
