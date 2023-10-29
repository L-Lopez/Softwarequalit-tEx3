package betmore_game.Files;

/**
 * Initaites a new instance of a player.
 */
public class Player {
	
	BetMore_Game Bet;
	int card_number;
	boolean user_selected;

	/**
	 * Picks a random value off the cards.
	 * @return value of of the random card.
	 */
	public int play() {
		Bet = new BetMore_Game();
		int counter = 0;
		
		while (!user_selected && counter < 5) {
			card_number = Bet.pick_card();
			//User decides whether s/he wants to take the number
			counter++;
		}
		
		return card_number;
	}
}
