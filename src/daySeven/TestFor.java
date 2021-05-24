package daySeven;

public class TestFor {

	public static void main(String[] args) {
//	 for(int i = 0; i < 10; i++ ) {
//		 System.out.println(i);
//	 }
	 
//	 for(int i = 0; i <= 20; i += 2 ) {
//		 System.out.print (i + " , " );
		
//		 for(int i = 25; i <= 45; i <= 20 ) {
//			 System.out.print (i + " , " );
//	} 
		
		String [] names = new String[5];
		
//		for ( int i = 0; i < n.length; i++) {
//			System.out.println(n[i]);
//		}
		
		names[0] = "magdalena";
		names[2] = "stole";
		names[4] = "marko";
		
//		for ( int i = 0; i <=  n.length; i++) {
//			System.out.println(n[i]);
//		}
		
		for (String name : names) {
			System.out.println(name);
			
		}
				
	}
	

}
