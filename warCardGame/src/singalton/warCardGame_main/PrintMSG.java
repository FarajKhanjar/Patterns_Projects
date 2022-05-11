package singalton.warCardGame_main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import singalton.warCardGame_classes.Player;

public class PrintMSG 
{
	public static  Scanner in = new Scanner(System.in);

    public static void openingMessage() 
    {
        System.out.println("It's a war of cards!\n" +
                "The game ends if the pack of cards is empty and there’s a single player "
                + "who won most of the battles.\n");
        
        System.out.println("How many players in the game? (2 to 4 players)");
    }
    
    public static List<Player> inputPlayersNameMessage(int SIZE) 
    {
    	List<Player> allPlayers = new ArrayList<Player>(SIZE);
    	for (int i = 1; i <= SIZE; i++) 
    	{
    		if(i==SIZE)
    	    System.out.println("Indicate that you are ready by hitting the last player name & enter.");
    		
    		System.out.println("Please enter the name of player #"+i);
    		String name = in.nextLine();
    		Player player = new Player(name);
    		allPlayers.add(player);		
		} 
        return allPlayers;
    }

    public static void startGameMessage() 
    {
        System.out.printf("let's Play!\n\n");
    }
    
    public static void finakGameMessage() 
    {
        System.out.printf("final results:\n\n");
    }
}
