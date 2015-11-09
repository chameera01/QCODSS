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
	public double averageFeedingTime;
	public double QCOAverageNew;
	public double QCOAverageRepeat;
	
	public double day1Clockedn;
	public double day1Producedn;
	public double day1TotalInspectedn;
	public double day1FTTn;
	public double day1Clockedr;
	public double day1Producedr;
	public double day1TotalInspectedr;
	public double day1FTTr;
	
	public double day2Clockedn;
	public double day2Producedn;
	public double day2TotalInspectedn;
	public double day2FTTn;
	public double day2Clockedr;
	public double day2Producedr;
	public double day2TotalInspectedr;
	public double day2FTTr;
	
	public double day3Clockedn;
	public double day3Producedn;
	public double day3TotalInspectedn;
	public double day3FTTn;
	public double day3Clockedr;
	public double day3Producedr;
	public double day3TotalInspectedr;
	public double day3FTTr;
	
	public double day4Clockedn;
	public double day4Producedn;
	public double day4TotalInspectedn;
	public double day4FTTn;
	public double day4Clockedr;
	public double day4Producedr;
	public double day4TotalInspectedr;
	public double day4FTTr;
	
	public double day5Clockedn;
	public double day5Producedn;
	public double day5TotalInspectedn;
	public double day5FTTn;
	public double day5Clockedr;
	public double day5Producedr;
	public double day5TotalInspectedr;
	public double day5FTTr;
	
	String returnVal="error";
	Plant plant= new Plant();
	
	PlantWR WR = null ;
	
	public String execute(){
		
		System.out.println(plantName);
		
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
		
		boolean value = plantWRDao.addPlantWR(WR);
		
		if(value){
			returnVal = "success";
		}
		
		return returnVal;
	}
	
	
	
}
