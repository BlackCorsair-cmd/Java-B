package DayEight;

public class TestString {



	public static void main(String[] args) {
		String s1 = "123456789";

		//		String s1 ="";
//
//		for (int i = 0; i < s1.length(); i++) {
//			System.out.print (s1.charAt(i) + " , ");


//		}
//
//		System.out.println();
//
//
//		int j = 0;
//		LabelName1: while (j < s1.length()) {
//			System.out.print (s1.charAt(j) + " , ");	
//			j++;
//
//		}
//
//		LabelName2: {
//
//			System.out.println();
//			int k = 0;
//
//			do {
//				System.out.print (s1.charAt(k) + " , ");	
//				k++;	
//			} while (k < s1.length());
//			System.out.println();
//		}
//		
//		for (int i = 0; i < s1.length(); i++) {
//			if (i >=5 ) {
//				break;
//			} else {
//				System.out.print(s1.charAt(i) + ", ");
//			}
//			
//		}
//			
//		
//			for (int i = 0; i < s1.length(); i++) {
//				if( i >= 7) {
//					break;
//				}
//			
//				if ( i % 2 == 0) {
//					System.out.print (s1.charAt(i) + " , ");
//				} else {
//				continue;
//				}
//				System.out.println( "  - something  -");
//			}
//			
//			someLabel: {
//				System.out.println("one");
//				if (s1.length() > 0) {
//					break someLabel;	
//				}
//				System.out.println("two");
//			}
//			
				//		while (true)  {
				//			int k = 0;
				//		    if (k < s1.length()) {
				//		    	System.out.print (s1.charAt(k) + " , ");
				//		    }
				//		k++;

	
        String rev = "";
        
        int len = s1.length();
        for ( int i = len-1; i >= 0 ; i--)
        {
        	rev = rev + (s1.charAt(i) + " ' ");
        	
        }
      
        System.out.println( rev );
        System.out.println( rev.toUpperCase());
        
        {
		
		StringBuffer sb = new StringBuffer(s1);
		System.out.println(sb.reverse());
		
		
		
		
		
		
        }
	}
	
}


			// Homework 1 = print string in reverse
			// Homework 2 = print string in reverse and uppercase