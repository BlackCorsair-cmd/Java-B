package Homework6;

public class TestCoctails extends Coctail {

	public static void main(String[] args) {
		
		TestCoctails tc1 = new TestCoctails();
		System.out.println(tc1 instanceof TestCoctails);
		
//		System.out.println(tc1.hashCode());
		
		MintJulep mj1 = new MintJulep();
		mj1.drinkig();
		testObjects(mj1);
		
		RobRoy rb1 = new RobRoy();
//		rb1.brand();
		testObjects(rb1);
					
	}
			
		public static void testObjects (Object o) {
			System.out.println(o instanceof Coctail);
			System.out.println(o instanceof RobRoy);
			System.out.println(o instanceof MintJulep);
		
	}
	}

       
    	   
     

		

		
	
		
		
		
		
		
		
		
		

	


