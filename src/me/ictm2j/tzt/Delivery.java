package me.ictm2j.tzt;

import sun.util.calendar.BaseCalendar.Date;

public class Delivery {

	private int delivery_id;
	private String reciever;
	private String sender;
	private int pakket;
	private int safe;
	private Date datum;
	
	
	
	public Delivery(int delivery_id, String reciever, String sender, int pakket, int safe, Date datum) {
		this.delivery_id = delivery_id;
		this.reciever = reciever;
		this.sender = sender;
		this.pakket = pakket;
		this.safe = safe;
		this.datum = datum;
	}
		public int getDelivery_id() {
			return this.delivery_id;
		}
		public String getReciever() {
			return this.reciever;
		}
		public String getSender() {
			return this.sender;
		}
		public int GetPakket() {
			return this.pakket;
		}
		public int getSafe() {
			return this.safe;
		}
		public Date getDatum() {
			return this.datum;
		}
		
				
	}
	
	

