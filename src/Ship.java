import java.util.ArrayList;

public class Ship {
	private String name;
	private ArrayList<String> locationCells;
	
	public void setName(String n) {
		this.name = n;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setLocationCells(ArrayList<String> locs) {
		this.locationCells = locs;
	}
	
	public String checkHit(String guess) {
		String result = "miss";
		int index = locationCells.indexOf(guess);
		if (index >= 0) {
			locationCells.remove(index);
			if (locationCells.isEmpty()) {
				result = "kill";
			} else {
				result = "hit";
			}
		}
		return result;
	}
}