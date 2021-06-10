package dayNine;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestList {
	  public static void main(String[] args) throws IOException {
	    Runtime.getRuntime().gc();
	    Process p = Runtime.getRuntime().exec("");
	    List<String> names = new ArrayList<>();
	    names.add("a name");
	    for (String name : names) {
	      System.out.println(name);
	    }
	    System.out.println(names.size());
	    
	    Set<String> uniqueNames = new HashSet<>();
	    
	    List<Patato> patatos = new ArrayList<>();
	    patatos.add(new Patato());
	  }
	  
	  public void outOfMain( ) {
	    List<String> names = new ArrayList<>();
	    names.add("a name");
	  }

}
