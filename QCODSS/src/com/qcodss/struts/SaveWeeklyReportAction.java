package com.qcodss.struts;

import com.qcodss.dao.WeeklyReportDAO;
import com.qcodss.reportcontroller.ReportController;
import com.qcodss.reportmodels.WeeklyReport;



public class SaveWeeklyReportAction {
	
	public Integer year;
	public Integer weekNo;
	public Integer plantId;
	WeeklyReport wr = null;
	WeeklyReport newWr = null;
	int value = 0;
	
	public String execute(){
	
		String returnVal = "error";
		WeeklyReportDAO wrDao = new WeeklyReportDAO();
		ReportController weeklyReportController = null;
		
		
		if(checkRecordExist()==0){
			weeklyReportController = new ReportController(weekNo, year, plantId);
			value = wrDao.addWeeklyReport(weeklyReportController.getReport());
		}else{
			wr = wrDao.getWeeklyReport(checkRecordExist());
			weeklyReportController = new ReportController(weekNo, year, plantId);
			newWr =weeklyReportController.getReport();
			newWr.setId(wr.getId());   
			value = wrDao.addWeeklyReport(newWr);
		}

		
		
		if(value==1){
			returnVal = "success";
		}
	
	return returnVal;
	}

	public int checkRecordExist(){
		
		int id=0;
		
		WeeklyReportDAO wrDao = new WeeklyReportDAO();
		
		id = wrDao.getReportID(year, plantId, weekNo);
		System.out.println("Record id is :" + id);
		
		return id;
	}
	
}

