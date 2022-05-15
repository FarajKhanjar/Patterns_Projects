package command.smartWaterHeater_classes;

import java.time.LocalTime;

public class TurnOff implements Command
{
    public TurnOff() 
    {
        
    }
    
	@Override
	public void execute() 
	{
		System.out.println("Heater turned off on "+LocalTime.now());
		
	}

}
