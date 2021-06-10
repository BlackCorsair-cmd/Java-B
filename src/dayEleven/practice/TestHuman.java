package dayEleven.practice;

public class TestHuman {

	public static void main(String[] args) {
	
		Makedonec [] makedonci = new Makedonec[5];
		Makedonec m1 = new Makedonec();
		IHuman h1 = m1;
		makedonci [0] = makedonci [1] = makedonci [2] = makedonci [3] = makedonci [4] = m1;
		
		for (  Makedonec makedonec : makedonci) {
			System.out.println("can see in dark " + makedonec.seeInInfaredInTheDark());
			makedonec.curse(3, "politics");
		}
		
		IHuman[] humans = new IHuman[5];
	    for (int i = 0; i < makedonci.length; i++) {
	      humans[i] = makedonci[i];
	    }
	}
}
