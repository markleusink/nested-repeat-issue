package eu;

import java.io.Serializable;

public class Sub implements Serializable {

	private String name;
	
	public Sub(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
}	


