package dressesMaker.decorator_classes;

public abstract class DressDecorator implements Dress
{
	private Dress newDress;
	
	public DressDecorator(Dress newDress)
	{
		
		this.newDress=newDress;
		
	}
	
	@Override
	public void makingDress()
	{
		newDress.makingDress(); 		
	}
	
	 public double dressPrice()
	 {  
	        return newDress.dressPrice();  
	 }
}