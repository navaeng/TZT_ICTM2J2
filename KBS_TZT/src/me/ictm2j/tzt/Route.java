package me.ictm2j.tzt;

public class Route {
	private int route_id;
	private int distance;
	private double cost;
	
	public Route(int route_id, int distance, double cost) {
		this.distance = distance;
		this.route_id = route_id;
		this.cost = cost;
	}
	
	public int getDistance() {
		return distance;
	}
	
	public int getRoute_id() {
		return route_id;
	}
	
	public double getCost() {
		return cost;
	}
}
