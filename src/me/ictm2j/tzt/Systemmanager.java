package me.ictm2j.tzt;

import java.sql.PreparedStatement;

public class Systemmanager implements Employee {
	
	private int username;
	private String name;

	public Systemmanager(int userid, String name, String password) {
		this.username = userid;
		this.name = name;
		try {
			String originalPassword = password;

			String generatedSecuredPasswordHash = HelperMethods.generateStorngPasswordHash(originalPassword);
			
			int userID = HelperMethods.generateUserID(8);
			
			this.username = userID;
			
			PreparedStatement newUser = Connection.connection.prepareStatement("INSERT INTO Userdata values('" + userID + "','" + name + "', '" + generatedSecuredPasswordHash + "','" + this.toString() + "');");

			newUser.execute();
			newUser.close();
			
			System.out.println("Added Systemmanager with userID: " + userID + ".");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public Systemmanager(int userid, String name) {
		this.name = name;
		this.username = userid;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public int getUserName() {
		return this.username;
	}
	
	public String toString() {
		return "Systeembeheerder";
	}
}
