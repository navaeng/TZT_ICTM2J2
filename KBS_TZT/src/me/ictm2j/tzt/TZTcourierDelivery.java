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

public class TZTcourierDelivery extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TZTcourierDelivery frame = new TZTcourierDelivery();
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
	public TZTcourierDelivery() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 784, 645);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 769, 607);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(384, 5, 1, 1);
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(51, 51, 51));
		panel.add(panel_1);
		
		JLabel label = new JLabel("");
		label.setBackground(Color.WHITE);
		label.setBounds(10, 11, 87, 41);
		panel_1.add(label);
		
		Button button = new Button("Dashboard");
		button.setForeground(new Color(255, 153, 0));
		button.setFont(new Font("Arial", Font.BOLD, 12));
		button.setBackground(new Color(51, 51, 51));
		button.setBounds(0, 138, 125, 54);
		panel_1.add(button);
		
		Button button_1 = new Button("Leveringen");
		button_1.setForeground(new Color(255, 153, 0));
		button_1.setFont(new Font("Arial", Font.BOLD, 12));
		button_1.setBackground(new Color(51, 51, 51));
		button_1.setBounds(0, 198, 125, 54);
		panel_1.add(button_1);
		
		Button button_2 = new Button("Meldingen");
		button_2.setForeground(Color.BLACK);
		button_2.setFont(new Font("Arial", Font.BOLD, 12));
		button_2.setBackground(new Color(255, 153, 0));
		button_2.setBounds(0, 258, 125, 54);
		panel_1.add(button_2);
		
		Button button_3 = new Button("Instellingen");
		button_3.setForeground(new Color(255, 153, 0));
		button_3.setFont(new Font("Arial", Font.BOLD, 12));
		button_3.setBackground(new Color(51, 51, 51));
		button_3.setActionCommand("Meldingen\r\n");
		button_3.setBounds(0, 318, 125, 54);
		panel_1.add(button_3);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(new Color(51, 51, 51));
		panel_2.setBounds(0, 0, 125, 607);
		panel.add(panel_2);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("C:\\Users\\natha\\OneDrive\\Afbeeldingen\\TZT.png"));
		label_1.setBackground(Color.WHITE);
		label_1.setBounds(10, 11, 87, 41);
		panel_2.add(label_1);
		
		Button buttonDashLev = new Button("Dashboard");
		buttonDashLev.setForeground(new Color(255, 153, 0));
		buttonDashLev.setFont(new Font("Arial", Font.BOLD, 12));
		buttonDashLev.setBackground(new Color(51, 51, 51));
		buttonDashLev.setBounds(0, 138, 125, 54);
		panel_2.add(buttonDashLev);
		
		Button buttonMelLev = new Button("Meldingen\r\n");
		buttonMelLev.setForeground(new Color(255, 153, 0));
		buttonMelLev.setFont(new Font("Arial", Font.BOLD, 12));
		buttonMelLev.setBackground(new Color(51, 51, 51));
		buttonMelLev.setBounds(0, 258, 125, 54);
		panel_2.add(buttonMelLev);
		
		Button buttonLevLev = new Button("Leveringen\r\n");
		buttonLevLev.setForeground(Color.BLACK);
		buttonLevLev.setFont(new Font("Arial", Font.BOLD, 12));
		buttonLevLev.setBackground(new Color(255, 153, 0));
		buttonLevLev.setBounds(0, 198, 125, 54);
		panel_2.add(buttonLevLev);
		
		Button buttonInsLev = new Button("Instellingen");
		buttonInsLev.setForeground(new Color(255, 153, 0));
		buttonInsLev.setFont(new Font("Arial", Font.BOLD, 12));
		buttonInsLev.setBackground(new Color(51, 51, 51));
		buttonInsLev.setActionCommand("Meldingen\r\n");
		buttonInsLev.setBounds(0, 318, 125, 54);
		panel_2.add(buttonInsLev);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 153, 0));
		panel_3.setBounds(124, 0, 645, 75);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(487, 11, 148, 53);
		panel_3.add(textPane);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBackground(Color.WHITE);
		panel_4.setBounds(188, 122, 549, 196);
		panel.add(panel_4);
		
		JLabel lblGeaccepteerd = new JLabel("Geaccepteerd:\r\n");
		lblGeaccepteerd.setBounds(10, 11, 117, 25);
		panel_4.add(lblGeaccepteerd);
		
		JTextPane textPaneGeaccepteerd = new JTextPane();
		textPaneGeaccepteerd.setBackground(new Color(255, 153, 0));
		textPaneGeaccepteerd.setBounds(10, 47, 529, 138);
		panel_4.add(textPaneGeaccepteerd);
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBackground(Color.WHITE);
		panel_5.setBounds(188, 344, 549, 196);
		panel.add(panel_5);
		
		JLabel lblRecentAfgeleverd = new JLabel("Recent afgeleverd:");
		lblRecentAfgeleverd.setBounds(10, 11, 117, 25);
		panel_5.add(lblRecentAfgeleverd);
		
		JTextPane textPaneAfgeleverd = new JTextPane();
		textPaneAfgeleverd.setBackground(new Color(255, 153, 0));
		textPaneAfgeleverd.setBounds(10, 47, 529, 138);
		panel_5.add(textPaneAfgeleverd);
	}

}
