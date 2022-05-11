package factoryMethod.screenTheme_main;

import java.util.Scanner;

public class Runner 
{
	private static Scanner scan = new Scanner(System.in);
	private static ThemeFactory themeFactory;

	public static void main(String[] args) 
	{
		int choice;
		
		System.out.println("Enter 1 for dark 2 for bright");
		choice = Integer.parseInt(scan.nextLine());
		
		if (choice == 1) 
			themeFactory = new FactoryOfDarkTheme();
		else
			themeFactory = new FactoryOfBrightTheme();
		
		Theme theme = themeFactory.createTheme();
		System.out.println(theme);
		
		scan.close();
	}
}