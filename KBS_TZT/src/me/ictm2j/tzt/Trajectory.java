package me.ictm2j.tzt;

public class Trajectory extends Route {

	private int trajectory_id;
	private int distance;
	private double cost;
	
	public Trajectory(int trajectory_id, int distance, double cost) {
		this.trajectory_id = trajectory_id;
		this.distance = distance;
		this.cost = cost;
		
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
