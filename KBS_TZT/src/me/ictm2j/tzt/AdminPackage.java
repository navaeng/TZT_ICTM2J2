package me.ictm2j.tzt;

import javax.swing.JPanel;
import java.awt.Rectangle;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class AdminPackage extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Create the panel.
	 */
	public AdminPackage() {
		setBounds(new Rectangle(10, 11, 452, 291));
		setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(100, 48, 110, 20);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(100, 79, 110, 20);
		add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(100, 110, 110, 20);
		add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(100, 141, 110, 20);
		add(textField_3);
		
		JLabel lblLengte = new JLabel("Lengte");
		lblLengte.setBounds(10, 48, 59, 20);
		add(lblLengte);
		
		JLabel lblBreedte = new JLabel("Breedte");
		lblBreedte.setBounds(10, 82, 59, 20);
		add(lblBreedte);
		
		JLabel lblHoogte = new JLabel("Hoogte");
		lblHoogte.setBounds(10, 110, 59, 20);
		add(lblHoogte);
		
		JLabel lblGewicht = new JLabel("Gewicht");
		lblGewicht.setBounds(10, 141, 59, 20);
		add(lblGewicht);
		
		JLabel lblCm = new JLabel("CM");
		lblCm.setBounds(220, 113, 59, 20);
		add(lblCm);
		
		JLabel lblKg = new JLabel("KG");
		lblKg.setBounds(220, 144, 59, 20);
		add(lblKg);
		
		JLabel label = new JLabel("CM");
		label.setBounds(220, 82, 59, 20);
		add(label);
		
		JLabel label_1 = new JLabel("CM");
		label_1.setBounds(220, 48, 59, 20);
		add(label_1);
		
		JLabel lblPakket = new JLabel("Pakket");
		lblPakket.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblPakket.setBounds(10, 11, 72, 26);
		add(lblPakket);
		
		JButton btnNewButton = new JButton("Pakket toevoegen");
		btnNewButton.setBounds(101, 201, 138, 26);
		add(btnNewButton);

	}
}
