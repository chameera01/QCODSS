package com.qcodss.struts;

import com.qcodss.model.Plant;
import com.qcodss.model.PlantWR;

public class AddWeekRecordsAction {
	
	public Integer plantName;
	public int year;
	public String month;
	public int weekNumber;
	public int noOfNewStyles;
	public int noOfRepeatStyles;
	public int fullPresettingHR;
	public Double shRate;
	public Double averageFeedingTime;
	public Double QCOAverageNew;
	public Double QCOAverageRepeat;
	
	public Double day1Clocked;
	public Double day1Produced;
	public Double day1TotalInspected;
	public Double day1FTT;
	
	public Double day2Clocked;
	public Double day2Produced;
	public Double day2TotalInspected;
	public Double day2FTT;
	
	public Double day3Clocked;
	public Double day3Produced;
	public Double day3TotalInspected;
	public Double day3FTT;
	
	public Double day4Clocked;
	public Double day4Produced;
	public Double day4TotalInspected;
	public Double day4FTT;
	
	public Double day5Clocked;
	public Double day5Produced;
	public Double day5TotalInspected;
	public Double day5FTT;
	
	String returnVal="success";
	Plant plant= new Plant();
	
	PlantWR plantWeek ;
	
	public String execute(){
		
		System.out.println(plantName);
		System.out.println(year);
		System.out.println(month);
		System.out.println(weekNumber);
		System.out.println(noOfNewStyles);
		System.out.println(noOfRepeatStyles);
		System.out.println(fullPresettingHR);
		System.out.println(shRate);
		System.out.println(averageFeedingTime);
		System.out.println(QCOAverageNew);
		System.out.println(QCOAverageRepeat);
		System.out.println(day1Clocked);
		System.out.println(day2Clocked);
		System.out.println(day3Clocked);
		System.out.println(day4Clocked);
		System.out.println(day5Clocked);
		
		
		return returnVal;
	}
	
	
	
}
