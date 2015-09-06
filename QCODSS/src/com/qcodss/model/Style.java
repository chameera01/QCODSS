package com.qcodss.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Style {

	@Id
	@Column(name = "style_no")
	private int style_no;
	
	/* 'n' for new, 'r' for repeat */
	@Column(name = "style_newRepeat")
	private String newRepeat;
	
	@Column(name = "style_finishDate")
	private Date finishDate;
	
	/* 1 for done, 0 for not */
	@Column(name = "style_preSetting")
	private int preSetting;
	
	/* 1 for done, 0 for not */
	@Column(name = "style_preTraining")
	private int preTraining;
	
	/* 1 for done, 0 for not */
	@Column(name = "style_preBulk")
	private int preBulk;
	
	/* 1 for done, 0 for not */
	@Column(name = "style_predictability")
	private int predictability;
	
	/* 1 if all four facts done otherwise 0 */
	@Column(name = "style_fullPresetting")
	private int fullPresetting;
	
	@Column(name = "style_rsr")
	private int rsr;
	
	@Column(name = "style_moduleNo")
	private int moduleNo;
	
	@Column(name = "style_feedingTime")
	private int feedingTime;
	
	@Column(name = "style_QCOTime")
	private int QCOTime;
	
	/* 
	 * 1st day clocked hours, produced hours, 
	 * total inspected garments, Total first time passed garments
	 */
	@Column(name = "style_clockedHrs_1")
	private double clockedHrs_1;
	
	@Column(name = "style_producedHrs_1")
	private double producedHrs_1;
	
	@Column(name = "style_totalInspected_1")
	private double totalInspected_1;
	
	@Column(name = "style_totalFTT_1")
	private double totalFTT_1;
	
	/* 
	 * 2nd day clocked hours, produced hours, 
	 * total inspected garments, Total first time passed garments
	 */
	@Column(name = "style_clockedHrs_2")
	private double clockedHrs_2;
	
	@Column(name = "style_producedHrs_2")
	private double producedHrs_2;
	
	@Column(name = "style_totalInspected_2")
	private double totalInspected_2;
	
	@Column(name = "style_totalFTT_2")
	private double totalFTT_2;
	
	/* 
	 * 3rd day clocked hours, produced hours, 
	 * total inspected garments, Total first time passed garments
	 */
	@Column(name = "style_clockedHrs_3")
	private double clockedHrs_3;
	
	@Column(name = "style_producedHrs_3")
	private double producedHrs_3;
	
	@Column(name = "style_totalInspected_3")
	private double totalInspected_3;
	
	@Column(name = "style_totalFTT_3")
	private double totalFTT_3;

	/* 
	 * 4th day clocked hours, produced hours, 
	 * total inspected garments, Total first time passed garments
	 */
	@Column(name = "style_clockedHrs_4")
	private double clockedHrs_4;
	
	@Column(name = "style_producedHrs_4")
	private double producedHrs_4;
	
	@Column(name = "style_totalInspected_4")
	private double totalInspected_4;
	
	@Column(name = "style_totalFTT_4")
	private double totalFTT_4;
	
	/* 
	 * 5th day clocked hours, produced hours, 
	 * total inspected garments, Total first time passed garments
	 */
	@Column(name = "style_clockedHrs_5")
	private double clockedHrs_5;
	
	@Column(name = "style_producedHrs_5")
	private double producedHrs_5;
	
	@Column(name = "style_totalInspected_5")
	private double totalInspected_5;
	
	@Column(name = "style_totalFTT_5")
	private double totalFTT_5;
	
	/* 
	 * previous day clocked hours, produced hours, 
	 * total inspected garments, Total first time passed garments
	 */
	@Column(name = "style_clockedHrs_1d")
	private double clockedHrs_1d;
	
	@Column(name = "style_producedHrs_1d")
	private double producedHrs_1d;
	
	@Column(name = "style_totalInspected_1d")
	private double totalInspected_1d;
	
	@Column(name = "style_totalFTT_1d")
	private double totalFTT_1d;
	
	/* 
	 * day before previous day clocked hours, produced hours, 
	 * total inspected garments, Total first time passed garments
	 */
	@Column(name = "style_clockedHrs_2d")
	private double clockedHrs_2d;
	
	@Column(name = "style_producedHrs_2d")
	private double producedHrs_2d;
	
	@Column(name = "style_totalInspected_2d")
	private double totalInspected_2d;
	
	@Column(name = "style_totalFTT_2d")
	private double totalFTT_2d;
	
	/* 
	 * two days before previous day clocked hours, produced hours, 
	 * total inspected garments, Total first time passed garments
	 */
	@Column(name = "style_clockedHrs_3d")
	private double clockedHrs_3d;
	
	@Column(name = "style_producedHrs_3d")
	private double producedHrs_3d;
	
	@Column(name = "style_totalInspected_3d")
	private double totalInspected_3d;
	
	@Column(name = "style_totalFTT_3d")
	private double totalFTT_3d;

	
	public int getStyle_no() {
		return style_no;
	}

	public String getNewRepeat() {
		return newRepeat;
	}

	public Date getFinishDate() {
		return finishDate;
	}

	public int getPreSetting() {
		return preSetting;
	}

	public int getPreTraining() {
		return preTraining;
	}

	public int getPreBulk() {
		return preBulk;
	}

	public int getPredictability() {
		return predictability;
	}

	public int getFullPresetting() {
		return fullPresetting;
	}

	public int getRsr() {
		return rsr;
	}

	public int getModuleNo() {
		return moduleNo;
	}

	public int getFeedingTime() {
		return feedingTime;
	}

	public int getQCOTime() {
		return QCOTime;
	}

	public double getClockedHrs_1() {
		return clockedHrs_1;
	}

	public double getProducedHrs_1() {
		return producedHrs_1;
	}

	public double getTotalInspected_1() {
		return totalInspected_1;
	}

	public double getTotalFTT_1() {
		return totalFTT_1;
	}

	public double getClockedHrs_2() {
		return clockedHrs_2;
	}

	public double getProducedHrs_2() {
		return producedHrs_2;
	}

	public double getTotalInspected_2() {
		return totalInspected_2;
	}

	public double getTotalFTT_2() {
		return totalFTT_2;
	}

	public double getClockedHrs_3() {
		return clockedHrs_3;
	}

	public double getProducedHrs_3() {
		return producedHrs_3;
	}

	public double getTotalInspected_3() {
		return totalInspected_3;
	}

	public double getTotalFTT_3() {
		return totalFTT_3;
	}

	public double getClockedHrs_4() {
		return clockedHrs_4;
	}

	public double getProducedHrs_4() {
		return producedHrs_4;
	}

	public double getTotalInspected_4() {
		return totalInspected_4;
	}

	public double getTotalFTT_4() {
		return totalFTT_4;
	}

	public double getClockedHrs_5() {
		return clockedHrs_5;
	}

	public double getProducedHrs_5() {
		return producedHrs_5;
	}

	public double getTotalInspected_5() {
		return totalInspected_5;
	}

	public double getTotalFTT_5() {
		return totalFTT_5;
	}

	public double getClockedHrs_1d() {
		return clockedHrs_1d;
	}

	public double getProducedHrs_1d() {
		return producedHrs_1d;
	}

	public double getTotalInspected_1d() {
		return totalInspected_1d;
	}

	public double getTotalFTT_1d() {
		return totalFTT_1d;
	}

	public double getClockedHrs_2d() {
		return clockedHrs_2d;
	}

	public double getProducedHrs_2d() {
		return producedHrs_2d;
	}

	public double getTotalInspected_2d() {
		return totalInspected_2d;
	}

	public double getTotalFTT_2d() {
		return totalFTT_2d;
	}

	public double getClockedHrs_3d() {
		return clockedHrs_3d;
	}

	public double getProducedHrs_3d() {
		return producedHrs_3d;
	}

	public double getTotalInspected_3d() {
		return totalInspected_3d;
	}

	public double getTotalFTT_3d() {
		return totalFTT_3d;
	}

	public void setStyle_no(int style_no) {
		this.style_no = style_no;
	}

	public void setNewRepeat(String newRepeat) {
		this.newRepeat = newRepeat;
	}

	public void setStartDate(Date finishDate) {
		this.finishDate = finishDate;
	}

	public void setPreSetting(int preSetting) {
		this.preSetting = preSetting;
	}

	public void setPreTraining(int preTraining) {
		this.preTraining = preTraining;
	}

	public void setPreBulk(int preBulk) {
		this.preBulk = preBulk;
	}

	public void setPredictability(int predictability) {
		this.predictability = predictability;
	}

	public void setFullPresetting(int fullPresetting) {
		this.fullPresetting = fullPresetting;
	}

	public void setRsr(int rsr) {
		this.rsr = rsr;
	}

	public void setModuleNo(int moduleNo) {
		this.moduleNo = moduleNo;
	}

	public void setFeedingTime(int feedingTime) {
		this.feedingTime = feedingTime;
	}

	public void setQCOTime(int qCOTime) {
		QCOTime = qCOTime;
	}

	public void setClockedHrs_1(double clockedHrs_1) {
		this.clockedHrs_1 = clockedHrs_1;
	}

	public void setProducedHrs_1(double producedHrs_1) {
		this.producedHrs_1 = producedHrs_1;
	}

	public void setTotalInspected_1(double totalInspected_1) {
		this.totalInspected_1 = totalInspected_1;
	}

	public void setTotalFTT_1(double totalFTT_1) {
		this.totalFTT_1 = totalFTT_1;
	}

	public void setClockedHrs_2(double clockedHrs_2) {
		this.clockedHrs_2 = clockedHrs_2;
	}

	public void setProducedHrs_2(double producedHrs_2) {
		this.producedHrs_2 = producedHrs_2;
	}

	public void setTotalInspected_2(double totalInspected_2) {
		this.totalInspected_2 = totalInspected_2;
	}

	public void setTotalFTT_2(double totalFTT_2) {
		this.totalFTT_2 = totalFTT_2;
	}

	public void setClockedHrs_3(double clockedHrs_3) {
		this.clockedHrs_3 = clockedHrs_3;
	}

	public void setProducedHrs_3(double producedHrs_3) {
		this.producedHrs_3 = producedHrs_3;
	}

	public void setTotalInspected_3(double totalInspected_3) {
		this.totalInspected_3 = totalInspected_3;
	}

	public void setTotalFTT_3(double totalFTT_3) {
		this.totalFTT_3 = totalFTT_3;
	}

	public void setClockedHrs_4(double clockedHrs_4) {
		this.clockedHrs_4 = clockedHrs_4;
	}

	public void setProducedHrs_4(double producedHrs_4) {
		this.producedHrs_4 = producedHrs_4;
	}

	public void setTotalInspected_4(double totalInspected_4) {
		this.totalInspected_4 = totalInspected_4;
	}

	public void setTotalFTT_4(double totalFTT_4) {
		this.totalFTT_4 = totalFTT_4;
	}

	public void setClockedHrs_5(double clockedHrs_5) {
		this.clockedHrs_5 = clockedHrs_5;
	}

	public void setProducedHrs_5(double producedHrs_5) {
		this.producedHrs_5 = producedHrs_5;
	}

	public void setTotalInspected_5(double totalInspected_5) {
		this.totalInspected_5 = totalInspected_5;
	}

	public void setTotalFTT_5(double totalFTT_5) {
		this.totalFTT_5 = totalFTT_5;
	}

	public void setClockedHrs_1d(double clockedHrs_1d) {
		this.clockedHrs_1d = clockedHrs_1d;
	}

	public void setProducedHrs_1d(double producedHrs_1d) {
		this.producedHrs_1d = producedHrs_1d;
	}

	public void setTotalInspected_1d(double totalInspected_1d) {
		this.totalInspected_1d = totalInspected_1d;
	}

	public void setTotalFTT_1d(double totalFTT_1d) {
		this.totalFTT_1d = totalFTT_1d;
	}

	public void setClockedHrs_2d(double clockedHrs_2d) {
		this.clockedHrs_2d = clockedHrs_2d;
	}

	public void setProducedHrs_2d(double producedHrs_2d) {
		this.producedHrs_2d = producedHrs_2d;
	}

	public void setTotalInspected_2d(double totalInspected_2d) {
		this.totalInspected_2d = totalInspected_2d;
	}

	public void setTotalFTT_2d(double totalFTT_2d) {
		this.totalFTT_2d = totalFTT_2d;
	}

	public void setClockedHrs_3d(double clockedHrs_3d) {
		this.clockedHrs_3d = clockedHrs_3d;
	}

	public void setProducedHrs_3d(double producedHrs_3d) {
		this.producedHrs_3d = producedHrs_3d;
	}

	public void setTotalInspected_3d(double totalInspected_3d) {
		this.totalInspected_3d = totalInspected_3d;
	}

	public void setTotalFTT_3d(double totalFTT_3d) {
		this.totalFTT_3d = totalFTT_3d;
	}

}
