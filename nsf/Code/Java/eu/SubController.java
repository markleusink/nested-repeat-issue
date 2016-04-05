package eu;

import java.io.Serializable;
import java.util.ArrayList;

public class SubController implements Serializable {
	
	private ArrayList<Sub> entries = new ArrayList<Sub>();
	
	public SubController(Main main) {
		
		System.out.println("constructing sub for " + main.getName());
	
		for(int i =1 ; i<=3; i++) {
			Sub s = new Sub(main.getName() + " - sub " + i);
			entries.add(s);
		}
		
	}
	
	public ArrayList<Sub> getEntries() {
		return entries;
	}
	
}
