package com.qcodss.reportmodels;

import java.text.DecimalFormat;

public class WeeklyReport {
	
	private int weekNo;
	private int numberOfNew;
	private int numberOfRepeat;
	private double averageQCOTime;
	private double avgEff_1;
	private double avgEff_2;
	private double avgEff_3;
	private double avgEff_4;
	private double avgEff_5;
	private double avgEff_1d;
	private double avgEff_2d;
	private double avgEff_3d;

	private double avgEff_newTarget;
	private double avgEff_repeatTarget;
	private double avgEff_new123;
	private double avgEff_repeat123;
	private double avgEff_123;
	
	private double EPR_123n;
	private double EPR_123r;
	private double EPR_123;
	
	private double avgFeedingTime;
	private double bucketLoss;
	private double fullPresettingHR;
	private double avgEff_45;
	private double sbHR;
	
	
	
	
	public double getEPR_123n() {
		EPR_123n =  Math.floor(EPR_123n) ;
		return EPR_123n;
	}
	public void setEPR_123n(double ePR_123n) {
		EPR_123n = ePR_123n;
	}
	public double getEPR_123r() {
		EPR_123r =  Math.floor(EPR_123r) ;
		return EPR_123r;
	}
	public void setEPR_123r(double ePR_123r) {
		EPR_123r = ePR_123r;
	}
	public double getAvgEff_1d() {
		avgEff_1d =  Math.floor(avgEff_1d) ;
		return avgEff_1d;
	}
	public void setAvgEff_1d(double avgEff_1d) {
		this.avgEff_1d = avgEff_1d;
	}
	public double getAvgEff_2d() {
		avgEff_2d =  Math.floor(avgEff_2d) ;
		return avgEff_2d;
	}
	public void setAvgEff_2d(double avgEff_2d) {
		
		this.avgEff_2d = avgEff_2d;
	}
	public double getAvgEff_3d() {
		avgEff_3d =  Math.floor(avgEff_3d) ;
		return avgEff_3d;
	}
	public void setAvgEff_3d(double avgEff_3d) {
		this.avgEff_3d = avgEff_3d;
	}
	public double getAvgEff_4() {
		avgEff_4 =  Math.floor(avgEff_4) ;
		return avgEff_4;
	}
	public void setAvgEff_4(double avgEff_4) {
		this.avgEff_4 = avgEff_4;
	}
	public double getAvgEff_5() {
		avgEff_5 =  Math.floor(avgEff_5) ;
		return avgEff_5;
	}
	public void setAvgEff_5(double avgEff_5) {
		this.avgEff_5 = avgEff_5;
	}
	
	
	public int getWeekNo() {
		return weekNo;
	}
	public void setWeekNo(int weekNo) {
		this.weekNo = weekNo;
	}
	public int getNumberOfNew() {
		return numberOfNew;
	}
	public void setNumberOfNew(int numberOfNew) {
		this.numberOfNew = numberOfNew;
	}
	public int getNumberOfRepeat() {
		
		return numberOfRepeat;
	}
	public void setNumberOfRepeat(int numberOfRepeat) {
		this.numberOfRepeat = numberOfRepeat;
	}
	public double getAverageQCOTime() {
		averageQCOTime =  Math.floor(averageQCOTime) ;
		return averageQCOTime;
	}
	public void setAverageQCOTime(double averageQCOTime) {
		this.averageQCOTime = averageQCOTime;
	}
	public double getAvgEff_1() {
		avgEff_1 =  Math.floor(avgEff_1) ;
		return avgEff_1;
	}
	public void setAvgEff_1(double avgEff_1) {
		
		this.avgEff_1 = avgEff_1;
	}
	public double getAvgEff_2() {
		avgEff_2 =  Math.floor(avgEff_2) ;
		return avgEff_2;
	}
	public void setAvgEff_2(double avgEff_2) {
		this.avgEff_2 = avgEff_2;
	}
	public double getAvgEff_3() {
		avgEff_3 =  Math.floor(avgEff_3) ;
		return avgEff_3;
	}
	public void setAvgEff_3(double avgEff_3) {
		this.avgEff_3 = avgEff_3;
	}
	public double getAvgEff_newTarget() {
		avgEff_newTarget =  Math.floor(avgEff_newTarget) ;
		return avgEff_newTarget;
	}
	public void setAvgEff_newTarget(double avgEff_newTarget) {
		this.avgEff_newTarget = avgEff_newTarget;
	}
	public double getAvgEff_repeatTarget() {
		avgEff_repeatTarget =  Math.floor(avgEff_repeatTarget) ;
		return avgEff_repeatTarget;
	}
	public void setAvgEff_repeatTarget(double avgEff_repeatTarget) {
		this.avgEff_repeatTarget = avgEff_repeatTarget;
	}
	public double getAvgEff_new123() {
		avgEff_new123 =  Math.floor(avgEff_new123) ;
		return avgEff_new123;
	}
	public void setAvgEff_new123(double avgEff_new123) {
		this.avgEff_new123 = avgEff_new123;
	}
	public double getAvgEff_repeat123() {
		avgEff_repeat123 =  Math.floor(avgEff_repeat123) ;
		return avgEff_repeat123;
	}
	public void setAvgEff_repeat123(double avgEff_repeat123) {
		this.avgEff_repeat123 = avgEff_repeat123;
	}
	public double getAvgEff_123() {
		avgEff_123 =  Math.floor(avgEff_123) ;
		return avgEff_123;
	}
	public void setAvgEff_123(double avgEff_123) {
		this.avgEff_123 = avgEff_123;
	}
	public double getEPR_123() {
		EPR_123 =  Math.floor(EPR_123) ;
		return EPR_123;
	}
	public void setEPR_123(double ePR_123) {
		EPR_123 = ePR_123;
	}
	public double getAvgFeedingTime() {
		avgFeedingTime =  Math.floor(avgFeedingTime) ;
		return avgFeedingTime;
	}
	public void setAvgFeedingTime(double avgFeedingTime) {
		this.avgFeedingTime = avgFeedingTime;
	}
	public double getBucketLoss() {
		bucketLoss =  Math.floor(bucketLoss) ;
		return bucketLoss;
	}
	public void setBucketLoss(double bucketLoss) {
		this.bucketLoss = bucketLoss;
	}
	public double getFullPresettingHR() {
		fullPresettingHR =  Math.floor(fullPresettingHR) ;
		return fullPresettingHR;
	}
	public void setFullPresettingHR(double fullPresettingHR) {
		this.fullPresettingHR = fullPresettingHR;
	}
	public double getAvgEff_45() {
		avgEff_45 =  Math.floor(avgEff_45) ;
		return avgEff_45;
	}
	public void setAvgEff_45(double avgEff_45) {
		this.avgEff_45 = avgEff_45;
	}
	public double getSbHR() {
		sbHR =  Math.floor(sbHR) ;
		return sbHR;
	}
	public void setSbHR(double sbHR) {
		this.sbHR = sbHR;
	}
	
	
	
	
	
}
