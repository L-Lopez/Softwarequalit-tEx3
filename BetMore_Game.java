package betmore_game;

/**
 * Initializes a new Game.
 */
public class BetMore_Game {
	
	Shuffle s;

	/**
	 * Picks a random Card with a value.
	 * @return value of the random card.
	 */
	public int pick_card() {
		s = new Shuffle();
		return s.card_number;
	}

}
