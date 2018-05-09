package me.ictm2j.tzt;

public class Bikecourier implements Courier {

	
	private int courier_id;
	private String name;
	private String route;
	
	public Bikecourier (int courier_id, String name, String route) {
		this.courier_id = courier_id;
		this.name = name;
		this.route = route;
	}
	
	@Override
	public int getCourier_id() {
		return this.courier_id;
	}
	@Override
	public String getName() {
		return this.name;
	}
	@Override
	public String getRoute() {
		return this.route;
	}
}
