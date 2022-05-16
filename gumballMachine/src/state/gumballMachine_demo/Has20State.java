package state.gumballMachine_demo;

public class Has20State extends State implements StateInterface
{
	Has20State(GumballMachine gumball) 
	{
		super(gumball);
	}  
	

	@Override
	public boolean onInsert5() {
		System.out.println("Balance: 25");
		gumball.setState(new SoldState(gumball));
		return false;
	}

	@Override
	public boolean onInsert10() {
		System.out.println("Exact change must be insterted - Use a 5 cents coin instead");
		return false;
	}

	@Override
	public boolean takeGum() {
		System.out.println("Insufficient funds - I want more ...");
		return false;
	}

}
