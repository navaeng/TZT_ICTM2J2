package me.ictm2j.tzt;


import java.net.URL;
import java.util.Scanner;

import org.json.*;
import com.sun.deploy.net.URLEncoder;

public class GoogleDirectionsAPIConnection {

private void directions(String city, String city2) throws Exception{
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
	
	
	}

}
