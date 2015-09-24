package com.qcodss.test;

import com.qcodss.reportcontroller.WeekReportController;
import com.qcodss.reportmodels.WeeklyReport;

public class Test {
	
	public static void main(String args[]){
		
		WeekReportController wrc = new WeekReportController(1, 2015, 1);
		WeeklyReport wr =  wrc.getReport();
		
		System.out.println("Average QCO time : " + wr.getAverageQCOTime());
		System.out.println("Firstday Average Efficiency : " + wr.getAvgEff_1());
		System.out.println("Second day average Efficiency : " + wr.getAvgEff_2());
		System.out.println("Third day average Efficiency : " + wr.getAvgEff_3());
		
		System.out.println("First 3 day efficiency new : " + wr.getAvgEff_new123());
		System.out.println("First 3 day efficiency repeat : " + wr.getAvgEff_repeat123());
		
		System.out.println("First 3 day efficiency all : " + wr.getAvgEff_123());
		
		System.out.println("Endline Pass Rate 1st three day new : "+ wr.getEPR_123n());
		
		System.out.println("Endline Pass Rate 1st three day repeat : "+ wr.getEPR_123r());
		
		System.out.println("Endline Pass Rate 1st three day All : "+ wr.getEPR_123());
		
		System.out.println("Average feeding time : " + wr.getAvgFeedingTime());
		
		System.out.println("Full presetting HR : " + wr.getFullPresettingHR());
		
		System.out.println("Relative Similarity Rank/ Silhotte based HR : " + wr.getSbHR());
		
		System.out.println(wr.getAvgEff_newTarget());
		
		System.out.println(wr.getAvgEff_repeatTarget());
		
		System.out.println("4 5 Efficiency average : " + wr.getAvgEff_45());
		
	}
	
}
