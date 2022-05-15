package observer.newsCompany_classes;

import observer.newsCompany_runner.Report;
import observer.newsCompany_runner.Report.ReportType;

public class EventSource extends Observable
{
	    public Observable events;
	    
	    public EventSource() 
	    {
	        this.events = new Observable(ReportType.values());
	    }

	    public void sendReport(Report response) 
	    {
	        events.notify(response);
	    }
}