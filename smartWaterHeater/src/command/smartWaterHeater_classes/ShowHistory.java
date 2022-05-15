package command.smartWaterHeater_classes;

import java.util.ArrayList;
import java.util.List;

public class ShowHistory
{
	private List<Command> appHistory;
    
    public ShowHistory() 
    {
    	appHistory = new ArrayList<>();
    }

    public void addToArray(Command command) 
    {
        appHistory.add(command);
    }

    public List<Command> showArrayHistory() 
    {
        return appHistory;
    }
}
