package me.ictm2j.tzt;

import javax.swing.JPanel;
import java.awt.Rectangle;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

public class AdminAddDelivery extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Create the panel.
	 */
	public AdminAddDelivery() {
		setBounds(new Rectangle(10, 1, 452, 291));
		setLayout(null);
		
		JList listPakketjes = new JList();
		listPakketjes.setBounds(10, 47, 135, 197);
		add(listPakketjes);
		
		JButton btnNewButtonAddPakketjes = new JButton("Toevoegen");
		btnNewButtonAddPakketjes.setBounds(10, 255, 135, 25);
		add(btnNewButtonAddPakketjes);
		
		JLabel lblLeveringSamenstellen = new JLabel("Levering samenstellen");
		lblLeveringSamenstellen.setFont(new Font("Arial", Font.BOLD, 11));
		lblLeveringSamenstellen.setBounds(10, 11, 135, 25);
		add(lblLeveringSamenstellen);
		
		JLabel lblDeliveryId = new JLabel("Delivery ID");
		lblDeliveryId.setBounds(192, 55, 62, 25);
		add(lblDeliveryId);
		
		JLabel lblUserId = new JLabel("User ID");
		lblUserId.setBounds(192, 91, 62, 25);
		add(lblUserId);
		
		JLabel lblPackageId = new JLabel("Package ID");
		lblPackageId.setBounds(192, 127, 62, 25);
		add(lblPackageId);
		
		JLabel lblLockerId = new JLabel("Locker ID");
		lblLockerId.setBounds(192, 163, 62, 25);
		add(lblLockerId);
		
		JLabel lblRouteId = new JLabel("Route ID");
		lblRouteId.setBounds(192, 199, 62, 25);
		add(lblRouteId);
		
		JLabel lblDatumId = new JLabel("Datum ID");
		lblDatumId.setBounds(192, 235, 62, 25);
		add(lblDatumId);
		
		textField = new JTextField();
		textField.setBounds(264, 57, 86, 20);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(264, 93, 86, 20);
		add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(264, 129, 86, 20);
		add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(264, 165, 86, 20);
		add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(264, 201, 86, 20);
		add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(264, 237, 86, 20);
		add(textField_5);

	}
}
