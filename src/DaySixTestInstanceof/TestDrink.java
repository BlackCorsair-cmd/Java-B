package DaySixTestInstanceof;



public class TestDrink {

	public static void main(String[] args) {
		
		Whiskey w1 = new Whiskey();
		System.out.println(w1.isAlcoholic());
		
		Drink d1 = w1;
		System.out.println(d1.price);
		testObjects(d1);
		
		Object o1 = w1;
		System.out.println(o1.hashCode());
		System.out.println(d1.hashCode());
		System.out.println(w1.hashCode());
		testObjects(o1); 
		
		
		
		
//		AlcoholicDrink a1 = new AlcoholicDrink();
//		a1.letsDrink();
//		testObjects(a1);
//		
//		
//		AlcoholicDrink a2 = new Whiskey();
//		
//		testObjects(a2);
//		System.out.println(a2.isAlcoholic));
		
		
		
//		AlcoholicDrink a2 = new Whiskey();
//		
//	    Whiskey w1 = new Whiskey();
//	
//	
//		
//		Drink d2 = a1;
//		Object o3 = d2;
//		 
//		
//		testObjects (a1);
//		testObjects (a2);
//		testObjects (d2);
//		testObjects (o3);
	}

		
	
	public static  void testObjects (Object o) {
//		System.out.println(o instanceof AlcoholicDrink);
//		System.out.println(o instanceof Drink);
//		System.out.println(o instanceof Object);


		if (o instanceof Whiskey) {
			Whiskey wx = (Whiskey) o;
			boolean isAlcoh = wx.isAlcoholic();
			System.out.println(isAlcoh);
			System.out.println(wx.price);
			System.out.println(wx.brand);
		}
	
	
	}

	
	
	}
	
		
		

	


