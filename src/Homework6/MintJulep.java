package Homework6;


public class MintJulep extends Coctail {
	
	
	String ingredients = " 1 teaspoon Powdered Sugar, ";
	String ingredients1 = " 2 teaspoons Water," ;
	String ingredients2 = " 4 Mint Leaves..";
	
	
	public void drinkig() {
		
		
		System.out.print(ingredients);
		System.out.print(ingredients1);
		System.out.print(ingredients2);
		System.out.print(" The Best Drink Ever!");
		System.out.print(" Mint Julep Everybody!!!"); }
		
		
		public static void main(String[] args) {
			int ingredients = 10;
			
	switch (ingredients) {
	case 1:
		int a = 1;
		System.out.println(" It need 1 teaspoon of Powered sugar first "  + a);
		break;
	case 2:
		int b = 2;
		System.out.println(" Maybe 3 spoons Water is better "  + b);
		break;
	case 3:
		int c = 4;
		System.out.println(" The leaves depends if you want them" + c);
	default:
		System.out.println(" The Ingredients dont need more than 7 spoons alltogether");
		break;
	}		
	
	
		
	}		
			
}
	
	
	
	
	


