package me.ictm2j.tzt;

import java.net.URL;
import java.net.URLEncoder;
import java.util.Scanner;

import org.json.JSONObject;

public class GoogleDirectionsAPIConnection {


	public static void directions(String city, String city2) throws Exception{
		String s = "https://maps.googleapis.com/maps/api/directions/json?origin=";
		s += URLEncoder.encode(city, "UTF-8") + "&destination=";
		s += URLEncoder.encode(city2, "UTF-8") + "&key=AIzaSyDy-AawwBez3tmTzKrypv90_xMkxwhXrvY&language=nl&mode=transit&transit_mode=train";
		URL url = new URL(s);
		System.out.println(url);


		// read from the url
		Scanner scan = new Scanner (url.openStream());
		String str = new String();
		while (scan.hasNext()) {
			str += scan.nextLine();
		}
		scan.close();

		// buld json object
		JSONObject obj = new JSONObject(str);
		if (!obj.getString("status").equals("OK")) {
			return;
		}


		// get the first result

		String sa = "";
		for( int i = 0; i < obj.getJSONArray("routes").length(); i++){
			JSONObject r1 = (JSONObject) obj.getJSONArray("routes").get(i);
			System.out.println(r1.getString("copyrights"));



			for (int x = 0; x < r1.getJSONArray("legs").length(); x++) {
				JSONObject o1 = ((JSONObject) r1.getJSONArray("legs").get(x));
				System.out.println(o1.getString("start_address"));
				sa = o1.getString("start_address");
				System.out.println(o1.getString("end_address"));


				for (int j = 0; j < o1.getJSONArray("steps").length(); j++ ) {
					JSONObject step1 = ((JSONObject) o1.getJSONArray("steps").get(j));
					System.out.println(step1.getString("travel_mode"));
					System.out.println(step1.getJSONObject("distance").getString("text"));
					System.out.println(step1.getJSONObject("duration").getString("text"));
				}

			}

		}
	}

	public static void main(String[] args) {
		try {
			System.out.println("Wat is het vertrekpunt ");
			@SuppressWarnings("resource")
			Scanner scanner1 = new Scanner(System.in);
			String beginplaats = scanner1.nextLine();

			System.out.println("Wat is de eindbestemming ");
			@SuppressWarnings("resource")
			Scanner scanner2 = new Scanner(System.in);
			String eindbestemming = scanner2.nextLine();

			GoogleDirectionsAPIConnection.directions(beginplaats, eindbestemming);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
