package me.ictm2j.tzt;

import javax.swing.JPanel;
import java.awt.Rectangle;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Choice;
import javax.swing.JButton;

public class AdminAddRoute extends JPanel {
	private JTextField textFieldBeginadres;
	private JTextField textFieldEindadres;

	/**
	 * Create the panel.
	 */
	public AdminAddRoute() {
		setBounds(new Rectangle(10, 11, 452, 291));
		setLayout(null);
		
		JLabel lblLeveringRoute = new JLabel("Levering route");
		lblLeveringRoute.setFont(new Font("Arial", Font.BOLD, 11));
		lblLeveringRoute.setBounds(10, 11, 123, 25);
		add(lblLeveringRoute);
		
		JLabel lblBeginpunt = new JLabel("Begin adres");
		lblBeginpunt.setBounds(10, 59, 123, 25);
		add(lblBeginpunt);
		
		JLabel lblBeginStation = new JLabel("Begin station");
		lblBeginStation.setBounds(10, 95, 123, 25);
		add(lblBeginStation);
		
		JLabel lblEindStation = new JLabel("Eind station");
		lblEindStation.setBounds(10, 131, 123, 25);
		add(lblEindStation);
		
		JLabel lblAfleverAdres = new JLabel("Aflever adres");
		lblAfleverAdres.setBounds(10, 167, 123, 25);
		add(lblAfleverAdres);
		
		textFieldBeginadres = new JTextField();
		textFieldBeginadres.setColumns(10);
		textFieldBeginadres.setBounds(187, 59, 205, 25);
		add(textFieldBeginadres);
		
		textFieldEindadres = new JTextField();
		textFieldEindadres.setColumns(10);
		textFieldEindadres.setBounds(187, 167, 205, 25);
		add(textFieldEindadres);
		
		Choice choiceBeginStation = new Choice();
		choiceBeginStation.setBounds(187, 95, 205, 25);
		add(choiceBeginStation);
		
		Choice choiceEindstation = new Choice();
		choiceEindstation.setBounds(187, 131, 205, 20);
		add(choiceEindstation);
		
		JButton btnNewButtonRouteToevoegen = new JButton("Toevoegen");
		btnNewButtonRouteToevoegen.setBounds(187, 203, 205, 31);
		add(btnNewButtonRouteToevoegen);

	}
}
