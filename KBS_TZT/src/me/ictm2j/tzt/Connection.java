package me.ictm2j.tzt;

import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Connection {

	public static java.sql.Connection connection;

	public static boolean isConnected = false;
	
	public synchronized static void openConnection() {
		try{
			String host = "bluebearmedia.nl";
			String database = "skaaft_tzt";
			String username = "skaaft_ictm2j";
			String password = "ICTm2jTZT";

			connection = DriverManager.getConnection("jdbc:mysql://" + host + "/" + database, username, password);
			
			createTables();

			isConnected = true;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public synchronized static void createTables() {
		try{

		}catch(Exception e){
			e.printStackTrace();
		}
	}

	public synchronized static void closeConnection() {
		try{
			connection.close();

		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
