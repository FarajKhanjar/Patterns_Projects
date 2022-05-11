package factoryMethod.screenTheme_main;

public class FactoryOfDarkTheme implements ThemeFactory
{
	@Override
	public Theme createTheme() 
	{
		return new DarkTheme();
	}
}
