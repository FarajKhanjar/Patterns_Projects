package command.smartWaterHeater_runner;

import java.util.List;

import command.smartWaterHeater_classes.Command;
import command.smartWaterHeater_classes.ShowHistory;
import command.smartWaterHeater_classes.TurnOff;
import command.smartWaterHeater_classes.TurnOn;

public class HeaterApp 
{
	private ShowHistory saveHistory;

	public HeaterApp() 
	{
		saveHistory = new ShowHistory();
	}

	public void turnOn(int time) 
	{
		TurnOn onCommand = new TurnOn(time);
		onCommand.execute();
		saveHistory.addToArray(onCommand);
	}

	public void turnOff() 
	{
		TurnOff offCommand = new TurnOff();
		offCommand.execute();
		saveHistory.addToArray(offCommand);
		
	}

	public void showHistory() 
	{
		int firstHistoryCommand = 5 ;
		List<Command> allCommands = saveHistory.showArrayHistory();
		for (int i = allCommands.size()-firstHistoryCommand ; i < allCommands.size(); i++) 
		{
			allCommands.get(i).execute();
		}
	}
}
