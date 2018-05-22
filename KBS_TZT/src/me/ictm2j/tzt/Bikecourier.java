package me.ictm2j.tzt;

import java.sql.PreparedStatement;

public class Bikecourier implements Courier {
	
	private String route;
	private int username;
	private String name;

	public Bikecourier(int userid, String name, String password, Route route) {
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
			
			System.out.println("Added Bikecourier with userID: " + userID + ".");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public Bikecourier(int userid, String name, Route route) {
		this.name = name;
		this.username = userid;
	}
	
	public String getRoute() {
		return this.route;
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
		return "Fietskoerier";
	}
}
