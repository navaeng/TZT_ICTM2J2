package me.ictm2j.tzt;

import java.sql.*;
import me.ictm2j.tzt.Connection;

public class OverviewEmployees {
	public void main(String[]args) {
		try {
			// making the query
			String query = "SELECT * FROM Userdata";
			// Creating JAVA statement
			Statement statement = Connection.connection.createStatement();
			// Executing query and getting a JAVA resultset
			ResultSet result = statement.executeQuery(query);
			// For each result, printing out result and making a new line if there is more data to be retrieved
			while (result.next())
		      {
				// get data by colum name
		        int userid = result.getInt("userid");
		        String name = result.getString("name");
		        // print the results
		        System.out.format("%s, %s\n", userid,  name);
		      }
		      statement.close();			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}


