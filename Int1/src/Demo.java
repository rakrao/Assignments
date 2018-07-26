
public class Demo { // creating demo class
	public static void perform(Game game) { // passing interface reference
		game.play();
	}

	public static void main(String[] args) { // main method
		Game game[] = new Game[3]; // creating array
		game[0] = new Cricket();

		game[1] = new Football();
		game[2] = new Tennis();

		for (int i = 0; i < 3; i++) {
			perform(game[i]); // invoking play method
		}
	}
}
