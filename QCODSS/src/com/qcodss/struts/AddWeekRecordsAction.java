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
	
	public Double day1Clockedn;
	public Double day1Producedn;
	public Double day1TotalInspectedn;
	public Double day1FTTn;
	public Double day1Clockedr;
	public Double day1Producedr;
	public Double day1TotalInspectedr;
	public Double day1FTTr;
	
	public Double day2Clockedn;
	public Double day2Producedn;
	public Double day2TotalInspectedn;
	public Double day2FTTn;
	public Double day2Clockedr;
	public Double day2Producedr;
	public Double day2TotalInspectedr;
	public Double day2FTTr;
	
	public Double day3Clockedn;
	public Double day3Producedn;
	public Double day3TotalInspectedn;
	public Double day3FTTn;
	public Double day3Clockedr;
	public Double day3Producedr;
	public Double day3TotalInspectedr;
	public Double day3FTTr;
	
	public Double day4Clockedn;
	public Double day4Producedn;
	public Double day4TotalInspectedn;
	public Double day4FTTn;
	public Double day4Clockedr;
	public Double day4Producedr;
	public Double day4TotalInspectedr;
	public Double day4FTTr;
	
	public Double day5Clockedn;
	public Double day5Producedn;
	public Double day5TotalInspectedn;
	public Double day5FTTn;
	public Double day5Clockedr;
	public Double day5Producedr;
	public Double day5TotalInspectedr;
	public Double day5FTTr;
	
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
