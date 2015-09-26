package com.qcodss.test;

import java.util.ArrayList;
import java.util.List;

import com.qcodss.reportcontroller.ReportController;
import com.qcodss.reportmodels.WeeklyReport;

public class TestAllWeeks {
	
	public static void main(String args[]){
		
		List<WeeklyReport> allWeeks =  new ArrayList<WeeklyReport>();
		ReportController rc = null;
		
		for(int i=0; i<52;i++){
			rc = new ReportController(i, 2015, 1);
			allWeeks.add(rc.getReport());
		}
		
	
		WeeklyReport wr = new WeeklyReport();
		wr = allWeeks.get(2);
		
		System.out.println(wr.getAverageQCOTime());
		
		
	}
	
	
}
