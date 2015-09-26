package com.qcodss.struts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.qcodss.reportcontroller.ReportController;
import com.qcodss.reportmodels.MonthlyReport;


public class CenterChartAction {
	

	
	private List<Map> allMonthes = new ArrayList<Map>() ;
	
	
	
	

	

	public String execute(){
		
		String returnVal = "success";
		
		ReportController rc = null;
		MonthlyReport mr = null;
		
		
		
		
		for(int i=1;i<3;i++){
		
			rc = new ReportController("January", 2015, 1);
			
			mr = rc.getMonthlyReport();
		
			
		
			Map<String, Double> maps = new HashMap<String, Double>();
			
			//maps.put("month", (double)mr.getNumberOfNew() );
			maps.put("noOfNew", (double)mr.getNumberOfNew() );
			maps.put("noOfRepeat", (double)mr.getNumberOfRepeat() );
			maps.put("newActual", mr.getAvgEff_new123() );
			//maps.put("repeatActual", mr.getAvgEff_repeat123() );
			//maps.put("newTarget", mr.getAvgEff_newTarget() );
			//maps.put("repeatTarget", mr.getAvgEff_repeatTarget() );
			
			//System.out.println(i);
			
			allMonthes.add(maps);
			
		
		}
			
		return returnVal;
	}



 



	public List<Map> getAllMonthes() {
		return allMonthes;
	}







	public void setAllMonthes(List<Map> allMonthes) {
		this.allMonthes = allMonthes;
	}


	

	
	
}
