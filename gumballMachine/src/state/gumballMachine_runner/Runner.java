package state.gumballMachine_runner;


public class Runner 
{
    public static void main(String[] args) 
    {
        welcomeGumballMachine gumballMachine = new welcomeGumballMachine();
        gumballMachine.payAGum();
        System.out.println(gumballMachine);
        
    }
}
