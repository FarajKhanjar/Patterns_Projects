package state.gumballMachine_demo;

public class Has5State extends State implements StateInterface
{
	Has5State(GumballMachine gumball) 
	{
		super(gumball);
	}  



	@Override
	public boolean onInsert5() {
		System.out.println("Balance: 10");
		gumball.setState(new Has10State(gumball));
		return false;
	}

	@Override
	public boolean onInsert10() {
		System.out.println("Balance: 15");
		gumball.setState(new Has15State(gumball));
		return false;
	}

	@Override
	public boolean takeGum() {
		System.out.println("Insufficient funds - I want more ...");
		return false;
	}

}
