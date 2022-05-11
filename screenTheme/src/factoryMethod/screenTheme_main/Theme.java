package factoryMethod.screenTheme_main;

public abstract class Theme 
{
	protected TextColor textStyle;
	protected ThemeType themeStyle;
	protected String textOutput;
	
	public Theme() 
	{
		
	}
	
	@Override
	public String toString() 
	{
		return String.format("[Its a: " + textStyle + " text, The background is: " + themeStyle + "]");
	}
}