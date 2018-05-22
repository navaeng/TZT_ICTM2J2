package me.ictm2j.tzt;

import java.util.Random;

public class Keygenerator {


	private int time;
	private static int code;


	public Keygenerator(int time) {
		this.time = time;
	}	

	public static int generateCode() {
		Random random = new Random();
		String code = String.format("%04d", random.nextInt(9999));
		return Integer.parseInt(code);
	}
	
	public int getTime() {
		return this.time;
	}

	public static void main(String[] args) throws InterruptedException {
		
		code = generateCode();
		System.out.println(code);

	
		while(true) {
		int timet= 180*60; // = .. tijd in minuten
		long delay = timet * 1000;

		{
			do
			{
				int minutes = timet / 60;
				int seconds = timet % 60;
				System.out.println("Deze code is nog " + minutes + " minuten geldig");
				Thread.sleep(1000);
				timet = timet - 1;
				delay = delay - 1000;

			}
			while (delay != 0);
			code = generateCode();
					//return Integer.parseInt(code);
		System.out.println(code);
		}
		}
	}
}



