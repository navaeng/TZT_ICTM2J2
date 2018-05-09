package me.ictm2j.tzt;

public class Package {

	
	private int height;
	private int width;
	private int length;
	private int weight;
	private int pakketnummer;
	
	


	public Package(int height, int width, int length, int weight, int pakketnummer ) {
		
		this.height = height;
		this.width = width;
		this.length = length;
		this.weight = weight;
		this.pakketnummer = pakketnummer;
	}
		public int getHeight() {
			return this.height;
		}
		public int getWidth() {
			return this.width;
		}
		public int getLength() {
			return this.length;
		}
		public int getWeight() {
			return this.weight;
		}
		public int getPakketnummer() {
			return this.pakketnummer;
		}
	
	
}