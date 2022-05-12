package builder.bakery_classes;

public class RecipeBuilder implements Builder
{
	private PastryType pastryType;
	private int mozzarellaCheese;
	private int fetaCheese;
	private int mushroom;
	private int pineapple;
    
    public Recipe getResult() 
    {
        return new Recipe(pastryType, mozzarellaCheese, fetaCheese, mushroom, pineapple);
    }

	@Override
	public void setPastryType(PastryType pastryType) 
	{
		this.pastryType = pastryType;
		
	}

	@Override
	public void setMozzarellaCheeseAmount(int mozzarellaCheese) 
	{
		this.mozzarellaCheese = mozzarellaCheese;
		
	}

	@Override
	public void setFetaCheeseAmount(int fetaCheese) 
	{
		this.fetaCheese = fetaCheese;
		
	}

	@Override
	public void setMushroomsAmount(int mushroom) 
	{
		this.mushroom = mushroom;
		
	}

	@Override
	public void setPineappleAmount(int pineapple) 
	{
		this.pineapple = pineapple;
		
	}

}
