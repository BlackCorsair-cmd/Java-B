package dayEleven.practice;

public class Makedonec extends Eye implements IHuman {

	public Makedonec playWithOtherHumans;

	@Override
	public String playWithOtherHumans() {
		System.out.println("Makedonec is Balkanec he is the best :) ");
		return null;
	}

	@Override
	public String seeInInfaredInTheDark(int allSpectres) {
		System.out.println("He can see evertyhing around him, cause he is the best! ");
		return null;
	}

	public String curse (int numberOftimes, String type) {
		System.out.println("i am cursing as praud macedoniant " + numberOftimes  + " number of times for " + type);
		    return "today is friday";
	}

	@Override
	boolean seeInInfaredInTheDark() {
		// TODO Auto-generated method stub
		return false;
	}
} 
    


