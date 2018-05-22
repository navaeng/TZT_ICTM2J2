package me.ictm2j.tzt;

import javax.swing.JPanel;
import java.awt.Rectangle;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.SpringLayout;
import java.awt.BorderLayout;

public class RouteAdd extends JPanel implements ActionListener{
	private JTextField textFieldBeginadres;
	private JTextField textFieldEindadres;
	private JTextField textFieldBeginStation;
	private JTextField textFieldEindStation;
	public JLabel lblNewLabel;
	public static String steers;
	public static String sters;
	public static String steis;
	public static String sties;


	/**
	 * Create the panel.
	 */
	public RouteAdd() {
		setBackground(Color.WHITE);
		setBorder(new LineBorder(new Color(0, 0, 0), 2));
		setBounds(new Rectangle(125, 75, 644, 532));
		setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 523, 402);
		panel.setBackground(Color.WHITE);
		add(panel);
		panel.setLayout(null);

		JLabel lblLeveringRoute = new JLabel("Levering route");
		lblLeveringRoute.setBounds(10, 11, 82, 14);
		panel.add(lblLeveringRoute);
		lblLeveringRoute.setFont(new Font("Arial", Font.BOLD, 11));

		JLabel lblBeginpunt = new JLabel("Begin adres");
		lblBeginpunt.setBounds(10, 39, 56, 14);
		panel.add(lblBeginpunt);

		JLabel lblBeginStation = new JLabel("Begin station");
		lblBeginStation.setBounds(10, 73, 62, 14);
		panel.add(lblBeginStation);

		JLabel lblEindStation = new JLabel("Eind station");
		lblEindStation.setBounds(10, 101, 56, 14);
		panel.add(lblEindStation);

		JLabel lblAfleverAdres = new JLabel("Aflever adres");
		lblAfleverAdres.setBounds(10, 126, 65, 14);
		panel.add(lblAfleverAdres);

		textFieldBeginadres = new JTextField();
		textFieldBeginadres.setBounds(150, 36, 86, 20);
		panel.add(textFieldBeginadres);
		textFieldBeginadres.setColumns(10);

		textFieldBeginStation = new JTextField();
		textFieldBeginStation.setBounds(150, 67, 86, 20);
		panel.add(textFieldBeginStation);
		textFieldBeginStation.setColumns(10);

		textFieldEindStation = new JTextField();
		textFieldEindStation.setBounds(150, 98, 86, 20);
		panel.add(textFieldEindStation);
		textFieldEindStation.setColumns(10);

		textFieldEindadres = new JTextField();
		textFieldEindadres.setBounds(150, 123, 86, 20);
		panel.add(textFieldEindadres);
		textFieldEindadres.setColumns(10);

		JButton btnNewButtonRouteToevoegen = new JButton("Toevoegen");
		btnNewButtonRouteToevoegen.setBounds(149, 154, 87, 23);
		panel.add(btnNewButtonRouteToevoegen);
		btnNewButtonRouteToevoegen.addActionListener(this);
	}

	public  void actionPerformed(ActionEvent e) {
		try {

			steers = textFieldBeginadres.getText();
			sters = textFieldBeginStation.getText();
			steis = textFieldEindStation.getText();
			sties = textFieldEindadres.getText();

			PreparedStatement query = Connection.connection.prepareStatement("INSERT INTO Route (startAdress,startStation,endStation,endAdress)VALUES('"+ steers + "' , '"+ sters + "', '" + sters + "','" + sties +"')");
			query.execute();
			query.close();


			System.out.println("Route succesvol toegevoegd");
			this.setVisible(false);
			Dashboard.centerPanel.setVisible(true);

		} catch (SQLException e1) {
			e1.printStackTrace();
		}	

	}

}
