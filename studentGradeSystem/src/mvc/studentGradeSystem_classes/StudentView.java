package mvc.studentGradeSystem_classes;

import javax.swing.JOptionPane;

public class StudentView
{
	public String getFirstName() 
	{
		return getUserInput("Enter your first name:");
	}
	
	public String getLastName() 
	{
		return getUserInput("Enter your last name:");
	}
	
	public long getId() 
	{
		return Long.parseLong(getUserInput("Enter your ID number:"));
	}
	
	
	public double[] getGrades(int size)
	{
		double[] grades = new double[size];
		for (int i = 1; i <= size; i++) 
		{
			String grade = JOptionPane.showInputDialog("Enter grade #"+i+":");
			grades[i-1] = Double.parseDouble(grade);
		}
		return grades;
	}
	
	private String getUserInput(String message) 
	{
		return JOptionPane.showInputDialog(message);
	}
	
	protected int showInputDialog(String message) 
	{
		String input = JOptionPane.showInputDialog(message);
		return Integer.parseInt(input);
	}
	
	public <T extends Number> void showMessage(String text, T value) 
	{
		JOptionPane.showMessageDialog(null, text + " " + value);

	}
	

}
