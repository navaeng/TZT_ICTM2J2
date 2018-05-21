package me.ictm2j.tzt;

import javax.swing.JPanel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.protocol.Resultset;
import java.awt.Rectangle;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class TZTcourierKeygen extends JPanel {
	
	private int keygenID = 1;
	
	public static void main(String[] args) {
		Connection.openConnection();
		TZTcourierDashboard frame = new TZTcourierDashboard();
		frame.setVisible(true);
		System.out.println("Ik ben main");
		new TZTcourierKeygen();
	}
	
	private final JLabel lblNewLabel = new JLabel("New label");

	/**
	 * Create the panel.
	 */
	public TZTcourierKeygen() {
		setBackground(Color.LIGHT_GRAY);
		setBounds(new Rectangle(10, 11, 452, 291));
		setLayout(null);
		
		JButton btnGenereerKey = new JButton("Genereer Key");
		btnGenereerKey.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					PreparedStatement key = Connection.connection.prepareStatement("SELECT generatedKey FROM Keygen WHERE keygenID = " +keygenID);
					key.executeQuery();
					
					ResultSet result = key.getResultSet();
					
					result.next();
					
					System.out.println(result.getInt("generatedKey"));
					lblNewLabel.setVisible(true);
					lblNewLabel.setText(String.valueOf(result.getInt("generatedKey")));
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					System.out.println("oeps");
					e1.printStackTrace();
				}
				
				
				
			}
		});
		btnGenereerKey.setBounds(147, 93, 149, 52);
		add(btnGenereerKey);
		lblNewLabel.setBounds(157, 158, 126, 36);
		add(lblNewLabel);
		this.setVisible(true);

	}
}
