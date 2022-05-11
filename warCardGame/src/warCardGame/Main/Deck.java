package warCardGame.Main;

import java.util.ArrayList;
import java.util.Random;

public class Deck 
{
	//lazy singleton
	private static Deck instance = null;
	private static final int NUMBER_CARDS = 60;	
	protected ArrayList<Integer> allCards;
	
	private Deck() 
	{
		addCards();
	}
	
	public static Deck getInstance() 
	{
		if (instance == null) 
		{
			instance = new Deck();
		}
		
		return instance;
	}
	
	public boolean isEmpty() 
	{
		return allCards.isEmpty();
	}
	
	protected void addCards() 
	{
		allCards = new ArrayList<Integer>();
		
		for (int i = 1; i<=NUMBER_CARDS; i++) 
		{ 
			allCards.add(i);
		}
	}
	
	public int takeOneCardFromDeck() 
	{
		Random ra = new Random();
		int index = ra.nextInt(0, allCards.size());
		int card = allCards.remove(index);
		return card;
	}
	
	public int getNumberOfCardsLeft() 
	{
		return allCards.size();
	}
}