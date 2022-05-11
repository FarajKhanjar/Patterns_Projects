package singalton.warCardGame_classes;

public class Player 
{
	public String name;
	public int card;
	protected int score;
	
	public Player(String name) 
	{
		this.name = name;
		card = 0;
		score = 0;
	}
	
	public void addScore() 
	{
		score ++;
	}
	
	public int getScore() 
	{
		return score;
	}
	
	public String getName() 
	{
		return name;
	}
	
	public void setCard(int value) {
		card = value;
	}
	
	public void takeCard(Deck deck) 
	{
		card = deck.getInstance().takeOneCardFromDeck();
	}

	@Override
	public String toString() 
	{
		return "Player [name=" + name + ", card=" + card + ", score=" + score + "]";
	}

}
