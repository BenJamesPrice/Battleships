import java.util.ArrayList;

public class Grid {
	
	private ArrayList<String> columns;
	
	public Grid() {
		columns = new ArrayList<String>();
		String alphabet = "ABCDEFG";
		for (int i = 0; i < alphabet.length(); i++) {
			columns.add(String.valueOf(alphabet.charAt(i)));
		}
	}
	
	public void updateGrid(String coords, String result) {
		
	}
	
	public ArrayList<String> getNewLocationCells() {
		ArrayList<String> locations = new ArrayList<String>();
		int index = (int) (Math.random() * columns.size());
		String letter = columns.get(index);
		columns.remove(index);
		int startingNumber = (int) (Math.random() * 5);
		
		for (int i = 0; i < 3; i++) {
			String number = Integer.toString(startingNumber + i);
			locations.add(letter+number);
		}
		
		return locations;
	}

}
