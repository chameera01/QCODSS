package com.qcodss.reportcontroller;

import java.util.List;

import com.qcodss.dao.ActiveBaselineDAO;
import com.qcodss.dao.PlantBaselineDAO;
import com.qcodss.dao.StyleDAO;
import com.qcodss.model.ActiveBaseline;
import com.qcodss.model.PlantBaseline;
import com.qcodss.model.Style;
import com.qcodss.reportmodels.MonthlyReport;
import com.qcodss.reportmodels.WeeklyReport;

public class ReportController {

	private int weekNo;
	
	private int noOfStyles;
	List<ActiveBaseline> AB = null;

	List<PlantBaseline> PB = null;

	private ActiveBaseline ab = null;
	double newTarget = 0;
	double repeatTarget = 0;
	WeeklyReport wr;
	MonthlyReport mr;
	List<Style> allStyles;

	// Monthly report constructor
	public ReportController(int weekNo, int year, int plantID) {
		this.weekNo = weekNo;
		// weekNo should be passed as a parameter to the below method
		allStyles = StyleDAO.getAllStylesByWeek(weekNo, plantID, year);
		
		if(allStyles.size()>0){
			noOfStyles = allStyles.size();
		} else{
			noOfStyles = 0;
		}
		
		wr = new WeeklyReport();
		AB = ActiveBaselineDAO.getActiveBaseline(year);

	}

	// Monthly report constructor
	public ReportController(String monthName, int year, int plantID) {
		
		int month=0;
		
		if (monthName.equals("January")) {
			month = 1;
		} else if (monthName.equals("February")) {
			month = 2;
		} else if (monthName.equals("March")) {
			month = 3;
		} else if (monthName.equals("April")) {
			month = 4;
		} else if (monthName.equals("May")) {
			month = 5;
		} else if (monthName.equals("June")) {
			month = 6;
		} else if (monthName.equals("July")) {
			month = 7;
		} else if (monthName.equals("August")) {
			month = 8;
		} else if (monthName.equals("September")) {
			month = 9;
		} else if (monthName.equals("October")) {
			month = 10;
		} else if (monthName.equals("November")) {
			month = 11;
		} else if (monthName.equals("December")) {
			month = 12;
		}

		allStyles = StyleDAO.getAllStylesByMonth(month, plantID, year);

		noOfStyles = allStyles.size();

		mr = new MonthlyReport();
		AB = ActiveBaselineDAO.getActiveBaseline(year);
		PB = PlantBaselineDAO.getPlantBaseline(month, year, plantID);

	}

	private Integer calNumberofNew(List<Style> allStyles) {
		Integer numberOfNew = 0;

		if (allStyles.isEmpty() == false) {
			for (Style style : allStyles) {

				if (style.getNewRepeat().equals("n")) {
					numberOfNew = numberOfNew + 1;
				}
			}
		}

		return numberOfNew;
	}

	private Integer calNumberofRepeat(List<Style> allStyles) {
		Integer numberOfRepeat = 0;

		if (allStyles.isEmpty() == false) {
			for (Style style : allStyles) {

				if (style.getNewRepeat().equals("r")) {
					numberOfRepeat = numberOfRepeat + 1;
				}
			}
		}

		return numberOfRepeat;
	}

	private double calAverageQCOTime(List<Style> allStyles) {

		double averageQCOTime = 0;
		int QCOTime = 0;

		if (allStyles.isEmpty() == false) {
			for (Style style : allStyles) {
				QCOTime = QCOTime + style.getQCOTime();
			}
			
			if(noOfStyles>0){
				averageQCOTime = QCOTime / noOfStyles;
			}
			// System.out.println("Average QCO Time : " + averageQCOTime);
		}

		return averageQCOTime;
	}

	private double cal1stDayEfficiencyAverage(List<Style> allStyles) {
		double clocked_1 = 0;
		double produced_1 = 0;
		double EffAvg_1 = 0;

		if (allStyles.isEmpty() == false) {
			for (Style style : allStyles) {
				clocked_1 = clocked_1 + style.getClockedHrs_1();

				produced_1 = produced_1 + style.getProducedHrs_1();

			}
			
			if(noOfStyles>0){
				EffAvg_1 = (produced_1 / clocked_1) * 100;
			}
			// System.out.println("Average QCO Time : " + averageQCOTime);
		}

		return EffAvg_1;
	}

	private double cal2stDayEfficiencyAverage(List<Style> allStyles) {
		double clocked_2 = 0;
		double produced_2 = 0;
		double EffAvg_2 = 0;

		if (allStyles.isEmpty() == false) {
			for (Style style : allStyles) {
				clocked_2 = clocked_2 + style.getClockedHrs_2();

				produced_2 = produced_2 + style.getProducedHrs_2();

			}
			if(noOfStyles>0){
				EffAvg_2 = (produced_2 / clocked_2) * 100;
			}	
			// System.out.println("Average QCO Time : " + averageQCOTime);
		}

		return EffAvg_2;
	}

	private double cal3stDayEfficiencyAverage(List<Style> allStyles) {
		double clocked_3 = 0;
		double produced_3 = 0;
		double EffAvg_3 = 0;

		if (allStyles.isEmpty() == false) {
			for (Style style : allStyles) {
				clocked_3 = clocked_3 + style.getClockedHrs_3();

				produced_3 = produced_3 + style.getProducedHrs_3();

			}
			
			if(noOfStyles>0){
				EffAvg_3 = (produced_3 / clocked_3) * 100;
			}	
			// System.out.println("Average QCO Time : " + averageQCOTime);
		}

		return EffAvg_3;
	}

	private double cal4stDayEfficiencyAverage(List<Style> allStyles) {
		double clocked_4 = 0;
		double produced_4 = 0;
		double EffAvg_4 = 0;

		if (allStyles.isEmpty() == false) {
			for (Style style : allStyles) {
				clocked_4 = clocked_4 + style.getClockedHrs_4();

				produced_4 = produced_4 + style.getProducedHrs_4();

			}
			
			if(noOfStyles>0){
				EffAvg_4 = (produced_4 / clocked_4) * 100;
			}	
			// System.out.println("Average QCO Time : " + averageQCOTime);
		}

		return EffAvg_4;
	}

	private double cal5stDayEfficiencyAverage(List<Style> allStyles) {
		double clocked_5 = 0;
		double produced_5 = 0;
		double EffAvg_5 = 0;

		if (allStyles.isEmpty() == false) {
			for (Style style : allStyles) {
				clocked_5 = clocked_5 + style.getClockedHrs_5();

				produced_5 = produced_5 + style.getProducedHrs_5();

			}
			
			if(noOfStyles>0){
				EffAvg_5 = (produced_5 / clocked_5) * 100;
			}	
			// System.out.println("Average QCO Time : " + averageQCOTime);
		}

		return EffAvg_5;
	}

	private double cal1dstDayEfficiencyAverage(List<Style> allStyles) {

		// Method to calculate last day efficiency of the previous style
		double clocked_1d = 0;
		double produced_1d = 0;
		double EffAvg_1d = 0;

		if (allStyles.isEmpty() == false) {
			for (Style style : allStyles) {
				clocked_1d = clocked_1d + style.getClockedHrs_1d();

				produced_1d = produced_1d + style.getProducedHrs_1d();

			}
			
			if(noOfStyles>0){
				EffAvg_1d = (produced_1d / clocked_1d) * 100;
			}	
			// System.out.println("Average QCO Time : " + averageQCOTime);
		}

		return EffAvg_1d;
	}

	private double cal2dstDayEfficiencyAverage(List<Style> allStyles) {

		// Method to calculate last2 day efficiency of the previous style
		double clocked_2d = 0;
		double produced_2d = 0;
		double EffAvg_2d = 0;

		if (allStyles.isEmpty() == false) {
			for (Style style : allStyles) {
				clocked_2d = clocked_2d + style.getClockedHrs_2d();

				produced_2d = produced_2d + style.getProducedHrs_2d();

			}
			
			if(noOfStyles>0){
				EffAvg_2d = (produced_2d / clocked_2d) * 100;
			}	
			// System.out.println("Average QCO Time : " + averageQCOTime);
		}

		return EffAvg_2d;
	}

	private double cal3dstDayEfficiencyAverage(List<Style> allStyles) {

		// Method to calculate last3 day efficiency of the previous style
		double clocked_3d = 0;
		double produced_3d = 0;
		double EffAvg_3d = 0;

		if (allStyles.isEmpty() == false) {
			for (Style style : allStyles) {
				clocked_3d = clocked_3d + style.getClockedHrs_3d();

				produced_3d = produced_3d + style.getProducedHrs_3d();

			}
			
			if(noOfStyles>0){
				EffAvg_3d = (produced_3d / clocked_3d) * 100;
			}	
			// System.out.println("Average QCO Time : " + averageQCOTime);
		}

		return EffAvg_3d;
	}

	private double cal123EfficiencyNew(List<Style> allStyles) {

		double EffAvg_123n = 0;
		double clocked_123n = 0;
		double produced_123n = 0;

		if (allStyles.isEmpty() == false) {
			for (Style style : allStyles) {

				if (style.getNewRepeat().equals("n")) {
					clocked_123n = clocked_123n + style.getClockedHrs_1()
							+ style.getClockedHrs_2() + style.getClockedHrs_3();

					produced_123n = produced_123n + style.getProducedHrs_1()
							+ style.getProducedHrs_2()
							+ style.getProducedHrs_3();
				}

			}
			
			if(calNumberofNew(allStyles) > 0 ){
				EffAvg_123n = (produced_123n / clocked_123n) * 100;
			}	
			// System.out.println("Average QCO Time : " + averageQCOTime);
		}

		return EffAvg_123n;
	}

	private double cal123EfficiencyRepeat(List<Style> allStyles) {

		double EffAvg_123r = 0;
		double clocked_123r = 0;
		double produced_123r = 0;

		if (allStyles.isEmpty() == false) {
			for (Style style : allStyles) {

				if (style.getNewRepeat().equals("r")) {
					clocked_123r = clocked_123r + style.getClockedHrs_1()
							+ style.getClockedHrs_2() + style.getClockedHrs_3();

					produced_123r = produced_123r + style.getProducedHrs_1()
							+ style.getProducedHrs_2()
							+ style.getProducedHrs_3();
				}

			}
			
			if(calNumberofRepeat(allStyles)>0){
				EffAvg_123r = (produced_123r / clocked_123r) * 100;
			}	
			// System.out.println("Average QCO Time : " + averageQCOTime);
		}

		return EffAvg_123r;
	}

	private double cal123EfficiencyAll(List<Style> allStyles) {

		double EffAvg_123 = 0;
		double clocked_123 = 0;
		double produced_123 = 0;

		if (allStyles.isEmpty() == false) {
			for (Style style : allStyles) {
				clocked_123 = clocked_123 + style.getClockedHrs_1()
						+ style.getClockedHrs_2() + style.getClockedHrs_3();

				produced_123 = produced_123 + style.getProducedHrs_1()
						+ style.getProducedHrs_2() + style.getProducedHrs_3();

			}
			
			if(noOfStyles>0){
				EffAvg_123 = (produced_123 / clocked_123) * 100;
			}	
			// System.out.println("Average QCO Time : " + averageQCOTime);
		}

		return EffAvg_123;
	}

	private double calEPR123n(List<Style> allStyles) {
		double EPR123n = 0;
		double FTTn = 0;
		double INSn = 0;

		if (allStyles.isEmpty() == false) {
			for (Style style : allStyles) {

				if (style.getNewRepeat().equals("n")) {
					FTTn = FTTn + style.getTotalFTT_1() + style.getTotalFTT_2()
							+ style.getTotalFTT_3();

					INSn = INSn + style.getTotalInspected_1()
							+ style.getTotalInspected_2()
							+ style.getTotalInspected_3();
				}

			}

			// EPR123n = ENdlinePassRate 1st three days new
			if(calNumberofNew(allStyles)>0){
				EPR123n = (FTTn / INSn) * 100;
			}	
			// System.out.println("Average QCO Time : " + averageQCOTime);
		}

		return EPR123n;
	}

	private double calEPR123r(List<Style> allStyles) {
		double EPR123r = 0;
		double FTTr = 0;
		double INSr = 0;

		if (allStyles.isEmpty() == false) {
			for (Style style : allStyles) {

				if (style.getNewRepeat().equals("r")) {
					FTTr = FTTr + style.getTotalFTT_1() + style.getTotalFTT_2()
							+ style.getTotalFTT_3();

					INSr = INSr + style.getTotalInspected_1()
							+ style.getTotalInspected_2()
							+ style.getTotalInspected_3();
				}

			}

			// EPR123n = ENdlinePassRate 1st three days new
			if(calNumberofRepeat(allStyles)>0){
				EPR123r = (FTTr / INSr) * 100;
			}	
			// System.out.println("Average QCO Time : " + averageQCOTime);
		}

		return EPR123r;
	}

	private double calEPR123All(List<Style> allStyles) {
		double EPR123 = 0;
		double FTT = 0;
		double INS = 0;

		if (allStyles.isEmpty() == false) {
			for (Style style : allStyles) {

				FTT = FTT + style.getTotalFTT_1() + style.getTotalFTT_2()
						+ style.getTotalFTT_3();

				INS = INS + style.getTotalInspected_1()
						+ style.getTotalInspected_2()
						+ style.getTotalInspected_3();

			}

			// EPR123n = ENdlinePassRate 1st three days new
			if(noOfStyles>0){
				EPR123 = (FTT / INS) * 100;
			}	
			// System.out.println("Average QCO Time : " + averageQCOTime);
		}

		return EPR123;
	}

	private double calAverageFeedingTime(List<Style> allStyles) {
		double averageFeedingTime = 0;
		double feedingTime = 0;

		if (allStyles.isEmpty() == false) {
			for (Style style : allStyles) {

				feedingTime = feedingTime + style.getFeedingTime();

			}
			
			if(noOfStyles>0){
				averageFeedingTime = (feedingTime / noOfStyles);
			}
			// System.out.println("Average QCO Time : " + averageQCOTime);
		}

		return averageFeedingTime;
	}

	private double calFullPresettingHR(List<Style> allStyles) {

		double fullPresettingHR = 0;
		double fullPresetted = 0;

		if (allStyles.isEmpty() == false) {
			for (Style style : allStyles) {

				if (style.getFullPresetting() == 1) {

					fullPresetted = fullPresetted + 1;

				}
			}
			
			if(fullPresetted>0 && noOfStyles>0){
				fullPresettingHR = (fullPresetted / noOfStyles) * 100;
			}	
			// System.out.println("Average QCO Time : " + averageQCOTime);
		}

		return fullPresettingHR;
	}

	private double calRSR(List<Style> allStyles) {
		double RSR = 0;

		if (allStyles.isEmpty() == false) {
			for (Style style : allStyles) {

				RSR = RSR + style.getRsr();

			}
			
			if(noOfStyles>0){
				RSR = (RSR / noOfStyles);
			}	
			// System.out.println("Average QCO Time : " + averageQCOTime);
		}

		return RSR;
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

	private double cal45EfficiencyAverage(List<Style> allStyles) {

		double EffAvg_45 = 0;
		double clocked_45 = 0;
		double produced_45 = 0;

		if (allStyles.isEmpty() == false) {
			for (Style style : allStyles) {

				clocked_45 = clocked_45 + style.getClockedHrs_4()
						+ style.getClockedHrs_5();

				produced_45 = produced_45 + style.getProducedHrs_4()
						+ style.getProducedHrs_5();

			}
			
			if(noOfStyles>0){
				EffAvg_45 = (produced_45 / clocked_45) * 100;
			}	
			// System.out.println("Average QCO Time : " + averageQCOTime);
		}

		return EffAvg_45;
	}

	// Method to get single weekly report
	public WeeklyReport getReport() {

		getAB();

		wr.setNumberOfNew(calNumberofNew(allStyles));

		wr.setNumberOfRepeat(calNumberofRepeat(allStyles));

		wr.setAverageQCOTime(calAverageQCOTime(allStyles));

		wr.setAvgEff_1(cal1stDayEfficiencyAverage(allStyles));
		wr.setAvgEff_2(cal2stDayEfficiencyAverage(allStyles));
		wr.setAvgEff_3(cal3stDayEfficiencyAverage(allStyles));
		wr.setAvgEff_4(cal4stDayEfficiencyAverage(allStyles));
		wr.setAvgEff_5(cal5stDayEfficiencyAverage(allStyles));
		wr.setAvgEff_1d(cal1dstDayEfficiencyAverage(allStyles));
		wr.setAvgEff_2d(cal2dstDayEfficiencyAverage(allStyles));
		wr.setAvgEff_3d(cal3dstDayEfficiencyAverage(allStyles));

		// Calculating 123new average efficiency
		wr.setAvgEff_new123(cal123EfficiencyNew(allStyles));

		// Calculating 123repeat average efficiency
		wr.setAvgEff_repeat123(cal123EfficiencyRepeat(allStyles));

		// Calculating 123all average efficiency
		wr.setAvgEff_123(cal123EfficiencyAll(allStyles));

		// Calculating EPR123new
		wr.setEPR_123n(calEPR123n(allStyles));

		// Calculating EPR123repeat
		wr.setEPR_123r(calEPR123r(allStyles));

		// Calculating EPR123All
		wr.setEPR_123(calEPR123All(allStyles));

		// Average Feeding TIme
		wr.setAvgFeedingTime(calAverageFeedingTime(allStyles));

		// Full presetting HR
		wr.setFullPresettingHR(calFullPresettingHR(allStyles));

		// Calculating Relative similarity rank
		wr.setSbHR(calRSR(allStyles));

		wr.setAvgEff_newTarget(newTarget);
		wr.setAvgEff_repeatTarget(repeatTarget);

		// Calculating 123new average efficiency
		wr.setAvgEff_45(cal45EfficiencyAverage(allStyles));

		return wr;
	}
	
	
	
	
	

	// Method to get single monthly report
	public MonthlyReport getMonthlyReport() {

		getAB();

		mr.setNumberOfNew(calNumberofNew(allStyles));

		mr.setNumberOfRepeat(calNumberofRepeat(allStyles));
		
		
		
		mr.setAverageQCOTime(calAverageQCOTime(allStyles));
		
		mr.setAvgEff_1(cal1stDayEfficiencyAverage(allStyles));
		
		mr.setAvgEff_2(cal2stDayEfficiencyAverage(allStyles));
		mr.setAvgEff_3(cal3stDayEfficiencyAverage(allStyles));
		mr.setAvgEff_4(cal4stDayEfficiencyAverage(allStyles));
		mr.setAvgEff_5(cal5stDayEfficiencyAverage(allStyles));
		mr.setAvgEff_1d(cal1dstDayEfficiencyAverage(allStyles));
		mr.setAvgEff_2d(cal2dstDayEfficiencyAverage(allStyles));
		mr.setAvgEff_3d(cal3dstDayEfficiencyAverage(allStyles));

		// Calculating 123new average efficiency
		mr.setAvgEff_new123(cal123EfficiencyNew(allStyles));

		// Calculating 123repeat average efficiency
		mr.setAvgEff_repeat123(cal123EfficiencyRepeat(allStyles));

		// Calculating 123all average efficiency
		mr.setAvgEff_123(cal123EfficiencyAll(allStyles));
		
		
		
		// Calculating EPR123new
		mr.setEPR_123n(calEPR123n(allStyles));

		// Calculating EPR123repeat
		mr.setEPR_123r(calEPR123r(allStyles));

		// Calculating EPR123All
		mr.setEPR_123(calEPR123All(allStyles));
		
		
		
		// Average Feeding TIme
		mr.setAvgFeedingTime(calAverageFeedingTime(allStyles));

		// Full presetting HR
		mr.setFullPresettingHR(calFullPresettingHR(allStyles));

		// Calculating Relative similarity rank
		mr.setSbHR(calRSR(allStyles));
		
		
		
		mr.setAvgEff_newTarget(newTarget);
		mr.setAvgEff_repeatTarget(repeatTarget);
		
		
		
		// Calculating 123new average efficiency
		mr.setAvgEff_45(cal45EfficiencyAverage(allStyles));
		
		
		
		return mr;
	}

}
