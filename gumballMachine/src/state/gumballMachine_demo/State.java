package state.gumballMachine_demo;

public abstract class State implements StateInterface
{
	GumballMachine gumball;

    State(GumballMachine gumball) 
    {
        this.gumball = gumball;
    }
}
