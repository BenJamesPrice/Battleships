import java.util.ArrayList;

public class Grid {
	
	private String[][] grid;
	private ArrayList<String> rows;
	
	public Grid() {
		rows = new ArrayList<String>();
		String alphabet = "ABCDEFG";
		for (int i = 0; i < alphabet.length(); i++) {
			rows.add(String.valueOf(alphabet.charAt(i)));
		}
		setupGrid();
	}
	
	private void setupGrid() {
		grid = new String[7][7];
		for (int i = 0; i<grid.length; i++) {
			for (int j = 0; j<grid[i].length; j++) {
				grid[i][j] = "?";
			}
		}
	}
	
	public void displayGrid() {
		for (int i = 0; i<grid.length; i++) {
			for (int j = 0; j<grid[i].length; j++) {
				System.out.print(grid[i][j]);
			}
			System.out.println();
		}
	}
	
	public void updateGrid(String coords, String result) {
		char rowLetter = coords.charAt(0);
		int rowIndex = rowLetter - 'A';
		int colIndex = Integer.parseInt(String.valueOf(coords.charAt(1)));
		String r = "m";
		if (result == "hit" || result == "kill") {
			r = "h";
		}
		grid[rowIndex][colIndex] = r;
	}
	
	public ArrayList<String> getNewLocationCells() {
		ArrayList<String> locations = new ArrayList<String>();
		int index = (int) (Math.random() * rows.size());
		String letter = rows.get(index);
		rows.remove(index);
		int startingNumber = (int) (Math.random() * 5);
		
		for (int i = 0; i < 3; i++) {
			String number = Integer.toString(startingNumber + i);
			locations.add(letter+number);
		}
		
		return locations;
	}

}
