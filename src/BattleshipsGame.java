import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BattleshipsGame {
	
	private ArrayList<Ship> ships;
	private int numOfGuesses;
	private Grid grid;
	
	private void setupGame() {
		numOfGuesses = 0;
		
		//Create grid
		this.grid = new Grid();
		
		//Create 3 ships and add to ships ArrayList
		ships = new ArrayList<Ship>();
		Ship submarine = new Ship();
		submarine.setName("Submarine");
		submarine.setLocationCells(grid.getNewLocationCells());
		Ship destroyer = new Ship();
		destroyer.setName("Destroyer");
		destroyer.setLocationCells(grid.getNewLocationCells());
		Ship carrier = new Ship();
		carrier.setName("Aircraft Carrier");
		carrier.setLocationCells(grid.getNewLocationCells());
		ships.add(submarine);
		ships.add(destroyer);
		ships.add(carrier);
	}
	
	//Continues playing the game while there are ships alive
	private void startGame() {
		while (!ships.isEmpty()) {
			String guess = getUserInput("Enter guess: ");
			checkUserGuess(guess);
		}
		finishGame();
	}
	
	//Get the user's coordinate input as a string
	private String getUserInput(String prompt) {
		String inputLine = null;
		System.out.print(prompt);
		try {
			BufferedReader is = new BufferedReader(
			new InputStreamReader(System.in));
			inputLine = is.readLine();
			if (inputLine. length () == 0) return null;
		} catch (IOException e) {
			System.out.println("IOException: " + e);
		}
		return inputLine;
	}
	
	//Compares the user's guess to each ship's locations
	private void checkUserGuess(String guess) {
		numOfGuesses++;
		String result = "miss";
		for (Ship s : ships) {
			result = s.checkHit(guess);
			if (result == "hit") {
				break;
			} else if (result == "kill") {
				ships.remove(s);
				break;
			}
		}
		System.out.println(result);
	}
	
	//Prints out messages once game is over
	private void finishGame() {
		System.out.println("Well done!");
		System.out.println("You took " + numOfGuesses + " guesses.");
	}
		
	public static void main(String[] args) {
		BattleshipsGame game = new BattleshipsGame();
		game.setupGame();
		game.startGame();
	}
}
