package me.ictm2j.tzt;

public class Bikeway extends Route{
	private int distance;
	private int costs;
	
	public Bikeway(int distance, int costs){
		this.distance = distance;
		this.costs = costs;
	}

	public int getDistance() {
		return distance;
	}

	public int getCosts() {
		return costs;
	}

	
	
}
