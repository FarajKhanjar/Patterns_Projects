package mvc.studentGradeSystem_classes;

public class StudentModel 
{
	private String firstName;
	private String lastName;
	private long IDnumber;
	private final int NUM_GRADES = 3;
	private double[] gradesArray = new double [NUM_GRADES];
	
	public StudentModel(String firstName, String lastName, long IDnumber, double[] grades) 
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.IDnumber = IDnumber;
		this.gradesArray = grades;
	}
	
	public double calculateTheAverage() 
	{
		double sum = 0;
		for (int i = 0; i < gradesArray.length; i++) 
		{
			sum += gradesArray[i];
		}
		return sum / gradesArray.length;
	}
}
