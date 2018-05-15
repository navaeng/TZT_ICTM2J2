package me.ictm2j.tzt;

public class Trajectory extends Route {

	private int trajectory_id;
	private int distance;
	private double cost;

    public Trajectory(int route_id, int distance, double cost) {
        super(route_id, distance, cost);
    }
	

	
	public int getTrajectory_id() {
		return this.trajectory_id;
	}
	public int getDistance() {
		return this.distance;
	}
	public double getCost() {
		return this.cost;
	}
	
}
