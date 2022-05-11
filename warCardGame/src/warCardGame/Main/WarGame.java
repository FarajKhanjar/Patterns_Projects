package warCardGame.Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WarGame 
{
	protected static Scanner in = new Scanner(System.in);
	protected static List<Player> allPlayers;
	protected static Deck deck;

	public void startGame() 
	{
		PrintMSG.openingMessage();

		final int SIZE = in.nextInt();

		allPlayers = new ArrayList<Player>(SIZE);
		allPlayers = PrintMSG.inputPlayersNameMessage(SIZE);
		System.out.println(allPlayers);

		PrintMSG.startGameMessage();

		int index = 1;
		Player theWinner = null;

		while (!deck.getInstance().isEmpty()) 
		{
			System.out.println("Battle #" + index);
			System.out.println("Number of cards in the game right now: " + deck.getInstance().getNumberOfCardsLeft());

			allPlayers.forEach((onePlayer) -> onePlayer.takeCard(deck));

			allPlayers.sort((player1, player2) -> player2.card - player1.card);
			allPlayers.forEach(p -> System.out.println(p));

			theWinner = allPlayers.get(0);
			theWinner.addScore();
			System.out.println("The Winner in this battle: " + theWinner.name);
			System.out.println("=====================================\n");

			index++;
		}
	}
}
