package DaySix;

import dayFivestaticli.Car;

public class TestOperators {

	public static void main(String[] args) {
//		int t1 = 0;
//		System.out.println(t1);
//		t1++; 
//		System.out.println(t1);
//		++t1;
//		System.out.println(t1);
//		
//		System.out.println(t1++);
//		System.out.println(t1);
//		
//		System.err.println(++t1);
//		int counter = 0;
//		
//		int rundNumber = t1 + ++t1 + t1++; // 4+5+5 = 14
//		System.out.println(rundNumber);
//		System.out.println(t1);
		
//		int t2 = 10;
//		t2--;
//		System.out.println(t2); // 9
//		--t2;
//		System.out.println(t2); // 8
//		
//		System.out.println(t2--);// 8
//		System.out.println(t2); // 7
//		
//		System.err.println(--t2); //6
//	    System.out.println(t2); //6
		
//		int t1 = 3;
//		t1 = t1+2; // 3+2= 5
//		t1 +=2; // t1 = t1+2
//		int t2 = 4;
//		t1 +=t2; // t1 = t1+t2
//		
//		System.out.println(t1);
		
//		
//		int t3 = 3;
//		int t4 = 4;
//		int t5 = 5;
//		
//		int sum = t3 + t4 + t5; // 3+4+5 = 12
//		System.out.println(sum); {
//			
//		int sum2 = ++t3 + --t4 + t5++; // 4+3+5 
//		System.out.println(sum2);
		
//		int sum3 = t3-- - --t4 + --t5; // 2 - 3 + 4
//		System.out.println(sum3);
//		System.out.println(t3);
		
//		int a = 3;
//		int b = 5;
//		
//		int c = a + b;
//		System.out.println(c);
//		
//		System.out.println(" zdravo " + (a - b ));
//		
//		int d = a - b * c; // 3 - 5 * 8 = 3 - 40 = -37
//		System.out.println(d);
//		
//		int e =( a - b ) * c; // ( 3-5) *8 = -2 * 8 = -16
//		System.out.println(e);
		
//		
		
//		boolean isDayOutside = true;
//		boolean tmp = !isDayOutside;
//		System.out.println(tmp);
//		System.out.println(!tmp);
//		
//		
//		boolean isNIght = !isDayOutside;
//		
//		
//		
//		if (!isNIght) {
//			System.out.println(" it is night outside");
//			
//		}
		
//		int a = 3;
//		int b = 5;
//		int h = 12;
//		int m = 3;
//		
//		int f = a / b;
//		System.out.println(f);
//		
//		int g = a % b;
//		System.out.println(g);
//		
//		int j = h / b; // 12 / 5 
//		System.out.println(j);
//		
//		int k = h % b; // 12 % 5
//		System.out.println(k);
//		
//		int l = a * b; // 3 * 5
//		System.out.println(l);
//		
//		System.out.println( a < b);
//		System.out.println(b > h);
//		
//		System.out.println(a <= h);
//		System.out.println(a >= h);
//		System.out.println(a >= m);
//		
//		System.out.println(a = 5);
//		System.out.println(b == 5);
//		
//		System.out.println(b != 5);
		
//		Object c = new Car("black");
//		boolean temp = c instanceof Car;
//		System.out.println(temp);
		
		Car c1 = new Car(" blue");
		isArgumentACar(c1);
		
		String name = "magdalena";
		isArgumentACar(name);
		
		}
	
	public static void isArgumentACar(Object arg) {
		if ( arg instanceof Car) {
			System.out.println(" well arg is a car");
		}else {
			System.out.println(" arg is not a car");
		}
		
		}
		
	}

	


