package mvc.studentGradeSystem_runner;

import mvc.studentGradeSystem_classes.StudentView;

public class Runner 
{
	public static void main(String[] args) 
	{
		StudentView view = new StudentView();
		StudentController controller = new StudentController(view);
		controller.startApp();
	}
}