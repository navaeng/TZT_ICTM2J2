package me.ictm2j.tzt;
//main
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.protocol.Resultset;

public class Testing {

	public static void main(String[] args) {
		Connection.openConnection();
		Login frame = new Login();
		frame.setVisible(true);
	}
}
