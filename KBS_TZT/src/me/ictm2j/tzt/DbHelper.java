package me.ictm2j.tzt;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DbHelper {

	public static boolean useridExists(int user_id) throws SQLException {
		PreparedStatement selectsql = Connection.connection.prepareStatement("SELECT userID FROM Userdata WHERE userID=" + user_id + ";");
		ResultSet selectresultSet = selectsql.executeQuery();

		return selectresultSet.next();
	}
	
	public static ArrayList<String> getUserdataByUserID(int username) throws SQLException {
		PreparedStatement selectsql = Connection.connection.prepareStatement("SELECT name, roleName FROM Userdata WHERE userID=" + username + ";");
		ResultSet rs = selectsql.executeQuery();

		ArrayList<String> array = new ArrayList<String>();
		while (rs.next()) {
			array.add(rs.getString("name"));
			array.add(rs.getString("roleName"));
		}
		return array;
	}
	
}
