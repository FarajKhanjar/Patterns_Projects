package state.gumballMachine_demo;



public class NoQuarterState extends State implements StateInterface
	{
		NoQuarterState(GumballMachine gumball) 
		{
			super(gumball);
		}  
		
   

    
    @Override
    public String toString()
    {
        return "waiting for quarter";
    }

	@Override
	public boolean onInsert5() {
		System.out.println("Balance: 5");
		gumball.setState(new Has5State(gumball));
		return false;
	}

	@Override
	public boolean onInsert10() {
		System.out.println("Balance: 10");
		gumball.setState(new Has10State(gumball));
		return false;
	}

	@Override
	public boolean takeGum() {
		System.out.println("Insufficient funds - I want more ...");
		return false;
	}
}
