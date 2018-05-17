package me.ictm2j.tzt;

public class Testing {

	public static void main(String[] args) {
		Connection.openConnection();
		TZTcourierDashboard frame = new TZTcourierDashboard();
		frame.setVisible(true);
	}
}
