package dressesMaker.decorator_classes;

public class CasualDressDecorator extends DressDecorator 
{
	public CasualDressDecorator(Dress newDress) 
    {
		super(newDress);		
	}

	@Override
	public void makingDress() 
	{
		super.makingDress();
		System.out.print(" With Casuality Added...");
	}

	
	@Override
	public double dressPrice()
	{

		return super.dressPrice() +25.0;
		
	}

	@Override
	public String toString() 
	{
		return "CasualDressDecorator []";
	}
}