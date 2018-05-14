package me.ictm2j.tzt;

public class Keygenerator {


	private int code;
	private int time;


	public Keygenerator(int code, int time) {

		this.code = code;
		this.time = time;
	}	

	public int generateCode() {
		return this.code;
	}
	public int getTime() {
		return this.time;
	}


}

