package dressesMaker.decorator_classes;

public class FancyDressDecorator extends DressDecorator 
{
	public FancyDressDecorator(Dress newDress) 
    {
		super(newDress);		
	}

	@Override
	public void makingDress() 
	{
		super.makingDress();
		System.out.print(" With Fancyity Added...");
	}

	
	@Override
	public double dressPrice()
	{

		return super.dressPrice() +15.0;
		
	}

	@Override
	public String toString() 
	{
		return "FancyDressDecorator []";
	}
}