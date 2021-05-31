package Homework8;

public class TequilaBasedCoctails {

	public static void main(String[] args) {
	
		String [] names = new String[10]; 
		names[0] = " The Margarita";
		names[1] = " Tequila Sunrise";
		names[2] = " The Paloma";
		names[3] = " Tequila Colins";
		names[4] = " The Tequini";
		names[5] = " Brave Bull";
		names[6] = " Envy Coctail";
		names[7] = " Bloody Maria";
		names[8] = " Sangrita";
		names[9] = " El Diablo";
		
		int price = 350;
		if (price < 150) {
			System.out.println(names[0] + " - Widely known tequila coctail");
		} else if (price > 800) {
			System.out.println(names[5] + " - Fun twist on a happy hour staple");
		} else {
			System.out.println(names[9] + " - An aged tequila with lime juice");
			
		}
		
		int day = 4 ;
		switch (day) {
		case 1:
			System.out.println(names[3] + " On Monday");
			break;
		case 2:
			System.out.println(names[5] + " On Tuesday");
			break;
		case 3:
			System.out.println(names[7] + " On Wednesday");
            break;
		case 4:
			System.out.println(names[8] + " On Thursday");
			break;
		case 5:
			System.out.println(names[9] + " On Friday");
		default:
			System.out.println( " Everyday is good day to drink any coctail");
		}
		
		
		for (int i = 8; i < names.length; i++) {
			System.out.println("The best coctail is: " + names[9]);
						
		}
		
		String [] name = { " The Margarita" , " The Paloma" , " Brave Bull" , " Bloody Maria", " Sangrita" };
		for (String coctail : name) {
			System.out.println(coctail);
			
		}
		 int c1 = 5;
		while ( c1 < 7) {
			System.out.println(" This coctail mix is good for starters: " + names[4]);
			c1++;
			
		}
		
		int money = 1150;
		do {
			System.out.println(" Many coctails are good in one sip but this one, is the best: " +names[2]);
			money++;
		} while (money < 1000);
		
	
		int c2 = 250;
		for (int c3 = 245; c3 < name.length; c3++) {
			if ( c3 == 200)
				continue;
		}
		System.out.println(c2);
		
	}

}
