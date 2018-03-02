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
	
	public ArrayList<String> getNewLocationCells() {
		//String alphabet = "ABCDEFG";
		
		ArrayList<String> locations = new ArrayList<String>();
		String letter = columns.get((int) (Math.random() * columns.size()));
		int startingNumber = (int) (Math.random() * 5);
		
		for (int i = 0; i < 3; i++) {
			String number = Integer.toString(startingNumber + i);
			locations.add(letter+number);
			System.out.println(letter+number);
		}
		
		return locations;
	}
	
	/*
	public void displayGrid() {
		for (int i = 0; i<grid.length; i++) {
			for (int j = 0; j<grid[i].length; j++) {
				System.out.print(grid[i][j]);
			}
			System.out.println();
		}
	}*/
}
