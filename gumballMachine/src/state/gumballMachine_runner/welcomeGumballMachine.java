package state.gumballMachine_runner;

import java.util.Scanner;

import state.gumballMachine_demo.GumballMachine;
import state.gumballMachine_demo.State;

public class welcomeGumballMachine 
{

	private Scanner scan;
	private static final int NUM_GUMS = 500;
    private static int count = NUM_GUMS;
    private GumballMachine gumball;
    
    public welcomeGumballMachine()
    {
    	this.gumball = new GumballMachine();
    	scan = new Scanner(System.in);
    }
    
    public void payAGum()
    {
         while(count>0)
         {
        	System.out.println(toString());
         	machineOptions();
 			int choice = Integer.parseInt(scan.next());
 			action(choice);
         }
         System.out.println("You can't insert a quarter, the machine is sold out");
    }

	private void action(int choice) 
	{
		System.out.println("Please wait....");
		State state = (State) gumball.getState();
		if(choice == 1)
		{
			state.onInsert5();
		}
		else if (choice == 2)
		{
			state.onInsert10();
		}
		else
		{
			state.takeGum();
		}
	}
   
    public static void releaseBall()
    {
        System.out.println("A gumball comes rolling out the slot...\n");
        if(count != 0)
        {
            count = count - 1;
        }
        System.out.println("You can't insert a quarter, the machine is sold out");
    }
    
    protected int getCount()
    {
        return this.count;
    }
    
    private void machineOptions() 
    {
		System.out.println("Please enter:");
		System.out.println("1 - if you're inserting a 5 cents coin");
		System.out.println("2 - if you're inserting a 10 cents coin");
		System.out.println("3 - To collect the gum...");
	}
    
    @Override
    public String toString()
    {
        StringBuffer result = new StringBuffer();
        result.append("\nInventory: " + this.count + " gumball");
        if (count != 1) 
        {
                result.append("s");
        }
        result.append("\n");
        result.append("Machine is " + gumball.getState() + "\n");
        return result.toString();
    }
}
