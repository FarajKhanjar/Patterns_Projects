package command.smartWaterHeater_classes;

import java.time.LocalTime;

public class TurnOn implements Command
{
	private final int MAX_TIME_ON = 90;
	private int time;
	 
    public TurnOn(int time) 
    {
    	setTimeOn(time);
    }
    
    public void setTimeOn(int time) 
    {
		if (time > MAX_TIME_ON) 
		{
			time = MAX_TIME_ON;
		}
		if (time < 0) 
		{
			time = 10;
		}
		this.time = time;
	}
    
	@Override
	public void execute() 
	{
		System.out.println("Heater turned on for "+this.time+" minutes on "+LocalTime.now());		
	}
}