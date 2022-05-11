package factoryMethod.screenTheme_main;

public class FactoryOfBrightTheme implements ThemeFactory
{
	@Override
	public Theme createTheme() 
	{
		return new BrightTheme();
	}
}