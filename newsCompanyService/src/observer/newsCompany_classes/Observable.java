package observer.newsCompany_classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import observer.newsCompany_runner.Report;
import observer.newsCompany_runner.Report.ReportType;

public class Observable 
{
	Map<ReportType, List<Observer>> response_phoneNumber = new HashMap<>();
	Map<ReportType, List<Observer>> response_email = new HashMap<>();

	public Observable(ReportType... operations) 
	{
		for (ReportType operation : operations) 
		{
			response_phoneNumber.put(operation, new ArrayList<>());
			response_email.put(operation, new ArrayList<>());
		}
	}

	public void subscribe(ReportType eventType, ResponseHandler1 sms) 
	{
		List<Observer> users = response_phoneNumber.get(eventType);
		users.add(sms);
	}

	public void subscribe(ReportType eventType, ResponseHandler2 email) 
	{
		List<Observer> users = response_email.get(eventType);
		users.add(email);
	}

	public void unsubscribe(ReportType eventType, Observer listener) 
	{
		List<Observer> users = response_email.get(eventType);
		if (users.contains(listener))
			users.remove(listener);
		users = response_phoneNumber.get(eventType);
		if (users.contains(listener))
			users.remove(listener);
	}

	public void notify(Report report) 
	{
		ReportType reportType = report.getReportType();
		List<Observer> users = response_phoneNumber.get(reportType);
		users.addAll(response_email.get(reportType));
		for (Observer listener : users) 
		{
			listener.update(report);
		}
	}
}