package dayFive.Inheritence;

public class Tree {
	String type = "winter green";
	int hight = 100;
	
	public String grow(int cm) {
		int initialGrowht = 11;
		
		this.hight = hight + cm;
		return " i have grown " + cm + " centimeters. " + " Now i am " + hight;
		
	}
	public Tree() {
		
		super();
		
		
	}
		
				 


}
