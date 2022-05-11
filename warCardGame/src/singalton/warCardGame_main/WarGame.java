package singalton.warCardGame_main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import singalton.warCardGame_classes.Deck;
import singalton.warCardGame_classes.Player;

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
		Player battleWinner = null;

		while (!deck.getInstance().isEmpty()) 
		{
			System.out.println("Battle #" + index);
			System.out.println("Number of cards in the game right now: " + deck.getInstance().getNumberOfCardsLeft());

			allPlayers.forEach((onePlayer) -> onePlayer.takeCard(deck));

			allPlayers.sort((player1, player2) -> player2.card - player1.card);
			allPlayers.forEach(p -> System.out.println(p));

			battleWinner = allPlayers.get(0);
			battleWinner.addScore();
			System.out.println("The Winner in this battle: " + battleWinner.name);
			System.out.println("=====================================\n");

			index++;
		}
		
		finalResult();
	}
	
	private void finalResult() 
	{
		int max = -1, points = 0;
		int  resultOfwinning = 0;
		String nameOfGameWinner = null;

		for (int i = 0; i < allPlayers.size(); i++) 
		{
			points = allPlayers.get(i).getScore();
			PrintMSG.finakGameMessage();
			System.out.println(allPlayers.get(i).getName() + " have " + points+" points.");
			if(points > max) 
			{
				max = points;
				resultOfwinning = i;
				nameOfGameWinner=allPlayers.get(i).getName();
			}
		}
		System.out.println("Congratulations to " + nameOfGameWinner + " win the War-Game with "+ max + " points :)");
	}
}
