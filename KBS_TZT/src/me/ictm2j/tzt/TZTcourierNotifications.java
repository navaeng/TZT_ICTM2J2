package me.ictm2j.tzt;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JLabel;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TZTcourierNotifications extends JFrame implements ActionListener {
	
	protected JPanel navPanel;
	protected JPanel centerPanel;
	
	/**
	 * Create the frame.
	 */
	public TZTcourierNotifications() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 785, 646);

		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\natha\\OneDrive\\Afbeeldingen\\TZT.png"));
		label.setBackground(Color.WHITE);
		label.setBounds(10, 11, 87, 41);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(487, 11, 148, 53);
		
		navPanel = new JPanel();
		navPanel.setBounds(0, 0, 125, 607);
		navPanel.setLayout(null);
		navPanel.setBackground(new Color(51, 51, 51));

		Button buttonDasMel = new Button("Dashboard");
		buttonDasMel.addActionListener(this);
		buttonDasMel.setForeground(new Color(255, 153, 0));
		buttonDasMel.setFont(new Font("Arial", Font.BOLD, 12));
		buttonDasMel.setBackground(new Color(51, 51, 51));
		buttonDasMel.setBounds(0, 138, 125, 54);
		navPanel.add(buttonDasMel);
		
		Button buttonLevMel = new Button("Leveringen");
		buttonLevMel.addActionListener(this);
		buttonLevMel.setForeground(new Color(255, 153, 0));
		buttonLevMel.setFont(new Font("Arial", Font.BOLD, 12));
		buttonLevMel.setBackground(new Color(51, 51, 51));
		buttonLevMel.setBounds(0, 198, 125, 54);
		navPanel.add(buttonLevMel);
		
		Button buttonMelMel = new Button("Meldingen");
		buttonMelMel.setForeground(Color.BLACK);
		buttonMelMel.setFont(new Font("Arial", Font.BOLD, 12));
		buttonMelMel.setBackground(new Color(255, 153, 0));
		buttonMelMel.setBounds(0, 258, 125, 54);
		navPanel.add(buttonMelMel);
		
		Button buttonSetMel = new Button("Instellingen");
		buttonSetMel.addActionListener(this);
		buttonSetMel.setForeground(new Color(255, 153, 0));
		buttonSetMel.setFont(new Font("Arial", Font.BOLD, 12));
		buttonSetMel.setBackground(new Color(51, 51, 51));
		buttonSetMel.setActionCommand("Meldingen\r\n");
		buttonSetMel.setBounds(0, 318, 125, 54);
		navPanel.add(buttonSetMel);

		
		centerPanel = new JPanel();
		centerPanel.setBounds(125, 75, 642, 524);
		centerPanel.setBackground(Color.white);
		centerPanel.setBorder(new LineBorder(Color.green, 5));

		JPanel panelJouwTraject = new JPanel();
		panelJouwTraject.setBackground(new Color(255, 153, 0));
		panelJouwTraject.setBorder(new LineBorder(Color.red));
		panelJouwTraject.setBounds(50, 50, 500, 100);
		centerPanel.add(panelJouwTraject);
		
		JLabel lblJouwTraject = new JLabel("Jouw traject:");
		lblJouwTraject.setBounds(10, 11, 117, 25);
		panelJouwTraject.add(lblJouwTraject);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setBackground(new Color(255, 153, 0));
		textPane_2.setBounds(10, 47, 300, 108);
		panelJouwTraject.add(textPane_2);
		
		JPanel panelPriveMeldingen = new JPanel();
		panelPriveMeldingen.setBackground(new Color(255, 153, 0));
		panelPriveMeldingen.setBounds(187, 356, 549, 196);
		centerPanel.add(panelPriveMeldingen);
		
		JLabel lblPrivMeldingen = new JLabel("Priv\u00E9 meldingen");
		lblPrivMeldingen.setBounds(10, 11, 149, 25);
		panelPriveMeldingen.add(lblPrivMeldingen);
		
		JTextPane textPane_3 = new JTextPane();
		textPane_3.setBackground(new Color(255, 153, 0));
		textPane_3.setBounds(10, 47, 300, 108);
		panelPriveMeldingen.add(textPane_3);

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
	}

}
