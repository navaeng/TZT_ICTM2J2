package me.ictm2j.tzt;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Button;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TZTcourierLogin extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TZTcourierLogin frame = new TZTcourierLogin();
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
	public TZTcourierLogin() {
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
		
		Button button = new Button("Login");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(false);
				new TZTcourierDashboard().setVisible(true);
			}
		});
		button.setFont(new Font("Arial Black", Font.BOLD, 16));
		button.setBackground(new Color(255, 153, 0));
		button.setBounds(215, 227, 112, 43);
		panel.add(button);
		
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
	}

}
