package dressesMaker.decorator_classes;

public class SportyDressDecorator extends DressDecorator 
{
	public SportyDressDecorator(Dress newDress) 
    {
		super(newDress);		
	}

	@Override
	public void makingDress() 
	{
		super.makingDress();
		System.out.print(" With Sportiness Added...");
		
	}

	
	@Override
	public double dressPrice()
	{
		return super.dressPrice() +35.0;		
	}

	@Override
	public String toString() 
	{
		return "SportyDressDecorator []";
	}
}