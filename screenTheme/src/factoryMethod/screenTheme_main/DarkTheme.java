package factoryMethod.screenTheme_main;

public class DarkTheme extends Theme
{
	public DarkTheme() 
	{
		this.textOutput = "WHITE Text - Dark Theme";
		this.textStyle = TextColor.WHITE;
		this.themeStyle = ThemeType.DARK;
	}
}