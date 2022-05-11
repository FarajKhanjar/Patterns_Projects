package factoryMethod.screenTheme_main;

public abstract class Theme 
{
	TextColor textStyle;
	ThemeType themeStyle;
	
	public Theme() 
	{
		
	}

	@Override
	public String toString() 
	{
		return String.format("Theme [Its a: " + textStyle + " text, The background is: " + themeStyle + "]");
	}
}
