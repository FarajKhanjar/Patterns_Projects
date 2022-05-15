package dressesMaker.decorator_classes;

public class BasicDress implements Dress
{
	private String color;
	private String size;
	
	public BasicDress(String color, String size) 
	{	
		this.color = color;
		this.size = size;
	}
	
	@Override
	public void makingDress()
	{
		System.out.print(this); 
		
	}
	

	@Override
	public String toString() 
	{
		return "BasicDress [color=" + color + ", size=" + size + "]";
	}
	
	@Override
	public double dressPrice()
	{  
        return 50.0;  
    }  
}