package me.ictm2j.tzt;

import java.net.URL;
import java.net.URLEncoder;
import java.util.Scanner;

import org.json.JSONObject;

public class Route {

	private String startAddress1;
	private String destinationAddress1;
	private String startAddress2;
	private String destinationAddress2;

	private String mode1;
	private double distance1;
	private double price1;

	private double distance2;
	private double price2;

	private String mode3;
	private double distance3;
	private double price3;

	public Route(String startAddress1, String destinationAddress1, String startAddress2, String destinationAddress2) {
		try {
			this.startAddress1 = startAddress1;
			this.destinationAddress1 =  destinationAddress1;
			this.startAddress2 = startAddress2;
			this.destinationAddress2 =  destinationAddress2;

			System.out.println("\n beginpunt naar station \n");
			float[] drivingDist = directions(startAddress1, destinationAddress1, "driving");
			float[] cyclingDist = directions(startAddress1, destinationAddress1, "bicycling");
			if(drivingDist[1] > 4) {
				this.mode1 = "Driving";
				this.distance1 = (double) drivingDist[1];
				if(drivingDist[1] < 25) {
					this.price1 = 10;
				} else {
					this.price1 = drivingDist[1]*0.39;

				}
			} else {
				this.mode1 = "Cycling";
				this.distance1 = cyclingDist[1];
				this.price1 = 9;
			}

			float[] trainDist = directions(destinationAddress1, startAddress2, "transit&transit_mode=train");
			this.distance2 = trainDist[1];
			this.price2 = trainDist[1]*0.35;

			float[] drivingDist1 = directions(startAddress2, destinationAddress2, "driving");
			float[] cyclingDist1 = directions(startAddress2,destinationAddress2, "bicycling");
			if(drivingDist1[1] > 4) {
				this.mode3 = "Driving";
				this.distance3 = drivingDist1[1];
				if(drivingDist1[1] < 25) {
					this.price3 = 10;
				} else {
					this.price3 = drivingDist1[1]*0.39;
				}
			} else {
				this.mode3 = "Cycling";
				this.distance3 = cyclingDist1[1];
				this.price3 = 9;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static float[] directions(String city, String city2, String mode) throws Exception{
		String s = "https://maps.googleapis.com/maps/api/directions/json?origin=";
		s += URLEncoder.encode(city, "UTF-8") + "&destination=";
		s += URLEncoder.encode(city2, "UTF-8") + "&key=AIzaSyDy-AawwBez3tmTzKrypv90_xMkxwhXrvY&language=nl&mode="+mode;
		URL url = new URL(s);



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

		}

		int duration =  (int)(obj.getJSONArray("routes").getJSONObject(0)
				.getJSONArray("legs").getJSONObject(0)
				.getJSONObject("duration").get("value"));

		int distance = (int)(obj.getJSONArray("routes").getJSONObject(0)
				.getJSONArray("legs").getJSONObject(0)
				.getJSONObject("distance").get("value"));

		return new float[] { (float)duration / 3600f, (float)distance / 1000f };

	}

	public String getStart1() {
		return this.startAddress1;
	}	
	
	public String getStart2() {
		return this.startAddress2;
	}	
	
	public String getDestination1() {
		return this.destinationAddress1;
	}
	
	public String getDestination2() {
		return this.destinationAddress2;
	}
	
	public String getMode1() {
		return this.mode1;
	}	
	
	public String getMode3() {
		return this.mode3;
	}
	
	public double getPrice1() {
		return this.price1;
	}	
	
	public double getPrice2() {
		return this.price2;
	}	
	
	public double getPrice3() {
		return this.price3;
	}	
	
	public double getDistance1() {
		return this.distance1;
	}
	
	public double getDistance2() {
		return this.distance2;
	}
	
	public double getDistance3() {
		return this.distance3;
	}
}

