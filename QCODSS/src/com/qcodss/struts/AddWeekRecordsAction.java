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
		
		WR.setClockedHrs_1n(day1Clockedn);
		WR.setProducedHrs_1n(day1Producedn);
		WR.setTotalInspected_1n(day1TotalInspectedn);
		WR.setTotalFTT_1n(day1FTTn);
		WR.setClockedHrs_1r(day1Clockedr);
		WR.setProducedHrs_1r(day1Producedr);
		WR.setTotalInspected_1r(day1TotalInspectedr);
		WR.setTotalFTT_1r(day1FTTr);
		
		WR.setClockedHrs_2n(day2Clockedn);
		WR.setProducedHrs_2n(day2Producedn);
		WR.setTotalInspected_2n(day2TotalInspectedn);
		WR.setTotalFTT_2n(day2FTTn);
		WR.setClockedHrs_2r(day2Clockedr);
		WR.setProducedHrs_2r(day2Producedr);
		WR.setTotalInspected_2r(day2TotalInspectedr);
		WR.setTotalFTT_2r(day2FTTr);
		
		WR.setClockedHrs_3n(day3Clockedn);
		WR.setProducedHrs_3n(day3Producedn);
		WR.setTotalInspected_3n(day3TotalInspectedn);
		WR.setTotalFTT_3n(day3FTTn);
		WR.setClockedHrs_3r(day3Clockedr);
		WR.setProducedHrs_3r(day3Producedr);
		WR.setTotalInspected_3r(day3TotalInspectedr);
		WR.setTotalFTT_3r(day3FTTr);
		
		WR.setClockedHrs_4n(day4Clockedn);
		WR.setProducedHrs_4n(day4Producedn);
		WR.setTotalInspected_4n(day4TotalInspectedn);
		WR.setTotalFTT_4n(day4FTTn);
		WR.setClockedHrs_4r(day4Clockedr);
		WR.setProducedHrs_4r(day4Producedr);
		WR.setTotalInspected_4r(day4TotalInspectedr);
		WR.setTotalFTT_4r(day4FTTr);
		
		WR.setClockedHrs_5n(day5Clockedn);
		WR.setProducedHrs_5n(day5Producedn);
		WR.setTotalInspected_5n(day5TotalInspectedn);
		WR.setTotalFTT_5n(day5FTTn);
		WR.setClockedHrs_5r(day5Clockedr);
		WR.setProducedHrs_5r(day5Producedr);
		WR.setTotalInspected_5r(day5TotalInspectedr);
		WR.setTotalFTT_5r(day5FTTr);
		
		PlantWRDAO plantWRDao = new PlantWRDAO();
		
		Boolean value = plantWRDao.addPlantWR(WR);
		
		if(value){
			returnVal = "success";
		}
		
		return returnVal;
	}
	
	
	
}
