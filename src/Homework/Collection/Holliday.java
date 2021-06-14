package Homework.Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Holliday {	
	
	
	public static void main(String[] args) {	
		
// 1.Holiday object with 3 fields -> price, location, clientId
// 2.Override the tostring method to include all fields
// 3.Create multiple objects and add them in list (with duplicated)
// 4.Iterate over all objects in the list and add them in a set
// 5.Iterate over all elements in set and put them in a Map with clientId as key
// 6.Iterate over all elements in the Map and print the objects		
	
	}
		String price;
		String location;
		String clientId;
	
		
	 public Holliday(String price, String location, String clientId) {
		this.price = price;
		this.location = location;
		this.clientId = clientId;
	 }
	
	@Override
	public String toString() {
		return "Holliday:  Price = " + price + " Location = " + location + " Client = " + clientId + "";
			}
		


	
	
   List<Holliday> hollidayList = new ArrayList<Holliday>(); {
   
   
   Holliday h1 = new Holliday("1500 euro", "Bali", "Stojance");
   Holliday h2 = new Holliday("2000 euro", "Bali", "Viktorija");
   Holliday h3 = new Holliday("1200 euro", "Mexico", "Viktorija");
   Holliday h4 = new Holliday("1200 euro", "Zimbabve", "Anastazija");
   Holliday h5 = new Holliday("1700 euro", "Mexico", "Ana");
   
   hollidayList.add(h1);
   hollidayList.add(h2);
   hollidayList.add(h3);
   hollidayList.add(h4);
   hollidayList.add(h5);
   
 	

   Set<Holliday> set = new HashSet<Holliday>(hollidayList); 
	   for (Holliday holliday : hollidayList)
		   set.add(holliday);
	   
	 
}
}

		   
	 
		
	
   
 
	


