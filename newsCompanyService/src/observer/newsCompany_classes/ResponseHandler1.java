package observer.newsCompany_classes;

import observer.newsCompany_runner.Report;

public class ResponseHandler1 implements Observer 
{
    private String response_phoneNumber;
    
    public ResponseHandler1(String phoneNumber) 
    {
    	
    	this.response_phoneNumber = phoneNumber;
    }

	@Override
	public void update(Report report) 
	{
        System.out.println("\nReceived Response to phone number: " + response_phoneNumber + ". Report: "+report.getMessage());		
	}
}