package com.qcodss.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "plantWR")
public class PlantWR {
	
	@Id
	@GeneratedValue
	@Column(name = "plantWR_id")
	private int id;
	
	@OneToOne
	private Plant  plant;
	
	
	public Plant getPlant() {
		return plant;
	}

	public void setPlant(Plant plant) {
		this.plant = plant;
	}

	@Column(name = "plantWR_year")
	private int year;
	
	@Column(name = "plantWR_month")
	private int month;
	
	@Column(name = "plantWR_week")
	private int week;
	
	/* no of new styles */
	@Column(name = "plantWR_newStyles")
	private int newStyles;
	
	/* no of repeat styles */
	@Column(name = "plantWR_repeatStyles")
	private int repeatStyles;
	
	/* full pre setting hit rate */
	@Column(name = "plantWR_preSettingHR")
	private double preSettingHR;
	
	/* silhouette based hit rate */
	@Column(name = "plantWR_silhouetteBasedHR")
	private double silhouetteBasedHR;
	
	/* average feeding time */
	@Column(name = "plantWR_avgFeedingTime")
	private double avgFeedingTime;
	
	/* QCO time average of all new styles */
	@Column(name = "plantWR_QCOTimeAvgNew")
	private double QCOTimeAvgNew;
	
	/* QCO time average of all repeat styles */
	@Column(name = "plantWR_QCOTimeAvgRepeat")
	private double QCOTimeAvgRepeat;
	
	/* 
	 * 1st day (new) clocked hours, produced hours, 
	 * total inspected garments, Total first time passed garments
	 */
	@Column(name = "plantWR_clockedHrs_1n")
	private double clockedHrs_1n;
	
	@Column(name = "plantWR_producedHrs_1n")
	private double producedHrs_1n;
	
	@Column(name = "plantWR_totalInspected_1n")
	private double totalInspected_1n;
	
	@Column(name = "plantWR_totalFTT_1n")
	private double totalFTT_1n;
	
	/* 
	 * 1st day (repeat) clocked hours, produced hours, 
	 * total inspected garments, Total first time passed garments
	 */
	@Column(name = "plantWR_clockedHrs_1r")
	private double clockedHrs_1r;
	
	@Column(name = "plantWR_producedHrs_1r")
	private double producedHrs_1r;
	
	@Column(name = "plantWR_totalInspected_1r")
	private double totalInspected_1r;
	
	@Column(name = "plantWR_totalFTT_1r")
	private double totalFTT_1r;
	
	/* 
	 * 2nd day (new) clocked hours, produced hours, 
	 * total inspected garments, Total first time passed garments
	 */
	@Column(name = "plantWR_clockedHrs_2n")
	private double clockedHrs_2n;
	
	@Column(name = "plantWR_producedHrs_2n")
	private double producedHrs_2n;
	
	@Column(name = "plantWR_totalInspected_2n")
	private double totalInspected_2n;
	
	@Column(name = "plantWR_totalFTT_2n")
	private double totalFTT_2n;
	
	/* 
	 * 2nd day (repeat) clocked hours, produced hours, 
	 * total inspected garments, Total first time passed garments
	 */
	@Column(name = "plantWR_clockedHrs_2r")
	private double clockedHrs_2r;
	
	@Column(name = "plantWR_producedHrs_2r")
	private double producedHrs_2r;
	
	@Column(name = "plantWR_totalInspected_2r")
	private double totalInspected_2r;
	
	@Column(name = "plantWR_totalFTT_2r")
	private double totalFTT_2r;
	
	/* 
	 * 3rd day (new) clocked hours, produced hours, 
	 * total inspected garments, Total first time passed garments
	 */
	@Column(name = "plantWR_clockedHrs_3n")
	private double clockedHrs_3n;
	
	@Column(name = "plantWR_producedHrs_3n")
	private double producedHrs_3n;
	
	@Column(name = "plantWR_totalInspected_3n")
	private double totalInspected_3n;
	
	@Column(name = "plantWR_totalFTT_3n")
	private double totalFTT_3n;
	
	/* 
	 * 3rd day (repeat) clocked hours, produced hours, 
	 * total inspected garments, Total first time passed garments
	 */
	@Column(name = "plantWR_clockedHrs_3r")
	private double clockedHrs_3r;
	
	@Column(name = "plantWR_producedHrs_3r")
	private double producedHrs_3r;
	
	@Column(name = "plantWR_totalInspected_3r")
	private double totalInspected_3r;
	
	@Column(name = "plantWR_totalFTT_3r")
	private double totalFTT_3r;

	/* 
	 * 4th day (new) clocked hours, produced hours, 
	 * total inspected garments, Total first time passed garments
	 */
	@Column(name = "plantWR_clockedHrs_4n")
	private double clockedHrs_4n;
	
	@Column(name = "plantWR_producedHrs_4n")
	private double producedHrs_4n;
	
	@Column(name = "plantWR_totalInspected_4n")
	private double totalInspected_4n;
	
	@Column(name = "plantWR_totalFTT_4n")
	private double totalFTT_4n;
	
	/* 
	 * 4th day (repeat) clocked hours, produced hours, 
	 * total inspected garments, Total first time passed garments
	 */
	@Column(name = "plantWR_clockedHrs_4r")
	private double clockedHrs_4r;
	
	@Column(name = "plantWR_producedHrs_4r")
	private double producedHrs_4r;
	
	@Column(name = "plantWR_totalInspected_4r")
	private double totalInspected_4r;
	
	@Column(name = "plantWR_totalFTT_4r")
	private double totalFTT_4r;
	
	/* 
	 * 5th day (new) clocked hours, produced hours, 
	 * total inspected garments, Total first time passed garments
	 */
	@Column(name = "plantWR_clockedHrs_5n")
	private double clockedHrs_5n;
	
	@Column(name = "plantWR_producedHrs_5n")
	private double producedHrs_5n;
	
	@Column(name = "plantWR_totalInspected_5n")
	private double totalInspected_5n;
	
	@Column(name = "plantWR_totalFTT_5n")
	private double totalFTT_5n;
	
	/* 
	 * 5th day (repeat) clocked hours, produced hours, 
	 * total inspected garments, Total first time passed garments
	 */
	@Column(name = "plantWR_clockedHrs_5r")
	private double clockedHrs_5r;
	
	@Column(name = "plantWR_producedHrs_5r")
	private double producedHrs_5r;
	
	@Column(name = "plantWR_totalInspected_5r")
	private double totalInspected_5r;
	
	@Column(name = "plantWR_totalFTT_5r")
	private double totalFTT_5r;
	
	/* 
	 * previous day clocked hours, produced hours, 
	 * total inspected garments, Total first time passed garments
	 */
	@Column(name = "plantWR_clockedHrs_1d")
	private double clockedHrs_1d;
	
	@Column(name = "plantWR_producedHrs_1d")
	private double producedHrs_1d;
	
	@Column(name = "plantWR_totalInspected_1d")
	private double totalInspected_1d;
	
	@Column(name = "plantWR_totalFTT_1d")
	private double totalFTT_1d;
	
	/* 
	 * day before previous day clocked hours, produced hours, 
	 * total inspected garments, Total first time passed garments
	 */
	@Column(name = "plantWR_clockedHrs_2d")
	private double clockedHrs_2d;
	
	@Column(name = "plantWR_producedHrs_2d")
	private double producedHrs_2d;
	
	@Column(name = "plantWR_totalInspected_2d")
	private double totalInspected_2d;
	
	@Column(name = "plantWR_totalFTT_2d")
	private double totalFTT_2d;
	
	/* 
	 * two days before previous day clocked hours, produced hours, 
	 * total inspected garments, Total first time passed garments
	 */
	@Column(name = "plantWR_clockedHrs_3d")
	private double clockedHrs_3d;
	
	@Column(name = "plantWR_producedHrs_3d")
	private double producedHrs_3d;
	
	@Column(name = "plantWR_totalInspected_3d")
	private double totalInspected_3d;
	
	@Column(name = "plantWR_totalFTT_3d")
	private double totalFTT_3d;

	
	public int getId() {
		return id;
	}

	public int getYear() {
		return year;
	}

	public int getMonth() {
		return month;
	}

	public int getWeek() {
		return week;
	}

	public int getNewStyles() {
		return newStyles;
	}

	public int getRepeatStyles() {
		return repeatStyles;
	}

	public double getPreSettingHR() {
		return preSettingHR;
	}

	public double getSilhouetteBasedHR() {
		return silhouetteBasedHR;
	}

	public void setPreSettingHR(double preSettingHR) {
		this.preSettingHR = preSettingHR;
	}

	public void setSilhouetteBasedHR(double silhouetteBasedHR) {
		this.silhouetteBasedHR = silhouetteBasedHR;
	}

	public double getAvgFeedingTime() {
		return avgFeedingTime;
	}

	public double getQCOTimeAvgNew() {
		return QCOTimeAvgNew;
	}

	public double getQCOTimeAvgRepeat() {
		return QCOTimeAvgRepeat;
	}
	
	public double getClockedHrs_1n() {
		return clockedHrs_1n;
	}

	public double getProducedHrs_1n() {
		return producedHrs_1n;
	}

	public double getTotalInspected_1n() {
		return totalInspected_1n;
	}

	public double getTotalFTT_1n() {
		return totalFTT_1n;
	}

	public double getClockedHrs_1r() {
		return clockedHrs_1r;
	}

	public double getProducedHrs_1r() {
		return producedHrs_1r;
	}

	public double getTotalInspected_1r() {
		return totalInspected_1r;
	}

	public double getTotalFTT_1r() {
		return totalFTT_1r;
	}

	public double getClockedHrs_2n() {
		return clockedHrs_2n;
	}

	public double getProducedHrs_2n() {
		return producedHrs_2n;
	}

	public double getTotalInspected_2n() {
		return totalInspected_2n;
	}

	public double getTotalFTT_2n() {
		return totalFTT_2n;
	}

	public double getClockedHrs_2r() {
		return clockedHrs_2r;
	}

	public double getProducedHrs_2r() {
		return producedHrs_2r;
	}

	public double getTotalInspected_2r() {
		return totalInspected_2r;
	}

	public double getTotalFTT_2r() {
		return totalFTT_2r;
	}

	public double getClockedHrs_3n() {
		return clockedHrs_3n;
	}

	public double getProducedHrs_3n() {
		return producedHrs_3n;
	}

	public double getTotalInspected_3n() {
		return totalInspected_3n;
	}

	public double getTotalFTT_3n() {
		return totalFTT_3n;
	}

	public double getClockedHrs_3r() {
		return clockedHrs_3r;
	}

	public double getProducedHrs_3r() {
		return producedHrs_3r;
	}

	public double getTotalInspected_3r() {
		return totalInspected_3r;
	}

	public double getTotalFTT_3r() {
		return totalFTT_3r;
	}

	public double getClockedHrs_4n() {
		return clockedHrs_4n;
	}

	public double getProducedHrs_4n() {
		return producedHrs_4n;
	}

	public double getTotalInspected_4n() {
		return totalInspected_4n;
	}

	public double getTotalFTT_4n() {
		return totalFTT_4n;
	}

	public double getClockedHrs_4r() {
		return clockedHrs_4r;
	}

	public double getProducedHrs_4r() {
		return producedHrs_4r;
	}

	public double getTotalInspected_4r() {
		return totalInspected_4r;
	}

	public double getTotalFTT_4r() {
		return totalFTT_4r;
	}

	public double getClockedHrs_5n() {
		return clockedHrs_5n;
	}

	public double getProducedHrs_5n() {
		return producedHrs_5n;
	}

	public double getTotalInspected_5n() {
		return totalInspected_5n;
	}

	public double getTotalFTT_5n() {
		return totalFTT_5n;
	}

	public double getClockedHrs_5r() {
		return clockedHrs_5r;
	}

	public double getProducedHrs_5r() {
		return producedHrs_5r;
	}

	public double getTotalInspected_5r() {
		return totalInspected_5r;
	}

	public double getTotalFTT_5r() {
		return totalFTT_5r;
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

	public void setId(int id) {
		this.id = id;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setMonth(int month) {
		this.month = month;
	}
	
	public void setWeek(int week) {
		this.week = week;
	}

	public void setNewStyles(int newStyles) {
		this.newStyles = newStyles;
	}

	public void setRepeatStyles(int repeatStyles) {
		this.repeatStyles = repeatStyles;
	}

	public void setPreSettingHR(int preSettingHR) {
		this.preSettingHR = preSettingHR;
	}

	public void setSilhouetteBasedHR(int silhouetteBasedHR) {
		this.silhouetteBasedHR = silhouetteBasedHR;
	}

	public void setAvgFeedingTime(double avgFeedingTime) {
		this.avgFeedingTime = avgFeedingTime;
	}

	public void setQCOTimeAvgNew(double qCOTimeAvgNew) {
		QCOTimeAvgNew = qCOTimeAvgNew;
	}

	public void setQCOTimeAvgRepeat(double qCOTimeAvgRepeat) {
		QCOTimeAvgRepeat = qCOTimeAvgRepeat;
	}

	public void setClockedHrs_1n(double clockedHrs_1n) {
		this.clockedHrs_1n = clockedHrs_1n;
	}

	public void setProducedHrs_1n(double producedHrs_1n) {
		this.producedHrs_1n = producedHrs_1n;
	}

	public void setTotalInspected_1n(double totalInspected_1n) {
		this.totalInspected_1n = totalInspected_1n;
	}

	public void setTotalFTT_1n(double totalFTT_1n) {
		this.totalFTT_1n = totalFTT_1n;
	}

	public void setClockedHrs_1r(double clockedHrs_1r) {
		this.clockedHrs_1r = clockedHrs_1r;
	}

	public void setProducedHrs_1r(double producedHrs_1r) {
		this.producedHrs_1r = producedHrs_1r;
	}

	public void setTotalInspected_1r(double totalInspected_1r) {
		this.totalInspected_1r = totalInspected_1r;
	}

	public void setTotalFTT_1r(double totalFTT_1r) {
		this.totalFTT_1r = totalFTT_1r;
	}

	public void setClockedHrs_2n(double clockedHrs_2n) {
		this.clockedHrs_2n = clockedHrs_2n;
	}

	public void setProducedHrs_2n(double producedHrs_2n) {
		this.producedHrs_2n = producedHrs_2n;
	}

	public void setTotalInspected_2n(double totalInspected_2n) {
		this.totalInspected_2n = totalInspected_2n;
	}

	public void setTotalFTT_2n(double totalFTT_2n) {
		this.totalFTT_2n = totalFTT_2n;
	}

	public void setClockedHrs_2r(double clockedHrs_2r) {
		this.clockedHrs_2r = clockedHrs_2r;
	}

	public void setProducedHrs_2r(double producedHrs_2r) {
		this.producedHrs_2r = producedHrs_2r;
	}

	public void setTotalInspected_2r(double totalInspected_2r) {
		this.totalInspected_2r = totalInspected_2r;
	}

	public void setTotalFTT_2r(double totalFTT_2r) {
		this.totalFTT_2r = totalFTT_2r;
	}

	public void setClockedHrs_3n(double clockedHrs_3n) {
		this.clockedHrs_3n = clockedHrs_3n;
	}

	public void setProducedHrs_3n(double producedHrs_3n) {
		this.producedHrs_3n = producedHrs_3n;
	}

	public void setTotalInspected_3n(double totalInspected_3n) {
		this.totalInspected_3n = totalInspected_3n;
	}

	public void setTotalFTT_3n(double totalFTT_3n) {
		this.totalFTT_3n = totalFTT_3n;
	}

	public void setClockedHrs_3r(double clockedHrs_3r) {
		this.clockedHrs_3r = clockedHrs_3r;
	}

	public void setProducedHrs_3r(double producedHrs_3r) {
		this.producedHrs_3r = producedHrs_3r;
	}

	public void setTotalInspected_3r(double totalInspected_3r) {
		this.totalInspected_3r = totalInspected_3r;
	}

	public void setTotalFTT_3r(double totalFTT_3r) {
		this.totalFTT_3r = totalFTT_3r;
	}

	public void setClockedHrs_4n(double clockedHrs_4n) {
		this.clockedHrs_4n = clockedHrs_4n;
	}

	public void setProducedHrs_4n(double producedHrs_4n) {
		this.producedHrs_4n = producedHrs_4n;
	}

	public void setTotalInspected_4n(double totalInspected_4n) {
		this.totalInspected_4n = totalInspected_4n;
	}

	public void setTotalFTT_4n(double totalFTT_4n) {
		this.totalFTT_4n = totalFTT_4n;
	}

	public void setClockedHrs_4r(double clockedHrs_4r) {
		this.clockedHrs_4r = clockedHrs_4r;
	}

	public void setProducedHrs_4r(double producedHrs_4r) {
		this.producedHrs_4r = producedHrs_4r;
	}

	public void setTotalInspected_4r(double totalInspected_4r) {
		this.totalInspected_4r = totalInspected_4r;
	}

	public void setTotalFTT_4r(double totalFTT_4r) {
		this.totalFTT_4r = totalFTT_4r;
	}

	public void setClockedHrs_5n(double clockedHrs_5n) {
		this.clockedHrs_5n = clockedHrs_5n;
	}

	public void setProducedHrs_5n(double producedHrs_5n) {
		this.producedHrs_5n = producedHrs_5n;
	}

	public void setTotalInspected_5n(double totalInspected_5n) {
		this.totalInspected_5n = totalInspected_5n;
	}

	public void setTotalFTT_5n(double totalFTT_5n) {
		this.totalFTT_5n = totalFTT_5n;
	}

	public void setClockedHrs_5r(double clockedHrs_5r) {
		this.clockedHrs_5r = clockedHrs_5r;
	}

	public void setProducedHrs_5r(double producedHrs_5r) {
		this.producedHrs_5r = producedHrs_5r;
	}

	public void setTotalInspected_5r(double totalInspected_5r) {
		this.totalInspected_5r = totalInspected_5r;
	}

	public void setTotalFTT_5r(double totalFTT_5r) {
		this.totalFTT_5r = totalFTT_5r;
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
