package mvc.studentGradeSystem_runner;

import mvc.studentGradeSystem_classes.StudentModel;
import mvc.studentGradeSystem_classes.StudentView;

public class StudentController 
{
	private StudentView view;
	private StudentModel student;
	private final int EXCELLENT_GRADE = 90;
	private final int NUMBER_COURSES = 3;
	
	public StudentController(StudentView view) 
	{
		this.view = view;
	}

	void startApp() 
	{
		String firstName = view.getFirstName();
		String lastName = view.getLastName();
		long Idnumber = view.getId();
		double[] grades = view.getGrades(NUMBER_COURSES);
		
		student = new StudentModel(firstName, lastName, Idnumber, grades);
		double studentAverage = student.calculateTheAverage();
		
		String status;
		if(EXCELLENT_GRADE<=studentAverage)
		{
			status = "EXCELLENT";	
		}
		else
		{
			status = "Great";
		}
		status+=" Student! your average of 3 courses:";
		String message = firstName + " You are a " + status;
		view.showMessage(message, studentAverage);
	}
}
