package observer.newsCompany_classes;

import observer.newsCompany_runner.Report;

public class ResponseHandler2 implements Observer 
{
	private String response_email;
    
    public ResponseHandler2(String email) 
    {
    	
    	this.response_email = email;
    }

	@Override
	public void update(Report report) 
	{
        System.out.println("\nReceived Response to email: " + response_email+". Report: "+report.getMessage());		
	}
}