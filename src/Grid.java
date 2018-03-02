import java.util.ArrayList;

public class Grid {
	
	private String[][] grid;
	
	public Grid() {
		this.grid = new String[7][7];
		for (int i = 0; i<grid.length; i++) {
			for (int j = 0; j<grid[i].length; j++) {
				grid[i][i] = "";
			}
		}
	}

	public ArrayList<String> getNewLocationCells() {
		return null;
	}
}
