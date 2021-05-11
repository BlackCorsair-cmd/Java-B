package dayThree;



public class Eartling {
	private String color = "white";
	private int age;
   public Eartling(String c, int a) {
    	color = c;
    	age = a;
   }   
   	
    public Eartling() {	
    }
    public String getColor() {
    color.equals(color);
	return color;
}
    public void setColor(String color) {
    	if (color != null) {
    	color = color.trim().toLowerCase();
    	if(!color.equalsIgnoreCase("white")
    	  && !color.equalsIgnoreCase("black")
    	  && !color.equalsIgnoreCase("yellow")
    	  && !color.equalsIgnoreCase("green")
    	  && !color.equalsIgnoreCase("red")
    	  && !color.equalsIgnoreCase("brown") ) {
    		  System.out.println("unsoported color: " + color);
    	  } else {
    		  System.out.println("set color to: " + color);
    	  this.color = color;
    	  }
    	} else {
    		System.out.println("color can't be null");
    	}
    }
public int getAge() {
	return age;
}
public void setAge(int age) {
	if(age < 150 && age >=0) {
		System.out.println("all good . set age to: " + age);
	} else {
		System.out.println("age should be between 0 and 150. age:" + age);
	}
	this.age = age;
}


  int eat(int initCalories) {
	  Eartling e3 = new Eartling();
    	int maxCalories = 1000;
    	int remainingCalories = 0;
    	System.out.println("initial calories:" + initCalories);
    	
    	if (initCalories <= maxCalories) {
    		System.out.println("i have itten calories:" + initCalories);
    	} else {
    		System.out.println("i have itten calories:" + maxCalories);
    		remainingCalories = initCalories - maxCalories;
    		
    	}
    	return remainingCalories;
    }
  int eat(String vegableType) {
	  return 22;
  }
	  
  double eat() {
		  return 22;
	  
	   
	   

		   
	   }
   }
    

