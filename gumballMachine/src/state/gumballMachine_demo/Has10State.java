package state.gumballMachine_demo;

public class Has10State extends State implements StateInterface
	{
		Has10State(GumballMachine gumball) 
		{
			super(gumball);
		}   
	


	@Override
	public boolean onInsert5() {
		System.out.println("Balance: 15");
		gumball.setState(new Has15State(gumball));
		return false;
	}

	@Override
	public boolean onInsert10() {
		System.out.println("Balance: 20");
		gumball.setState(new Has20State(gumball));
		return false;
	}

	@Override
	public boolean takeGum() {
		System.out.println("Insufficient funds - I want more ...");
		return false;
	}

}
