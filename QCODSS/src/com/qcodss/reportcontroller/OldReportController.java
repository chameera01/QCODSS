package com.qcodss.reportcontroller;

import java.util.List;

import com.qcodss.dao.ActiveBaselineDAO;
import com.qcodss.dao.PlantBaselineDAO;
import com.qcodss.dao.PlantWRDAO;
import com.qcodss.model.ActiveBaseline;
import com.qcodss.model.PlantBaseline;
import com.qcodss.model.PlantWR;
import com.qcodss.model.Style;
import com.qcodss.reportmodels.MonthlyReport;
import com.qcodss.reportmodels.WeeklyReport;
import com.sun.org.apache.bcel.internal.generic.CALOAD;

public class OldReportController {
	
	
	List<PlantWR> oldReports;
	
	private int noOfOldReports;
	WeeklyReport wr;
	List<ActiveBaseline> AB = null;
	List<PlantBaseline> PB = null;
	PlantBaseline monthPB = null;
	Double monthlyBaseline = null;
	
	MonthlyReport mr;
	
	private ActiveBaseline ab = null;
	double newTarget = 0;
	double repeatTarget = 0;
	
	
	public OldReportController(int weekNo, int month, int year, int plantID ){
		
		PlantWRDAO plantWRDao = new PlantWRDAO();
		
		oldReports = plantWRDao.getOldRecordsByWeek(weekNo, plantID, year);
		
		if(oldReports.size()>0){
			noOfOldReports = oldReports.size();
		} else{
			noOfOldReports = 0;
		}
		
		wr = new WeeklyReport();
		wr.setYear(year);
		wr.setWeekNo(weekNo);
		
		ActiveBaselineDAO activeBaselineDao = new ActiveBaselineDAO();
		
		AB = activeBaselineDao.getActiveBaseline(year);
		
		PlantBaselineDAO plantBaselineDao = new PlantBaselineDAO();
		
		PB = plantBaselineDao.getPlantBaseline(month, year, plantID);
		
	}
	
	public OldReportController(int month, int year, int plantID ){
		
		PlantWRDAO plantWRDao = new PlantWRDAO();
		
		oldReports = plantWRDao.getOldRecordsByMonth(month, plantID, year);
		
		if(oldReports.size()>0){
			noOfOldReports = oldReports.size();
		} else{
			noOfOldReports = 0;
		}
		
		mr = new MonthlyReport();
		mr.setYear(year);
		mr.setMonth(month);
		
		ActiveBaselineDAO activeBaselineDao = new ActiveBaselineDAO();
		
		AB = activeBaselineDao.getActiveBaseline(year);
		
		PlantBaselineDAO plantBaselineDao = new PlantBaselineDAO();
		
		PB = plantBaselineDao.getPlantBaseline(month, year, plantID);
		
	}
	
	
	private double calAverageQCOTime(List<PlantWR> oldReports) {

		double averageQCOTime = 0;
		double QCOTime = 0;

		if (oldReports.isEmpty() == false) {
			for (PlantWR oldStyle : oldReports) {
				QCOTime = QCOTime + oldStyle.getQCOTimeAvgNew();
				QCOTime = QCOTime + oldStyle.getQCOTimeAvgRepeat();
			}
			
			if(noOfOldReports>0 ){
				averageQCOTime = QCOTime / noOfOldReports;
			}
			//System.out.println("Average QCO Time : " + averageQCOTime);
		}

		return averageQCOTime;
	}
	
	private Integer calNumberofNew(List<PlantWR> oldReports) {
		Integer numberOfNew = 0;

		if (oldReports.isEmpty() == false) {
			for (PlantWR oldReport : oldReports) {

				numberOfNew = numberOfNew + oldReport.getNewStyles();
			}
			
		
		}

		return numberOfNew;
	}
	
	private Integer calNumberofRepeat(List<PlantWR> oldReports) {
		Integer numberOfOld = 0;

		if (oldReports.isEmpty() == false) {
			for (PlantWR oldReport : oldReports) {

				numberOfOld = numberOfOld + oldReport.getRepeatStyles();
			}
			
		
		}

		return numberOfOld;
	}
	
	private double calFullPresettingHR(List<PlantWR> oldReports) {

		double fullPresettingHR = 0;
		

		if (oldReports.isEmpty() == false) {
			for (PlantWR oldReport : oldReports) {

				fullPresettingHR = oldReport.getPreSettingHR();

			
			}
			
			if(fullPresettingHR>0 && noOfOldReports>0){
				fullPresettingHR = fullPresettingHR / noOfOldReports;
			}	
			// System.out.println("Average QCO Time : " + averageQCOTime);
		}

		return fullPresettingHR;
	}
	
	private double calSillhotteBHR(List<PlantWR> oldReports) {
		double SBHR = 0;

		if (oldReports.isEmpty() == false) {
			for (PlantWR oldReport : oldReports) {

				SBHR = SBHR + oldReport.getSilhouetteBasedHR();

			}
			
			if(noOfOldReports>0){
				SBHR = (SBHR / noOfOldReports);
			}	
			// System.out.println("Average QCO Time : " + averageQCOTime);
		}

		return SBHR;
	}
	
	private double calAverageFeedingTime(List<PlantWR> oldReports) {
		double averageFeedingTime = 0;
		double feedingTime = 0;

		if (oldReports.isEmpty() == false) {
			for (PlantWR oldReport : oldReports) {

				feedingTime = feedingTime + oldReport.getAvgFeedingTime();

			}
			
			if(noOfOldReports>0 ){
				averageFeedingTime = (feedingTime / noOfOldReports);
			}
			// System.out.println("Average QCO Time : " + averageQCOTime);
		}

		return averageFeedingTime;
	}
	
	private void getPB() {
		if (PB.isEmpty() == false) {
			for (PlantBaseline localPB : PB) {

				monthPB = localPB;

			}

		}

		monthlyBaseline = monthPB.getBudgetedEfficiency();
		
	}
	
	
	
	private double cal1stDayEfficiencyAverage(List<PlantWR> oldReports) {
		double clocked_1 = 0;
		double produced_1 = 0;
		double EffAvg_1 = 0;

		if (oldReports.isEmpty() == false) {
			for (PlantWR plantWR : oldReports) {
				clocked_1 = clocked_1 + plantWR.getClockedHrs_1n();
				clocked_1 = clocked_1 + plantWR.getClockedHrs_1r();
				
				produced_1 = produced_1 + plantWR.getProducedHrs_1n();
				produced_1 = produced_1 + plantWR.getProducedHrs_1r();
			}
			
			if(noOfOldReports>0 && clocked_1>0){
				EffAvg_1 = (produced_1 / clocked_1) * 100;
			}
			
			//System.out.println("EffAvg_1 : " + EffAvg_1);
			
		}

		return EffAvg_1;
	}
	
	
	private double cal2stDayEfficiencyAverage(List<PlantWR> oldReports) {
		double clocked_2 = 0;
		double produced_2 = 0;
		double EffAvg_2 = 0;

		if (oldReports.isEmpty() == false) {
			for (PlantWR plantWR : oldReports) {
				clocked_2 = clocked_2 + plantWR.getClockedHrs_2n();
				clocked_2 = clocked_2 + plantWR.getClockedHrs_2r();

				produced_2 = produced_2 + plantWR.getProducedHrs_2n();
				produced_2 = produced_2 + plantWR.getProducedHrs_2r();

			}
			
			if(noOfOldReports>0 && clocked_2>0){
				EffAvg_2 = (produced_2 / clocked_2) * 100;
			}
			
			//System.out.println("EffAvg_1 : " + EffAvg_1);
			
		}

		return EffAvg_2;
	}
	
	private double cal3stDayEfficiencyAverage(List<PlantWR> oldReports) {
		double clocked_3 = 0;
		double produced_3 = 0;
		double EffAvg_3 = 0;

		if (oldReports.isEmpty() == false) {
			for (PlantWR plantWR : oldReports) {
				clocked_3 = clocked_3 + plantWR.getClockedHrs_3n();
				clocked_3 = clocked_3 + plantWR.getClockedHrs_3r();

				produced_3 = produced_3 + plantWR.getProducedHrs_3n();
				produced_3 = produced_3 + plantWR.getProducedHrs_3r();

			}
			
			if(noOfOldReports>0 && clocked_3>0){
				EffAvg_3 = (produced_3 / clocked_3) * 100;
			}
			
			//System.out.println("EffAvg_1 : " + EffAvg_1);
			
		}

		return EffAvg_3;
	}
	
	private double cal4stDayEfficiencyAverage(List<PlantWR> oldReports) {
		double clocked_4 = 0;
		double produced_4 = 0;
		double EffAvg_4 = 0;

		if (oldReports.isEmpty() == false) {
			for (PlantWR plantWR : oldReports) {
				clocked_4 = clocked_4 + plantWR.getClockedHrs_4n();
				clocked_4 = clocked_4 + plantWR.getClockedHrs_4r();

				produced_4 = produced_4 + plantWR.getProducedHrs_4n();
				produced_4 = produced_4 + plantWR.getProducedHrs_4r();

			}
			
			if(noOfOldReports>0 && clocked_4>0){
				EffAvg_4 = (produced_4 / clocked_4) * 100;
			}
			
			//System.out.println("EffAvg_1 : " + EffAvg_1);
			
		}

		return EffAvg_4;
	}
	
	
	private double cal5stDayEfficiencyAverage(List<PlantWR> oldReports) {
		double clocked_5 = 0;
		double produced_5 = 0;
		double EffAvg_5 = 0;

		if (oldReports.isEmpty() == false) {
			for (PlantWR plantWR : oldReports) {
				clocked_5 = clocked_5 + plantWR.getClockedHrs_5n();
				clocked_5 = clocked_5 + plantWR.getClockedHrs_5r();

				produced_5 = produced_5 + plantWR.getProducedHrs_5n();
				produced_5 = produced_5 + plantWR.getProducedHrs_5r();

			}
			
			if(noOfOldReports>0 && clocked_5>0){
				EffAvg_5 = (produced_5 / clocked_5) * 100;
			}
			
			//System.out.println("EffAvg_1 : " + EffAvg_1);
			
		}

		return EffAvg_5;
	}
	
	
	private double cal123EfficiencyNew(List<PlantWR> oldReports) {

		double EffAvg_123n = 0;
		double clocked_123n = 0;
		double produced_123n = 0;

		if (oldReports.isEmpty() == false) {
			for (PlantWR oldReport : oldReports) {

				
					clocked_123n = clocked_123n + oldReport.getClockedHrs_1n()
							+ oldReport.getClockedHrs_2n() + oldReport.getClockedHrs_3n();

					produced_123n = produced_123n + oldReport.getProducedHrs_1n()
							+ oldReport.getProducedHrs_2n()
							+ oldReport.getProducedHrs_3n();
				

			}
			
			if(calNumberofNew(oldReports) > 0 && clocked_123n>0){
				EffAvg_123n = (produced_123n / clocked_123n) * 100;
			}	
			// System.out.println("Average QCO Time : " + averageQCOTime);
		}

		return EffAvg_123n;
	}
	
	private double cal123EfficiencyRepeat(List<PlantWR> oldReports) {

		double EffAvg_123r = 0;
		double clocked_123r = 0;
		double produced_123r = 0;

		if (oldReports.isEmpty() == false) {
			for (PlantWR oldReport : oldReports) {

				
					clocked_123r = clocked_123r + oldReport.getClockedHrs_1r()
							+ oldReport.getClockedHrs_2r() + oldReport.getClockedHrs_3r();

					produced_123r = produced_123r + oldReport.getProducedHrs_1r()
							+ oldReport.getProducedHrs_2r()
							+ oldReport.getProducedHrs_3r();
				

			}
			
			if(calNumberofRepeat(oldReports) > 0 && clocked_123r>0){
				EffAvg_123r = (produced_123r / clocked_123r) * 100;
			}	
			// System.out.println("Average QCO Time : " + averageQCOTime);
		}

		return EffAvg_123r;
	}

	private double cal123EfficiencyAverage(List<PlantWR> oldReports) {

		double EffAvg_123 = 0;
		double clocked_123 = 0;
		double produced_123 = 0;

		if (oldReports.isEmpty() == false) {
			for (PlantWR oldReport : oldReports) {

				
					clocked_123 = clocked_123 + oldReport.getClockedHrs_1n()
							+ oldReport.getClockedHrs_2n() + oldReport.getClockedHrs_3n() + oldReport.getClockedHrs_1r()
							+ oldReport.getClockedHrs_2r() + oldReport.getClockedHrs_3r();

					produced_123 = produced_123 +  oldReport.getProducedHrs_1n()
							+ oldReport.getProducedHrs_2n()
							+ oldReport.getProducedHrs_3n() + oldReport.getProducedHrs_1r()
							+ oldReport.getProducedHrs_2r()
							+ oldReport.getProducedHrs_3r();
				

			}
			
			if(calNumberofRepeat(oldReports) > 0 && clocked_123>0){
				EffAvg_123 = (produced_123 / clocked_123) * 100;
			}	
			// System.out.println("Average QCO Time : " + averageQCOTime);
		}

		return EffAvg_123;
	}
	
	
	
	private void getAB() {
		if (AB.isEmpty() == false) {
			for (ActiveBaseline localAB : AB) {

				ab = localAB;

			}

		}

		newTarget = ab.getNewTarget();
		repeatTarget = ab.getRepeatTarget();
	}
	
	private double calEPR123n(List<PlantWR> oldReports) {
		double EPR123n = 0;
		double FTTn = 0;
		double INSn = 0;

		if (oldReports.isEmpty() == false) {
			for (PlantWR oldReport : oldReports) {

				
					FTTn = FTTn + oldReport.getTotalFTT_1n() + oldReport.getTotalFTT_2n()
							+ oldReport.getTotalFTT_3n();

					INSn = INSn + oldReport.getTotalInspected_1n()
							+ oldReport.getTotalInspected_2n()
							+ oldReport.getTotalInspected_3n();
				

			}

			// EPR123n = ENdlinePassRate 1st three days new
			if(calNumberofNew(oldReports)>0 && INSn>0){
				EPR123n = (FTTn / INSn) * 100;
			}	
			// System.out.println("Average QCO Time : " + averageQCOTime);
		}

		return EPR123n;
	}
	
	private double calEPR123r(List<PlantWR> oldReports) {
		double EPR123r = 0;
		double FTTr = 0;
		double INSr = 0;

		if (oldReports.isEmpty() == false) {
			for (PlantWR oldReport : oldReports) {

				
					FTTr = FTTr + oldReport.getTotalFTT_1r() + oldReport.getTotalFTT_2r()
							+ oldReport.getTotalFTT_3r();

					INSr = INSr + oldReport.getTotalInspected_1r()
							+ oldReport.getTotalInspected_2r()
							+ oldReport.getTotalInspected_3r();
				

			}

			// EPR123n = ENdlinePassRate 1st three days new
			if(calNumberofRepeat(oldReports)>0 && INSr>0){
				EPR123r = (FTTr / INSr) * 100;
			}	
			// System.out.println("Average QCO Time : " + averageQCOTime);
		}

		return EPR123r;
	}
	
	private double calEPR123(List<PlantWR> oldReports) {
		double EPR123 = 0;
		double FTT = 0;
		double INS = 0;

		if (oldReports.isEmpty() == false) {
			for (PlantWR oldReport : oldReports) {

				
					FTT = FTT +  oldReport.getTotalFTT_1n()  +  oldReport.getTotalFTT_2n()  + oldReport.getTotalFTT_3n() + oldReport.getTotalFTT_1r()
							+ oldReport.getTotalFTT_2r() + oldReport.getTotalFTT_3r()  ;

					INS = INS + oldReport.getTotalInspected_1n()
							+ oldReport.getTotalInspected_2n()
							+ oldReport.getTotalInspected_3n()
							+ oldReport.getTotalInspected_1r()
							+ oldReport.getTotalInspected_2r()
							+ oldReport.getTotalInspected_3r();
				

			}

			// EPR123n = ENdlinePassRate 1st three days new
			if( INS>0){
				EPR123 = (FTT / INS) * 100;
			}	
			// System.out.println("Average QCO Time : " + averageQCOTime);
		}

		return EPR123;
	}
	
	private double cal45EfficiencyAverage(List<PlantWR> oldReports) {

		double EffAvg_45 = 0;
		double clocked_45 = 0;
		double produced_45 = 0;

		if (oldReports.isEmpty() == false) {
			for (PlantWR oldReport : oldReports) {

				clocked_45 = clocked_45 + oldReport.getClockedHrs_4n()+oldReport.getClockedHrs_4r()
						+ oldReport.getClockedHrs_5n()+oldReport.getClockedHrs_5r();

				produced_45 = produced_45 + oldReport.getProducedHrs_4n()+oldReport.getProducedHrs_4r()
						+ oldReport.getProducedHrs_5n()+oldReport.getProducedHrs_5r();

			}
			
			if(noOfOldReports>0 && clocked_45 > 0 ){
				EffAvg_45 = (produced_45 / clocked_45) * 100;
			}	
			// System.out.println("Average QCO Time : " + averageQCOTime);
		}

		return EffAvg_45;
	}

	
	
	
	//Method to get Weekly report
	public WeeklyReport getWeeklyReport() {
		
		getAB();
		// Not required for the weekly report ----> getPB();
		
		
		wr.setAverageQCOTime(calAverageQCOTime(oldReports));
		wr.setNumberOfNew(calNumberofNew(oldReports));
		wr.setNumberOfRepeat(calNumberofRepeat(oldReports));
		wr.setFullPresettingHR(calFullPresettingHR(oldReports));
		wr.setSbHR(calSillhotteBHR(oldReports));
		wr.setAvgFeedingTime(calAverageFeedingTime(oldReports));
		
		wr.setAvgEff_1(cal1stDayEfficiencyAverage(oldReports));
		wr.setAvgEff_2(cal2stDayEfficiencyAverage(oldReports));
		wr.setAvgEff_3(cal3stDayEfficiencyAverage(oldReports));
		wr.setAvgEff_4(cal4stDayEfficiencyAverage(oldReports));
		wr.setAvgEff_5(cal5stDayEfficiencyAverage(oldReports));
		
		wr.setAvgEff_new123(cal123EfficiencyNew(oldReports));
		wr.setAvgEff_repeat123(cal123EfficiencyRepeat(oldReports));
		wr.setAvgEff_123(cal123EfficiencyAverage(oldReports));
		
		wr.setAvgEff_newTarget(newTarget);
		wr.setAvgEff_repeatTarget(repeatTarget);
		
		wr.setEPR_123n(calEPR123n(oldReports));
		wr.setEPR_123r(calEPR123r(oldReports));
		wr.setEPR_123(calEPR123(oldReports));
		
		wr.setAvgEff_45(cal45EfficiencyAverage(oldReports));
		
		return wr;
	}
	
	
	// Method to get single monthly report
		public MonthlyReport getMonthlyReport() {

			getAB();

			mr.setAverageQCOTime(calAverageQCOTime(oldReports));
			mr.setNumberOfNew(calNumberofNew(oldReports));
			mr.setNumberOfRepeat(calNumberofRepeat(oldReports));
			mr.setFullPresettingHR(calFullPresettingHR(oldReports));
			mr.setSbHR(calSillhotteBHR(oldReports));
			mr.setAvgFeedingTime(calAverageFeedingTime(oldReports));
			
			mr.setAvgEff_1(cal1stDayEfficiencyAverage(oldReports));
			mr.setAvgEff_2(cal2stDayEfficiencyAverage(oldReports));
			mr.setAvgEff_3(cal3stDayEfficiencyAverage(oldReports));
			mr.setAvgEff_4(cal4stDayEfficiencyAverage(oldReports));
			mr.setAvgEff_5(cal5stDayEfficiencyAverage(oldReports));
			
			mr.setAvgEff_new123(cal123EfficiencyNew(oldReports));
			mr.setAvgEff_repeat123(cal123EfficiencyRepeat(oldReports));
			mr.setAvgEff_123(cal123EfficiencyAverage(oldReports));
			
			mr.setAvgEff_newTarget(newTarget);
			mr.setAvgEff_repeatTarget(repeatTarget);
			
			mr.setEPR_123n(calEPR123n(oldReports));
			mr.setEPR_123r(calEPR123r(oldReports));
			mr.setEPR_123(calEPR123(oldReports));
			
			mr.setAvgEff_45(cal45EfficiencyAverage(oldReports));
			
			
			
			return mr;
		}

	
}
