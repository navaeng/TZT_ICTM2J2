package me.ictm2j.tzt;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Scanner;

import org.json.*;


public class GoogleDirectionsAPIConnection extends RouteAdd {

//transit&transit_mode=train
//bicycling
//driving

public double prijs1;
public double prijs2;
public double prijs3;
public static String RBG;
public static String RBGL;
public static String RFB;
public static String STS;
public static String STER;
public static String STERL;
public static String stba = getBeginAdres();
public static String stbs = getBeginStation();
public static String stes = getEindStation();
public static String stea = getEindAdres();




public static float[] directions(String city, String city2, String mode) throws Exception{
String s = "https://maps.googleapis.com/maps/api/directions/json?origin=";
s += URLEncoder.encode(city, "UTF-8") + "&destination=";
s += URLEncoder.encode(city2, "UTF-8") + "&key=AIzaSyDy-AawwBez3tmTzKrypv90_xMkxwhXrvY&language=nl&mode="+mode;
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

}

int duration =  (int)(obj.getJSONArray("routes").getJSONObject(0)
             .getJSONArray("legs").getJSONObject(0)
             .getJSONObject("duration").get("value"));

int distance = (int)(obj.getJSONArray("routes").getJSONObject(0)
         .getJSONArray("legs").getJSONObject(0)
         .getJSONObject("distance").get("value"));

return new float[] { (float)duration / 3600f, (float)distance / 1000f };}



//start_address end_address

/* private static float getTarief(int tarief) {
// TODO Auto-generated method stub
if (mode == transit) {
tarief = 0.45;
}
} */

public static void main(String[] args) {
try {

String beginplaats1 = stba;


String eindbestemming1 = stbs;


String beginplaats2 =stes;


String eindbestemming2 = stea;


System.out.println("\n beginpunt naar station \n");
float[] drivingDist = GoogleDirectionsAPIConnection.directions(beginplaats1, eindbestemming1, "driving");
float[] cyclingDist = GoogleDirectionsAPIConnection.directions(beginplaats1, eindbestemming1, "bicycling");
double prijs1= 0;
if(drivingDist[1] > 4) {
System.out.println("Driving");
System.out.println( "Van " + beginplaats1 + " naar " + eindbestemming1);
System.out.println("Afstand = " + drivingDist[1]);
if(drivingDist[1] < 25) {
System.out.println("Prijs = €10,-");
prijs1 = 10;
String RBG = "rijden van " + beginplaats1 + "naar " + eindbestemming1 + " voor €10 bij pietersen"; 
}
else {
System.out.println("Prijs = " + drivingDist[1]*0.39);
prijs1 = drivingDist[1]*0.39;
String RBGL = "rijden van " + beginplaats1 + "naar " + eindbestemming1 + "voor €" + prijs1 +" bij pietersen";

}
}
else {
System.out.println("Cycling");
System.out.println( "Van " + beginplaats1 + " naar " + eindbestemming1);
System.out.println("Afstand = " + cyclingDist[1]);
System.out.println("Prijs = €9,-");
prijs1 = 9;
String RFB = "fietsen van "+ beginplaats1 + " naar "+ eindbestemming1 +" voor €9 ";
}


System.out.println("\n Station naar station \n");
float[] trainDist = GoogleDirectionsAPIConnection.directions(eindbestemming1, beginplaats2, "transit&transit_mode=train");
System.out.println( "Van " + eindbestemming1 + " naar " + beginplaats2);
System.out.println("Afstand = " + trainDist[1]);
System.out.println("Prijs = " + trainDist[1]*0.35);
double prijs2 = trainDist[1]*0.35;
String STS = "van "+ eindbestemming1 + "naar " + beginplaats2 + " voor "+ prijs2 ; 


double prijs3 =0;
System.out.println("\n Station naar eindbestemming \n");
float[] drivingDist1 = GoogleDirectionsAPIConnection.directions(beginplaats2, eindbestemming2, "driving");
float[] cyclingDist1 = GoogleDirectionsAPIConnection.directions(beginplaats2, eindbestemming2, "bicycling");
if(drivingDist1[1] > 4) {
System.out.println("\n Driving \n");
System.out.println( "Van " + beginplaats2 + " naar " + eindbestemming2);
System.out.println("Afstand = " + drivingDist1[1]);
if(drivingDist1[1] < 25) {
System.out.println("Prijs = €10,-");
prijs3 = 10;
String STER = "van "+ beginplaats2 + " naar "+ eindbestemming2 + " voor €10.";
}
else {
System.out.println("Prijs = " + drivingDist1[1]*0.39);
prijs3 = drivingDist1[1]*0.39;
String STERL = "van "+ beginplaats2 + " naar "+ eindbestemming2 + " voor €"+ prijs3;
}
}

else {
System.out.println("\n Cycling \n");
System.out.println( "Van " + beginplaats2 + " naar " + eindbestemming2);
System.out.println("Afstand = " + cyclingDist1[1]);
System.out.println("Prijs = €9,-");
prijs3 = 9;
String STEF = "Van "+ beginplaats2 + " naar " + eindbestemming2 + "voor €9"; 
}
double totaal =  prijs1 + prijs2 + prijs3;
totaal = (double)(Math.round(totaal*100))/100.0; // afronden


System.out.println("\n \n Totaal tarief: €" + totaal);


} catch (Exception e) {
// TODO Auto-generated catch block
e.printStackTrace();
}

}
public static String getRBG() {
	return RBG;
}
public static String getRBGL() {
	return RBGL;
}
public static String getRFB() {
	return RFB;
}
public static String getSTS() {
	return STS;
}
public static String getSTER() {
	return STS;
}
public static String getSTERL() {
	return STS;
}



}
