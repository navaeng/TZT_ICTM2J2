package me.ictm2j.tzt;

import javax.swing.JPanel;
import java.awt.Rectangle;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Choice;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class AdminAddRoute extends JPanel implements ActionListener{
	private JTextField textFieldBeginadres;
	private JTextField textFieldEindadres;
	private JTextField textFieldBeginStation;
	private JTextField textFieldEindStation;

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
		
		textFieldBeginStation = new JTextField();
		textFieldBeginStation.setColumns(10);
		textFieldBeginStation.setBounds(187, 97, 205, 25);
		add(textFieldBeginStation);
		
		textFieldEindStation = new JTextField();
		textFieldEindStation.setColumns(10);
		textFieldEindStation.setBounds(187, 133, 205, 25);
		add(textFieldEindStation);

		textFieldEindadres = new JTextField();
		textFieldEindadres.setColumns(10);
		textFieldEindadres.setBounds(187, 167, 205, 25);
		add(textFieldEindadres);
		
		JButton btnNewButtonRouteToevoegen = new JButton("Toevoegen");
		btnNewButtonRouteToevoegen.addActionListener(this);
		btnNewButtonRouteToevoegen.setBounds(187, 203, 205, 31);
		add(btnNewButtonRouteToevoegen);
		

	}
	public void actionPerformed(ActionEvent e) {
		try {
			String strba=textFieldBeginadres.getText();
			String strbs=textFieldBeginStation.getText();
			String stres=textFieldEindStation.getText();
			String strea=textFieldEindadres.getText();
								
			Statement s=Connection.connection.createStatement();
			
				
				s.execute("INSERT INTO Route (startAdress,startStation,endStation,endAdress)VALUES('"+ strba + "' , '"+ strbs + "', '" + stres + "','" + strea +"')");
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}	
		//sluit addroute
		//open adddelivery
	}
	
}
