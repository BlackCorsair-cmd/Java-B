package DayEight;

public class JohnnyWalker extends Whiskey {
	public static int serialNumber = 0;
	
	public int price;
	
	public JohnnyWalker(int price) {
		super();
		this.price = price;
		serialNumber++;
	}

	public Integer poorGlass(int numberOfShots) {
		return numberOfShots * 50;
	}
		
		@Override
		public String toString() {
			return " jw price: "  + price;	
	}
	
			
		}


