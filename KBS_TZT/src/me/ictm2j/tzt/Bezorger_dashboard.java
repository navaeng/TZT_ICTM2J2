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

public class Bezorger_dashboard extends JFrame {

	private JPanel contentPane;

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
		
		Panel panel = new Panel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(426, 146, 128, 123);
		contentPane.add(panel);
		
		Panel panel_1 = new Panel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(607, 146, 128, 123);
		contentPane.add(panel_1);
		
		Panel panel_2 = new Panel();
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setBounds(245, 146, 128, 123);
		contentPane.add(panel_2);
		
		Panel panel_3 = new Panel();
		panel_3.setBackground(new Color(255, 255, 255));
		panel_3.setBounds(245, 304, 128, 63);
		contentPane.add(panel_3);
		
		Panel panel_4 = new Panel();
		panel_4.setBackground(new Color(255, 255, 255));
		panel_4.setBounds(426, 304, 128, 63);
		contentPane.add(panel_4);
		
		Panel panel_5 = new Panel();
		panel_5.setBackground(new Color(255, 255, 255));
		panel_5.setBounds(607, 304, 128, 63);
		contentPane.add(panel_5);
		
		Panel panel_6 = new Panel();
		panel_6.setBackground(new Color(255, 255, 255));
		panel_6.setBounds(245, 399, 309, 123);
		contentPane.add(panel_6);
		
		Panel panel_7 = new Panel();
		panel_7.setBackground(new Color(255, 255, 255));
		panel_7.setBounds(607, 399, 128, 123);
		contentPane.add(panel_7);
		
		Panel panel_8 = new Panel();
		panel_8.setBackground(new Color(51, 51, 51));
		panel_8.setBounds(0, 69, 178, 547);
		contentPane.add(panel_8);
		panel_8.setLayout(null);
		
		Button button_1 = new Button("Melding\r\nen");
		button_1.setForeground(new Color(255, 153, 51));
		button_1.setFont(new Font("Arial", Font.BOLD, 12));
		button_1.setBackground(new Color(51, 51, 51));
		button_1.setBounds(0, 151, 178, 52);
		panel_8.add(button_1);
		
		Button button_2 = new Button("Levering");
		button_2.setFont(new Font("Arial", Font.BOLD, 12));
		button_2.setForeground(new Color(255, 153, 51));
		button_2.setBackground(new Color(51, 51, 51));
		button_2.setBounds(0, 93, 178, 52);
		panel_8.add(button_2);
		
		Button button_3 = new Button("Dashboard");
		button_3.setFont(new Font("Arial", Font.PLAIN, 12));
		button_3.setBackground(new Color(255, 153, 51));
		button_3.setBounds(0, 35, 178, 52);
		panel_8.add(button_3);
		
		Button button = new Button("Instellingen");
		button.setForeground(new Color(255, 153, 51));
		button.setFont(new Font("Arial", Font.BOLD, 12));
		button.setBackground(new Color(51, 51, 51));
		button.setBounds(0, 209, 178, 52);
		panel_8.add(button);
		
		Panel panel_9 = new Panel();
		panel_9.setBackground(new Color(255, 153, 0));
		panel_9.setBounds(0, 0, 769, 69);
		contentPane.add(panel_9);
		panel_9.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setBounds(10, 11, 104, 47);
		panel_9.add(lblNewLabel);
	}
}
