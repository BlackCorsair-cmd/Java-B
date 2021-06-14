package DayTwelve;

import java.util.HashMap;
import java.util.Map;

public class TestMap {

	public static void main(String[] args) {
		Map<String, String> nameSurname = new HashMap<>();
		nameSurname.put("nikola", "gruevski");
		nameSurname.put("abdi", "bajram");
		
		System.out.println(nameSurname.get("abdi"));
		System.out.println(nameSurname.get("petar"));
		
		System.out.println(nameSurname);
		nameSurname.remove("nikola");
		System.out.println(nameSurname);
		
		Map<Long, Citizen> citizensOfSkopje = new HashMap<>();
		
		
	}

}
