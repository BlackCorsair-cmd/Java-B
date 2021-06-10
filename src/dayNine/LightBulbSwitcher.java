package dayNine;

public abstract class LightBulbSwitcher {
	
	public static void turnAllLightbulbs(Lightbulb[] bulbs) {
	    for (Lightbulb lightbulb : bulbs) {
	      lightbulb.turnOn();
	    }
	  }
	
}

