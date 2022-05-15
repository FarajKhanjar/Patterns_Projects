package observer.newsCompany_runner;

public class Report 
{
	private String message;
	private ReportType typeOfReport;

	public Report(String message, ReportType reportType) 
	{
		this.message = message;
		this.typeOfReport = reportType;
	}

	public String getMessage() 
	{
		return message;
	}
	
	public ReportType getReportType() 
	{
		return typeOfReport;
	}
	
	public enum ReportType
	{
		SPORT,
		WEATHER,
		GENERAL_NEWS;
	}

	@Override
	public String toString() {
		return "Report [message=" + message + ", typeOfReport=" + typeOfReport + "]";
	}
}