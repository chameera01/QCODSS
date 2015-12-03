package com.qcodss.struts;

import java.util.List;

import com.qcodss.dao.WeeklyReportDAO;
import com.qcodss.reportmodels.WeeklyReport;

public class WRGeneratorAction {
	
	public int weekNo;
	public int year;
	public int plantID;
	
	public List<WeeklyReport> wRList = null;
	
	public String execute(){
		
//		WeeklyReportDAO wRDAO = new WeeklyReportDAO();
//		wRList = wRDAO.getWRbyPlantWeekYear(year, plantID, weekNo);
//		
//		System.out.println("execute");
		
		return "success";
	}
	
	public String wRSingleGenerator(){
		
		WeeklyReportDAO wRDAO = new WeeklyReportDAO();
		wRList = wRDAO.getWRSinglebyPlantWeekYear(year, plantID, weekNo);
		
		System.out.println("single");
		
		return "success";
	}
	
	public String wRAllGenerator(){
		
		WeeklyReportDAO wRDAO = new WeeklyReportDAO();
		wRList = wRDAO.getWRAllbyPlantYear(year, plantID);
		
		System.out.println("All");
		
		return "success";
	}

}
