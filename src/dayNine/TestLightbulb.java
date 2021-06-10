package dayNine;

public class TestLightbulb {

	public static void main(String[] args) {
//	Lightbulb lb1 = new Lightbulb()	;
//	lb1.turnOn();
	RedLightbulb rlb1 = new RedLightbulb();
	rlb1.turnOn();
	
	Lightbulb[] lbar = new Lightbulb[10];
	lbar[0] = new RedLightbulb();
	lbar[1] = new RedLightbulb();
	lbar[2] = new RedLightbulb();
	lbar[3] = new GreenLightBulb();
	lbar[4] = new GreenLightBulb();
	lbar[5] = new GreenLightBulb();
	lbar[6] = new BlueLightbulb();
	lbar[7] = new BlueLightbulb();
	lbar[8] = new BlueLightbulb();
	lbar[9] = new YellowLB();
	
	LightBulbSwitcher.turnAllLightbulbs(lbar);
		
	}
}
	
