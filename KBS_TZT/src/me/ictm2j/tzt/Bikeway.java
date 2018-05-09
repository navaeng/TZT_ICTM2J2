package me.ictm2j.tzt;

public class Bikeway extends Route{
	private double distance;
	private int costs;
	
	public Bikeway(double distance, int costs){
		this.distance = distance;
		this.costs = costs;
	}

	public double getDistance() {
		return distance;
	}

	public int getCosts() {
		return costs;
	}

	
	
}
