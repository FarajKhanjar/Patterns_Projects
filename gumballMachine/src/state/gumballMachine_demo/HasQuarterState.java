package state.gumballMachine_demo;


public class HasQuarterState extends State implements StateInterface
{
	HasQuarterState(GumballMachine gumball) 
	{
		super(gumball);
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
		return true;
	}
}
