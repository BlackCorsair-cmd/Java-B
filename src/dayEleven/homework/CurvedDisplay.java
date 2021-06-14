package dayEleven.homework;

public class CurvedDisplay implements IMonitor, IProjector, ILcdMonitor {

	@Override
	public void setBrightness(int percentage) {
		System.out.println(" changed brightness to " + percentage);
	}

	@Override
	public String adjustDisplaySize(double decimalPercentage) {
		System.out.println("This display is not adjustable");
		return " This display is not adjustable";
	}

	@Override
	public boolean turnOn() {
		System.out.println(" display turning on");
		return false;
	}

}
