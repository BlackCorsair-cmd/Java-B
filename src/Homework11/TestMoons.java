package Homework11;

public class TestMoons {

	public static void main(String[] args) {
		
		AllMoonsHere [] moons = new AllMoonsHere[3];
		AllMoonsHere amh1 = new AllMoonsHere();
		Jupiter j1 = amh1;
		moons [0] = moons[1] = moons[2] = amh1;
		
		for (AllMoonsHere allMoonsHere : moons) {
			System.out.println("This solar system is packed with wonders " + allMoonsHere.findTheMoonsHere(218));
			allMoonsHere.theAreALotOfMoonAroundSaturn();
			
				}
		Jupiter[] jupiter = new Jupiter[3];
		for (int i = 0; i < jupiter.length; i++) {
			jupiter[i] = moons[i];
			
			
		}

	}

}
