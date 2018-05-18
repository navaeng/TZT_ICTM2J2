package me.ictm2j.tzt;
//main
public class Testing {

	public static void main(String[] args) {
		Connection.openConnection();
		Login frame = new Login();
		frame.setVisible(true);
	}
}
