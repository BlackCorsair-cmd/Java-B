package dayFive.Inheritence;

public class ChristmasTree extends Tree {
	boolean isDecorated = false;
	
	
	public ChristmasTree(boolean isDecorated) {
		super();
		this.hight = 55;
		this.isDecorated = isDecorated;
		
	
	}
		
		@Override
		public String grow(int cm); {
		this.hight = hight + (2 * cm);
		return " i have grown " + (2 * cm) + " centimeters. " + " Now i am " + hight;
	}



 public String toString() {
	return " I am a christmas tree.";
	
}
}

