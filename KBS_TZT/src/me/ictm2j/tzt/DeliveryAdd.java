package me.ictm2j.tzt;

import javax.swing.JPanel;
import java.awt.Rectangle;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.border.LineBorder;

public class DeliveryAdd extends JPanel   implements ActionListener{
	private JTextField textFieldDeliveryID;
	private JTextField textFieldUserID;
	private JTextField textFieldLockerID;
	private JTextField textFieldRouteID;
	private JTextField textFieldDatum;
	public static String RBG = GoogleDirectionsAPIConnection.getRBG();
	public static String RBGL = GoogleDirectionsAPIConnection.getRBGL();
	public static String STS = GoogleDirectionsAPIConnection.getSTS();
	public static String STER = GoogleDirectionsAPIConnection.getSTER();
	public static String STERL = GoogleDirectionsAPIConnection.getSTERL();
	private JTextField textFieldpackageID;
	/**
	 * Create the panel.
	 */
	public DeliveryAdd() {
		setBorder(new LineBorder(new Color(0, 0, 0), 2));
		setBackground(Color.WHITE);
		setBounds(new Rectangle(125, 75, 644, 532));
		setLayout(null);
		
		JLabel jlabel = new JLabel(RBG + "\n" +  RBGL +"\n " + STS +"\n " + STER +"\n " + STERL);
		jlabel.setBounds(10, 43, 172, 212);
		jlabel.setBackground(Color.WHITE);
		add(jlabel);
		
		JLabel lblLeveringSamenstellen = new JLabel("Levering samenstellen");
		lblLeveringSamenstellen.setBounds(192, 7, 135, 25);
		lblLeveringSamenstellen.setFont(new Font("Arial", Font.BOLD, 11));
		add(lblLeveringSamenstellen);
		
		JLabel lblDeliveryId = new JLabel("Delivery ID");
		lblDeliveryId.setBounds(192, 43, 62, 25);
		add(lblDeliveryId);
		
		JLabel lblUserId = new JLabel("User ID");
		lblUserId.setBounds(192, 79, 62, 25);
		add(lblUserId);
		
		JLabel lblLockerId = new JLabel("Locker ID");
		lblLockerId.setBounds(192, 115, 62, 25);
		add(lblLockerId);
		
		JLabel lblRouteId = new JLabel("Route ID");
		lblRouteId.setBounds(192, 151, 62, 25);
		add(lblRouteId);
		
		JLabel lblDatumId = new JLabel("Datum");
		lblDatumId.setBounds(192, 187, 62, 25);
		add(lblDatumId);
		
		textFieldDeliveryID = new JTextField();
		textFieldDeliveryID.setBounds(264, 45, 86, 20);
		add(textFieldDeliveryID);
		textFieldDeliveryID.setColumns(10);
		
		textFieldUserID = new JTextField();
		textFieldUserID.setBounds(264, 81, 86, 20);
		textFieldUserID.setColumns(10);
		add(textFieldUserID);
		
		textFieldLockerID = new JTextField();
		textFieldLockerID.setBounds(264, 117, 86, 20);
		textFieldLockerID.setColumns(10);
		add(textFieldLockerID);
		
		textFieldRouteID = new JTextField();
		textFieldRouteID.setBounds(264, 153, 86, 20);
		textFieldRouteID.setColumns(10);
		add(textFieldRouteID);
		
		textFieldDatum = new JTextField();
		textFieldDatum.setBounds(264, 189, 86, 20);
		textFieldDatum.setColumns(10);
		add(textFieldDatum);
		
		JButton buttonSamenstellen = new JButton("Samenstellen");
		buttonSamenstellen.setBounds(192, 255, 158, 25);
		buttonSamenstellen.addActionListener(this);
		add(buttonSamenstellen);
		
		
		JButton btnOphalen = new JButton("Ophalen");
		btnOphalen.setBounds(10, 256, 172, 25);
		add(btnOphalen);
		
		JLabel lblPackageid = new JLabel("packageID");
		lblPackageid.setBounds(192, 223, 62, 25);
		add(lblPackageid);
		
		textFieldpackageID = new JTextField();
		textFieldpackageID.setColumns(10);
		textFieldpackageID.setBounds(264, 220, 86, 20);
		add(textFieldpackageID);
		
		JLabel lblRouteEnPrijs = new JLabel("Route en Prijs");
		lblRouteEnPrijs.setFont(new Font("Arial", Font.BOLD, 11));
		lblRouteEnPrijs.setBounds(10, 7, 135, 25);
		add(lblRouteEnPrijs);

	}

	public void actionPerformed(ActionEvent e) {
		try {
			String strd=textFieldDeliveryID.getText();
			String stru=textFieldUserID.getText();
			String strl=textFieldLockerID.getText();
			String strda=textFieldDatum.getText();
								
			Statement s=Connection.connection.createStatement();
			
				
				s.execute("INSERT INTO Package (deliveryID,userID,packageID,lockerID,routeID,date)VALUES('"+ strd + "' , '"+ stru + "', '" + strl + "','" + strda +"')");
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}	
	}
}
