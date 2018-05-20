package me.ictm2j.tzt;

import javax.swing.JPanel;
import java.awt.Rectangle;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class AdminAddDelivery extends JPanel {
	private JTextField textFieldDeliveryID;
	private JTextField textFieldUserID;
	private JTextField textFieldLockerID;
	private JTextField textFieldRouteID;
	private JTextField textFieldDatum;

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
		textFieldUserID.setColumns(10);
		textFieldUserID.setBounds(264, 81, 86, 20);
		add(textFieldUserID);
		
		textFieldLockerID = new JTextField();
		textFieldLockerID.setColumns(10);
		textFieldLockerID.setBounds(264, 117, 86, 20);
		add(textFieldLockerID);
		
		textFieldRouteID = new JTextField();
		textFieldRouteID.setColumns(10);
		textFieldRouteID.setBounds(264, 153, 86, 20);
		add(textFieldRouteID);
		
		textFieldDatum = new JTextField();
		textFieldDatum.setColumns(10);
		textFieldDatum.setBounds(264, 189, 86, 20);
		add(textFieldDatum);
		
		JButton buttonSamenstellen = new JButton("Samenstellen");
		buttonSamenstellen.addActionListener(new ActionListener() {
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
		});
		buttonSamenstellen.setBounds(192, 255, 158, 25);
		add(buttonSamenstellen);

	}
}
