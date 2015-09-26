package com.qcodss.struts;



import com.qcodss.reportcontroller.ReportController;
import com.qcodss.reportmodels.WeeklyReport;

public class LoadWeeklyReportAction {
	
	String returnVal = "success";
	public Integer weekNumber;
	public Integer plantName;
	public Integer year;
	public WeeklyReport wr = new WeeklyReport();
	
	
	public String execute(){
		ReportController wrc = new ReportController(weekNumber, year, plantName);
		wr = wrc.getReport();
		
		
		
		return returnVal;
	}
	
}
