package com.qcodss.struts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.qcodss.reportcontroller.ReportController;
import com.qcodss.reportmodels.MonthlyReport;


public class CenterChartAction {
	

	
	private List<Map> allMonthes = new ArrayList<Map>() ;
	
	//public variables need to be declared to access data from pop up
	
	

	

	public String execute(){
		
		String returnVal = "success";
		
		ReportController rc = null;
		MonthlyReport mr = null;
		
		//plantID
		//Months
		//Year need to be passed to this class
		
		String month = null;
		
		
		
		
		for(int i=1;i<13;i++){
			
			if(i==1){
				month = "January";
			} else if(i==2){
				month = "February";
			}  else if(i==3){
				month = "March";
			} else if(i==4){
			    month = "April";
			} else if(i==5){
			    month = "May";
			} else if(i==6){
			    month = "June";
			} else if(i==7){
			    month = "July";
			} else if(i==8){
			    month = "August";
			} else if(i==9){
			    month = "September";
			} else if(i==10){
			    month = "October";
			} else if(i==11){
			    month = "November";
			} else if(i==12){
			    month = "December";
			}
		
			rc = new ReportController(month, 2015, 1);
			
			mr = rc.getMonthlyReport();
			
		    //System.out.println("Month is "+ mr.getMonth());
			
		    Map<String, Double> maps = new HashMap<String, Double>();
		    
			maps.put("month", mr.getMonth() );
			maps.put("noOfNew", (double)mr.getNumberOfNew() );
			maps.put("noOfRepeat", (double)mr.getNumberOfRepeat() );
			maps.put("newActual", mr.getAvgEff_new123() );
			maps.put("repeatActual", mr.getAvgEff_repeat123() );
			maps.put("newTarget", mr.getAvgEff_newTarget() );
			maps.put("repeatTarget", mr.getAvgEff_repeatTarget() );
			maps.put("averageEfficiency", mr.getAvgEff_123());
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
