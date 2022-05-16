package state.gumballMachine_demo;

import state.gumballMachine_runner.welcomeGumballMachine;

public class SoldState extends State implements StateInterface
{
		SoldState(GumballMachine gumball) 
		{
			super(gumball);
		}  

    
    @Override
    public String toString()
    {
        return "dispensing a gumball";
    }

	@Override
	public boolean onInsert5() {
		System.out.println("Take the gum first!!");
		return false;
	}

	@Override
	public boolean onInsert10() {
		return onInsert5();
	}

	@Override
	public boolean takeGum() {
		System.out.println("Enjoy!!");
		welcomeGumballMachine.releaseBall();
		return true;
	}
}
