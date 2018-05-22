package me.ictm2j.tzt;

import java.sql.PreparedStatement;

public class Delivery {

	private int delivery_id;
	private int userID;
	private int packageID;
	private int routeID;
	private int safe;
	private String datum;
	private String comment;
	private String status;



	public Delivery(int delivery_id, int userID, int packageID, int safe, int routeID , String datum, String comment, String status) {
		this.delivery_id = delivery_id;
		this.userID = userID;
		this.packageID = packageID;
		this.routeID = routeID;
		this.safe = safe;
		this.datum = datum;

		try {
			PreparedStatement query = Connection.connection.prepareStatement("INSERT INTO Delivery VALUES(" + delivery_id + "," + userID + "," + packageID + "," + safe + "," + routeID + ",'" + datum + "','" + comment + "','" + status + "');");
			query.execute();
			query.close();

			System.out.println("Added new delivery.");
		} catch (Exception E) {
			E.printStackTrace();
		}

	}
	public int getDelivery_id() {
		return this.delivery_id;
	}
	public int getUser() {
		return this.userID;
	}
	public int getPackage() {
		return this.packageID;
	}
	public int GetRoute() {
		return this.routeID;
	}
	public int getSafe() {
		return this.safe;
	}
	public String getDatum() {
		return this.datum;
	}
	public String getComment() {
		return this.comment;
	}
	public String getStatus() {
		return this.status;
	}


}



