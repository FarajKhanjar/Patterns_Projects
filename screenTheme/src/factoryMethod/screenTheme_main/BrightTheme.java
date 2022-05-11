package factoryMethod.screenTheme_main;

public class BrightTheme extends Theme
{
	public BrightTheme() 
	{
		this.textOutput = "WHITE Text - Dark Theme";
		this.textStyle = TextColor.BLACK;
		this.themeStyle = ThemeType.BRIGHT;
	}
}