package builder.bakery_classes;

public class PastryBuilder implements Builder 
{
	private PastryType pastryType;
	private int MozzarellaCheeseAmount;
	private int FetaCheeseAmount;
	private int MushroomsAmount;
	private int PineappleAmount;
	
	public Pastry getResult() 
	{
		return new Pastry(pastryType, MozzarellaCheeseAmount, FetaCheeseAmount, MushroomsAmount, PineappleAmount);
	}

	@Override
	public void setPastryType(PastryType pastryType) 
	{
		this.pastryType = pastryType;		
	}

	@Override
	public void setMozzarellaCheeseAmount(int MozzarellaCheeseAmount) 
	{
		this.MozzarellaCheeseAmount = MozzarellaCheeseAmount;		
	}

	@Override
	public void setFetaCheeseAmount(int FetaCheeseAmount) 
	{
		this.FetaCheeseAmount = FetaCheeseAmount;		
	}

	@Override
	public void setMushroomsAmount(int MushroomsAmount) 
	{
		this.MushroomsAmount = MushroomsAmount;		
	}

	@Override
	public void setPineappleAmount(int PineappleAmount) 
	{
		this.PineappleAmount = PineappleAmount;		
	}    
}