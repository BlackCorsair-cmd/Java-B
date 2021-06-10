package DayTen;

public class Hello {

	public static void main(String[] args) {
		System.out.println("hello :) ");
	    drive(10);
	  }
	  
	  public static void drive(int speed ) {
	    System.out.println("i am driving with speed: " + speed);
	    if (speed > 1) {
	      drive(speed -1);
	    }
	  }
}
