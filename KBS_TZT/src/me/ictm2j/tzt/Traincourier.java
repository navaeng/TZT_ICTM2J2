package me.ictm2j.tzt;

import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Traincourier implements Courier {

	private String route;
	private int username;
	private String name;

	public Traincourier(int userid, String name, String password, Route route) {
		
		this.name = name;
		this.username = userid;
		
		try {
			String originalPassword = password;

			String generatedSecuredPasswordHash = HelperMethods.generateStorngPasswordHash(originalPassword);
			
			int userID = HelperMethods.generateUserID(8);
			
			this.username = userID;
			
			PreparedStatement newUser = Connection.connection.prepareStatement("INSERT INTO Userdata values('" + userID + "','" + name + "', '" + generatedSecuredPasswordHash + "','" + this.toString() + "');");

			newUser.execute();
			newUser.close();
			
			System.out.println("Added Traincourier with userID: " + userID + ".");

		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (InvalidKeySpecException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public Traincourier(int userid, String name, Route route) {
		
		this.name = name;
		this.username = userid;
		
	}
	
	public String getRoute() {
		return this.route;
	}

	public String toString() {
		return "Treinkoerier";
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public int getUserName() {
		return this.username;
	}
}
