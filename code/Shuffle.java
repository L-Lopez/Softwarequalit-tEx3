package betmore_game.Files;

/**
 * Class of a random number between 0 and 100.
 */
public class Shuffle {
	
	int card_number;

	/**
	 * Generates a random number between 0 and 100 and assigns it as the value of the card.
	 */
	public Shuffle() {
		card_number = (int) Math.random() * 100;
	}
}
