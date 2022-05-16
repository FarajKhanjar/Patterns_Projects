package state.gumballMachine_demo;

public class Has15State extends State implements StateInterface
{
	Has15State(GumballMachine gumball) 
	{
		super(gumball);
	}  
	


	@Override
	public boolean onInsert5() {
		System.out.println("Balance: 20");
		gumball.setState(new Has20State(gumball));
		return false;
	}

	@Override
	public boolean onInsert10() {
		System.out.println("Balance: 25");
		gumball.setState(new SoldState(gumball));
		return false;
	}

	@Override
	public boolean takeGum() {
		System.out.println("Insufficient funds - I want more ...");
		return false;
	}

}
