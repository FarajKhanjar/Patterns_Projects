package observer.newsCompany_runner;

import observer.newsCompany_classes.EventSource;
import observer.newsCompany_classes.ResponseHandler1;
import observer.newsCompany_classes.ResponseHandler2;
import observer.newsCompany_runner.Report.ReportType;

public class Runner 
{
	private static EventSource manageEvents = new EventSource();
	
	public static void main(String[] args) 
	{
		getEvents();
		getReports();
	}
	
	private static void getEvents()
	{
		ResponseHandler1 sms_1 = new ResponseHandler1("0542459909");
		ResponseHandler1 sms_2 = new ResponseHandler1("0509969125");
		ResponseHandler1 sms_3 = new ResponseHandler1("0507565516");
		ResponseHandler1 sms_4 = new ResponseHandler1("0507198874");
		
		ResponseHandler2 email_1 = new ResponseHandler2("farajkhanjar@gmail.com");
		ResponseHandler2 email_2 = new ResponseHandler2("drtal@gmail.com");
		
		manageEvents.events.subscribe(ReportType.SPORT, sms_1);
		manageEvents.events.subscribe(ReportType.GENERAL_NEWS, sms_2);
		manageEvents.events.subscribe(ReportType.WEATHER, email_1);
		manageEvents.events.subscribe(ReportType.WEATHER, sms_3);
		manageEvents.events.subscribe(ReportType.GENERAL_NEWS, sms_4);
		manageEvents.events.subscribe(ReportType.SPORT, email_2);
	}
	
	private static void getReports()
	{
		Report sportReport = new Report("Wariors Won!!", ReportType.SPORT);
		manageEvents.sendReport(sportReport);
		Report newsReport = new Report("Peace finally arrived to the middle east", ReportType.GENERAL_NEWS);
		manageEvents.sendReport(newsReport);
		Report weatherReport = new Report("Volcano errapted in Hawaii", ReportType.WEATHER);
		manageEvents.sendReport(weatherReport);
	}
}