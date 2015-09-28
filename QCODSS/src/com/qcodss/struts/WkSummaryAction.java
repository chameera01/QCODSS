package com.qcodss.struts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.qcodss.reportcontroller.ReportController;
import com.qcodss.reportmodels.WeeklyReport;

public class WkSummaryAction {
	
	private List<Map> allWeeklyReports = new ArrayList<Map>() ;
	
	public String execute(){

		ReportController rc = null;
		WeeklyReport wr = null;
		Map<String, Double> weeklyReport = null;
		
		for(int i=1;i<3;i++){
			
			rc = new ReportController(2, 2015, 1);
			wr = rc.getReport();
		
			weeklyReport = new HashMap<String, Double>();
		    
			weeklyReport.put("numberOfNew", (double)wr.getNumberOfNew() );
			weeklyReport.put("numberOfRepeat", (double)wr.getNumberOfRepeat() );
			weeklyReport.put("averageQCOTime", (double)wr.getAverageQCOTime() );
			
			weeklyReport.put("avgEff_1", wr.getAvgEff_1() );
			weeklyReport.put("avgEff_2", wr.getAvgEff_2() );
			weeklyReport.put("avgEff_3", wr.getAvgEff_3() );
			weeklyReport.put("avgEff_4", wr.getAvgEff_4() );
			weeklyReport.put("avgEff_5", wr.getAvgEff_5());
			
			weeklyReport.put("avgEff_1d", wr.getAvgEff_1d() );
			weeklyReport.put("avgEff_2d", wr.getAvgEff_2d() );
			weeklyReport.put("avgEff_3d", wr.getAvgEff_3d() );
			
			weeklyReport.put("avgEff_new123", wr.getAvgEff_new123());
			weeklyReport.put("avgEff_repeat123", wr.getAvgEff_repeat123() );
			weeklyReport.put("avgEff_123", wr.getAvgEff_123() );
			
			weeklyReport.put("EPR_123n", wr.getEPR_123n() );
			weeklyReport.put("EPR_123r", wr.getEPR_123r() );
			weeklyReport.put("EPR_123", wr.getEPR_123() );
			
			weeklyReport.put("avgFeedingTime", wr.getAvgFeedingTime() );
			weeklyReport.put("fullPresettingHR", wr.getFullPresettingHR() );
			weeklyReport.put("abHR", wr.getSbHR() );
			weeklyReport.put("avgEff_newTarget", wr.getAvgEff_newTarget() );
			weeklyReport.put("avgEff_repeatTarget", wr.getAvgEff_repeatTarget());
			weeklyReport.put("avgEff_45", wr.getAvgEff_45());
	
			allWeeklyReports.add(weeklyReport);
			
//			System.out.println("*** "+wr.getAvgEff_1d());
//			System.out.println("** "+wr.getAvgEff_45());
		
		}
		
		return "success";
	}

	public List<Map> getAllWeeklyReports() {
		return allWeeklyReports;
	}

	public void setAllWeeklyReports(List<Map> allWeeklyReports) {
		this.allWeeklyReports = allWeeklyReports;
	}
	
	

}
