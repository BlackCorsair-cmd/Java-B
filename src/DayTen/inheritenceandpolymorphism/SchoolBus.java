package DayTen.inheritenceandpolymorphism;

public class SchoolBus extends Bus {
	
	String color = "black";
	
	@Override
	public void drive( int speed) {
		if (speed > 80) {
			System.out.println("you are not allowed to go that fast");
			System.out.println("speed limited to 80");
			System.out.println(" i am driving with 80 mph");
		}else {
			super.drive(speed);
			System.out.println("driving with speed: " + speed);
			
		}
	
	}
	@Override
	  public String toString() {
	    return "SchoolBus [color=" + color + "]";
	  }


}
