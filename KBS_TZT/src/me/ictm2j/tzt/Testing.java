package me.ictm2j.tzt;

public class Testing {

	public static void main(String[] args) {
		
		Connection.openConnection();
		try {
			int uuid = HelperMethods.generateUserID(8);
			Employee medewerker = new Traincourier(uuid, "Thijs van der Hoff", "minecraft", null);
		} catch (Exception e) {
			
		}
		
		Login frame = new Login();
		frame.setVisible(true);
		
	}
}
