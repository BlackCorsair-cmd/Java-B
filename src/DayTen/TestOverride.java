package DayTen;

public class TestOverride {

	public static void main(String[] args) {
		

	}
	
	 @Override
	  public String toString() {
	    return "well this is overriden tostring";
	  }

	  @Override
	  public boolean equals(Object obj) {
	    return super.equals(obj);
	  }

	}


