package dayEleven.homework;

public class TestDisplay {

	public static void main(String[] args) {
	
	    CurvedDisplay[] displays = new CurvedDisplay[] {
	        new CurvedDisplay(),
	        new CurvedDisplay(),
	        new CurvedDisplay(),
	        new CurvedDisplay(),
	        new CurvedDisplay()
	    };
	    
	    for (CurvedDisplay curvedDisplay : displays) {
	      curvedDisplay.turnOn();
	      curvedDisplay.setBrightness(5);
	      curvedDisplay.adjustDisplaySize(33.33);
	    }
	  }

	}


