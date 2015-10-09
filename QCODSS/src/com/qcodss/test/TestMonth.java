package com.qcodss.test;

import com.qcodss.dao.StyleDAO;
import com.qcodss.reportcontroller.ReportController;
import com.qcodss.reportmodels.MonthlyReport;

public class TestMonth {
	public static void main(String args[]){
		
		ReportController wrc = new ReportController("September", 2015, 1);
		MonthlyReport mr =  wrc.getMonthlyReport();
		
		System.out.println("Month : " + mr.getMonth());
		
		System.out.println("Number of new : " + mr.getNumberOfNew());
		System.out.println("Number of repeat : " + mr.getNumberOfRepeat());
		
		System.out.println("Average QCO time : " + mr.getAverageQCOTime());
		System.out.println("Firstday Average Efficiency : " + mr.getAvgEff_1());
		
		
		
		System.out.println("Second day average Efficiency : " + mr.getAvgEff_2());
		System.out.println("Third day average Efficiency : " + mr.getAvgEff_3());
		
		System.out.println("First 3 day efficiency new : " + mr.getAvgEff_new123());
		System.out.println("First 3 day efficiency repeat : " + mr.getAvgEff_repeat123());
		
		System.out.println("First 3 day efficiency all : " + mr.getAvgEff_123());
		
		System.out.println("Endline Pass Rate 1st three day new : "+ mr.getEPR_123n());
		
		System.out.println("Endline Pass Rate 1st three day repeat : "+ mr.getEPR_123r());
		
		System.out.println("Endline Pass Rate 1st three day All : "+ mr.getEPR_123());
		
		
		
		System.out.println("Average feeding time : " + mr.getAvgFeedingTime());
		
		System.out.println("Full presetting HR : " + mr.getFullPresettingHR());
		
		System.out.println("Relative Similarity Rank/ Silhotte based HR : " + mr.getSbHR());
		
		
		
		System.out.println(mr.getAvgEff_newTarget());
		
		System.out.println(mr.getAvgEff_repeatTarget());
		
		
		
		System.out.println("4 5 Efficiency average : " + mr.getAvgEff_45());
		
		
		System.out.println("Number of monthes 2015  : "+StyleDAO.getNumofMonthes(2015));
		
	}
}
