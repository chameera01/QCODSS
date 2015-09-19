package com.qcodss.struts;

import com.qcodss.dao.PlantWRDAO;
import com.qcodss.dao.StyleDAO;
import com.qcodss.model.Plant;
import com.qcodss.model.PlantWR;

public class AddWeekRecordsAction {
	
	public Integer plantName;
	public int year;
	public int month;
	public int weekNumber;
	public int noOfNewStyles;
	public int noOfRepeatStyles;
	public double fullPresettingHR;
	public double shRate;
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
	
	String returnVal="error";
	Plant plant= new Plant();
	
	PlantWR WR ;
	
	public String execute(){
		WR = new PlantWR();
		
		plant.setId(plantName);
		
		WR.setPlant(plant);
		WR.setYear(year);
		WR.setMonth(month);
		WR.setWeek(weekNumber);
		WR.setNewStyles(noOfNewStyles);
		WR.setRepeatStyles(noOfRepeatStyles);
		WR.setPreSettingHR(fullPresettingHR);
		WR.setSilhouetteBasedHR(shRate);
		WR.setAvgFeedingTime(averageFeedingTime);
		WR.setQCOTimeAvgNew(QCOAverageNew);
		WR.setQCOTimeAvgRepeat(QCOAverageRepeat);
		
		WR.setClockedHrs_1(day1Clocked);
		WR.setProducedHrs_1(day1Produced);
		WR.setTotalInspected_1(day1TotalInspected);
		WR.setTotalFTT_1(day1FTT);
		
		WR.setClockedHrs_2(day2Clocked);
		WR.setProducedHrs_2(day2Produced);
		WR.setTotalInspected_2(day2TotalInspected);
		WR.setTotalFTT_2(day2FTT);
		
		WR.setClockedHrs_3(day3Clocked);
		WR.setProducedHrs_3(day3Produced);
		WR.setTotalInspected_3(day3TotalInspected);
		WR.setTotalFTT_3(day3FTT);
		
		WR.setClockedHrs_4(day4Clocked);
		WR.setProducedHrs_4(day4Produced);
		WR.setTotalInspected_4(day4TotalInspected);
		WR.setTotalFTT_4(day4FTT);
		
		WR.setClockedHrs_5(day5Clocked);
		WR.setProducedHrs_5(day5Produced);
		WR.setTotalInspected_5(day5TotalInspected);
		WR.setTotalFTT_5(day5FTT);
		
		Boolean value = PlantWRDAO.addPlantWR(WR);
		
		if(value){
			returnVal = "success";
		}
		
		return returnVal;
	}
	
	
	
}
