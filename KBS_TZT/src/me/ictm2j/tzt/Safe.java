package me.ictm2j.tzt;

public class Safe {
		
		private int height;
		private int width;
		private int length;
		private int safe_ID;
		private int key;
		private String station;
		
		
		public Safe(int height, int width, int length, int safe_ID, int key, String station) {
			
			this.height = height;
			this.width = width;
			this.length = length;
			this.safe_ID = safe_ID;
			this.key = key;
			this.station = station;
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

			public int getSafe_ID() {
				return this.safe_ID;
			}
			
			public int getKey() {
				return this.key;
			}
			
			public String getStation() {
				return this.station;
			}
		
		
}
