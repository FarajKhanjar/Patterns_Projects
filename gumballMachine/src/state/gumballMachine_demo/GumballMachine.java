package state.gumballMachine_demo;

public class GumballMachine 
{
	private static final int NUM_GUMS = 500;
    private State state;
    private int numberGumballs = NUM_GUMS;
    
    public GumballMachine()
    {
        this.state = new NoQuarterState(this); 
        setCount(numberGumballs);
    }

    protected void setState(State state)
    {
        this.state = state;
    }
    
    protected int getCount()
    {
        return this.numberGumballs;
    }
    
    
    public StateInterface getState()
    {
        return this.state;
    }
    
    public void setCount(int numberGumballs) 
    {
    	numberGumballs--;
    }
    
}
