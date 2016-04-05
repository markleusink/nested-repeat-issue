package eu;

import java.io.Serializable;
import java.util.ArrayList;

public class MainController implements Serializable {

	private ArrayList<Main> entries = new ArrayList<Main>();

	public MainController() {

		for (int i = 1; i <= 5; i++) {
			entries.add(new Main("main " + i));
		}

	}

	public ArrayList<Main> getEntries() {
		return entries;
	}

	public void remove(int index) {
		this.entries.remove(index);
	}

}
