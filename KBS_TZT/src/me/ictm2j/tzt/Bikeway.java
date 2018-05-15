package me.ictm2j.tzt;

public class Bikeway extends Route{
        private int bikeway_id;
	private int distance;
	private double costs;

    public Bikeway(int route_id, int distance, double cost) {
        super(route_id, distance, cost);
    }
	


	public int getDistance() {
		return distance;
	}

	public double getCosts() {
		return costs;
	}

	
	
}
