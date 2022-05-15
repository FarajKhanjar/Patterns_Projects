package dressesMaker.decorator_runner;

import java.util.Scanner;

import dressesMaker.decorator_classes.BasicDress;
import dressesMaker.decorator_classes.CasualDressDecorator;
import dressesMaker.decorator_classes.Dress;
import dressesMaker.decorator_classes.FancyDressDecorator;
import dressesMaker.decorator_classes.SportyDressDecorator;

public class Runner 
{
	private static int choice;
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String args[])
	{
		do {
			System.out.print("========= Dresses Making Menu ============ \n");
			System.out.print("1. A basic dress.\n");
			System.out.print("2. A basic but fancy dress.\n");
			System.out.print("3. A basic but casual dress.\n");
			System.out.print("4. A basic fancy but sporty dress.\n");
			System.out.print("5. A basic fancy but casual dress.\n");
			System.out.print("6. A basic sporty casual but fancy dress.\n");
			System.out.print("7. Exit\n");  
			System.out.print("Enter your dress choice: ");

			choice = scanner.nextInt();
			Dress basicDress = new BasicDress("Red", "S");

			switch (choice) 
			{
			case 1: 
			{  
				basicDress.makingDress();
				basicDress.toString();
				System.out.println("\nDress price:" + basicDress.dressPrice());
			}
				break;

			case 2:
			{
				Dress basicFancyDress = new FancyDressDecorator(basicDress);
				basicFancyDress.makingDress();
				basicFancyDress.toString();
				System.out.println("\nDress price:" + basicFancyDress.dressPrice());
			}
				break;

			case 3:
			{
				Dress basicCasualDress = new CasualDressDecorator(basicDress);
				basicCasualDress.makingDress();
				basicCasualDress.toString();
				System.out.println("\nDress price:" + basicCasualDress.dressPrice());
			}
				break;
				
			case 4:
			{
				Dress basicFancyDress = new FancyDressDecorator(basicDress);
				Dress basicFancySportyDress = new SportyDressDecorator(basicFancyDress);
				basicFancySportyDress.makingDress();
				basicFancySportyDress.toString();
				System.out.println("\nDress price:" + basicFancySportyDress.dressPrice());
			}
				break;
				
			case 5:
			{
				Dress basicFancyDress = new FancyDressDecorator(basicDress);
				Dress basicFancyCasualDress = new CasualDressDecorator(basicFancyDress);
				basicFancyCasualDress.makingDress();
				basicFancyCasualDress.toString();
				System.out.println("\nDress price:" + basicFancyCasualDress.dressPrice());
			}
				break;
				
			case 6:
			{
				Dress sportyDressDecorator = new SportyDressDecorator(basicDress);
				Dress casualDressDecorator =  new CasualDressDecorator(sportyDressDecorator);
				Dress basicFancyCasualDress = new FancyDressDecorator(casualDressDecorator);
				basicFancyCasualDress.makingDress();
				basicFancyCasualDress.toString();
				System.out.println("\nDress price:" + basicFancyCasualDress.dressPrice());
			}
				break;

			default: 
			{
				System.out.println("Other than these no dresses available");
			}
				return;
			}

		} while (choice != 7);
	}
}