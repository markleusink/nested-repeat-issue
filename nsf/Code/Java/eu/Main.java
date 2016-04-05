package eu;

import java.io.Serializable;

public class Main implements Serializable {

	private String name;
	
	public Main(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
}
