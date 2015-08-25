package com.qcodss.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Style {

	@Id
	@GeneratedValue
	@Column(name = "style_no")
	private int style_no;
	
	/* 'n' for new, 'r' for repeat */
	@Column(name = "style_new_repeat")
	private String new_repeat;
	
	@Column(name = "style_started_date")
	private Date started_date;
	
	@Column(name = "style_recorded_date")
	private Date recorded_date;
	
	/* 1 for done, 0 for not */
	@Column(name = "style_pre_setting")
	private int pre_setting;
	
	/* 1 for done, 0 for not */
	@Column(name = "style_pre_training")
	private int pre_training;
	
	/* 1 for done, 0 for not */
	@Column(name = "style_pre_bulk")
	private int pre_bulk;
	
	/* 1 for done, 0 for not */
	@Column(name = "style_predictability")
	private int predictability;
	
	/* 1 if all four facts done otherwise 0 */
	@Column(name = "style_full_presetting")
	private int full_presetting;
	
	@Column(name = "style_rsr")
	private int rsr;
	
	@Column(name = "style_module_no")
	private int module_no;
	
	@Column(name = "style_feeding_time")
	private int feeding_time;
	
	@Column(name = "style_qco_time")
	private int qco_time;
	
	/* 
	 * 1st day clocked hours, produced hours, 
	 * total inspected garments, Total first time passed garments
	 */
	@Column(name = "style_clocked_hrs_1")
	private double clocked_hrs_1;
	
	@Column(name = "style_produced_hrs_1")
	private double produced_hrs_1;
	
	@Column(name = "style_total_inspected_1")
	private double total_inspected_1;
	
	@Column(name = "style_total_ftt_1")
	private double total_ftt_1;
	
	/* 
	 * 2nd day clocked hours, produced hours, 
	 * total inspected garments, Total first time passed garments
	 */	
	@Column(name = "style_clocked_hrs_2")
	private double clocked_hrs_2;
	
	@Column(name = "style_produced_hrs_2")
	private double produced_hrs_2;
	
	@Column(name = "style_total_inspected_2")
	private double total_inspected_2;
	
	@Column(name = "style_total_ftt_2")
	private double total_ftt_2;
	
	/* 
	 * 3rd day clocked hours, produced hours, 
	 * total inspected garments, Total first time passed garments
	 */	
	@Column(name = "style_clocked_hrs_3")
	private double clocked_hrs_3;
	
	@Column(name = "style_produced_hrs_3")
	private double produced_hrs_3;
	
	@Column(name = "style_total_inspected_3")
	private double total_inspected_3;
	
	@Column(name = "style_total_ftt_3")
	private double total_ftt_3;

	/* 
	 * 4th day clocked hours, produced hours, 
	 * total inspected garments, Total first time passed garments
	 */	
	@Column(name = "style_clocked_hrs_4")
	private double clocked_hrs_4;
	
	@Column(name = "style_produced_hrs_4")
	private double produced_hrs_4;
	
	@Column(name = "style_total_inspected_4")
	private double total_inspected_4;
	
	@Column(name = "style_total_ftt_4")
	private double total_ftt_4;
	
	/* 
	 * 5th day clocked hours, produced hours, 
	 * total inspected garments, Total first time passed garments
	 */	
	@Column(name = "style_clocked_hrs_5")
	private double clocked_hrs_5;
	
	@Column(name = "style_produced_hrs_5")
	private double produced_hrs_5;
	
	@Column(name = "style_total_inspected_5")
	private double total_inspected_5;
	
	@Column(name = "style_total_ftt_5")
	private double total_ftt_5;
	
	/* 
	 * previous day clocked hours, produced hours, 
	 * total inspected garments, Total first time passed garments
	 */
	@Column(name = "style_clocked_hrs_1d")
	private double clocked_hrs_1d;
	
	@Column(name = "style_produced_hrs_1d")
	private double produced_hrs_1d;
	
	@Column(name = "style_total_inspected_1d")
	private double total_inspected_1d;
	
	@Column(name = "style_total_ftt_1d")
	private double total_ftt_1d;
	
	/* 
	 * day before previous day clocked hours, produced hours, 
	 * total inspected garments, Total first time passed garments
	 */
	@Column(name = "style_clocked_hrs_2d")
	private double clocked_hrs_2d;
	
	@Column(name = "style_produced_hrs_2d")
	private double produced_hrs_2d;
	
	@Column(name = "style_total_inspected_2d")
	private double total_inspected_2d;
	
	@Column(name = "style_total_ftt_2d")
	private double total_ftt_2d;
	
	/* 
	 * two days before previous day clocked hours, produced hours, 
	 * total inspected garments, Total first time passed garments
	 */
	@Column(name = "style_clocked_hrs_3d")
	private double clocked_hrs_3d;
	
	@Column(name = "style_produced_hrs_3d")
	private double produced_hrs_3d;
	
	@Column(name = "style_total_inspected_3d")
	private double total_inspected_3d;
	
	@Column(name = "style_total_ftt_3d")
	private double total_ftt_3d;

	
	public int getStyle_no() {
		return style_no;
	}

	public String getNew_repeat() {
		return new_repeat;
	}

	public Date getStarted_date() {
		return started_date;
	}

	public Date getRecorded_date() {
		return recorded_date;
	}

	public int getPre_setting() {
		return pre_setting;
	}

	public int getPre_training() {
		return pre_training;
	}

	public int getPre_bulk() {
		return pre_bulk;
	}

	public int getPredictability() {
		return predictability;
	}

	public int getFull_presetting() {
		return full_presetting;
	}

	public int getRsr() {
		return rsr;
	}

	public int getModule_no() {
		return module_no;
	}

	public int getFeeding_time() {
		return feeding_time;
	}

	public int getQco_time() {
		return qco_time;
	}

	public double getClocked_hrs_1() {
		return clocked_hrs_1;
	}

	public double getProduced_hrs_1() {
		return produced_hrs_1;
	}

	public double getTotal_inspected_1() {
		return total_inspected_1;
	}

	public double getTotal_ftt_1() {
		return total_ftt_1;
	}

	public double getClocked_hrs_2() {
		return clocked_hrs_2;
	}

	public double getProduced_hrs_2() {
		return produced_hrs_2;
	}

	public double getTotal_inspected_2() {
		return total_inspected_2;
	}

	public double getTotal_ftt_2() {
		return total_ftt_2;
	}

	public double getClocked_hrs_3() {
		return clocked_hrs_3;
	}

	public double getProduced_hrs_3() {
		return produced_hrs_3;
	}

	public double getTotal_inspected_3() {
		return total_inspected_3;
	}

	public double getTotal_ftt_3() {
		return total_ftt_3;
	}

	public double getClocked_hrs_4() {
		return clocked_hrs_4;
	}

	public double getProduced_hrs_4() {
		return produced_hrs_4;
	}

	public double getTotal_inspected_4() {
		return total_inspected_4;
	}

	public double getTotal_ftt_4() {
		return total_ftt_4;
	}

	public double getClocked_hrs_5() {
		return clocked_hrs_5;
	}

	public double getProduced_hrs_5() {
		return produced_hrs_5;
	}

	public double getTotal_inspected_5() {
		return total_inspected_5;
	}

	public double getTotal_ftt_5() {
		return total_ftt_5;
	}

	public double getClocked_hrs_1d() {
		return clocked_hrs_1d;
	}

	public double getProduced_hrs_1d() {
		return produced_hrs_1d;
	}

	public double getTotal_inspected_1d() {
		return total_inspected_1d;
	}

	public double getTotal_ftt_1d() {
		return total_ftt_1d;
	}

	public double getClocked_hrs_2d() {
		return clocked_hrs_2d;
	}

	public double getProduced_hrs_2d() {
		return produced_hrs_2d;
	}

	public double getTotal_inspected_2d() {
		return total_inspected_2d;
	}

	public double getTotal_ftt_2d() {
		return total_ftt_2d;
	}

	public double getClocked_hrs_3d() {
		return clocked_hrs_3d;
	}

	public double getProduced_hrs_3d() {
		return produced_hrs_3d;
	}

	public double getTotal_inspected_3d() {
		return total_inspected_3d;
	}

	public double getTotal_ftt_3d() {
		return total_ftt_3d;
	}

	public void setStyle_no(int style_no) {
		this.style_no = style_no;
	}

	/* only "n" and "r" values are allowed. otherwise returned false*/
	public boolean setNew_repeat(String new_repeat) {
		
		if(new_repeat.equals("n")||new_repeat.equals("r")) {
			this.new_repeat = new_repeat;
			return true;
		} else {
			return false;
		}
	}

	public void setStarted_date(Date started_date) {
		this.started_date = started_date;
	}

	public void setRecorded_date(Date recorded_date) {
		this.recorded_date = recorded_date;
	}

	public void setPre_setting(int pre_setting) {
		this.pre_setting = pre_setting;
	}

	public void setPre_training(int pre_training) {
		this.pre_training = pre_training;
	}

	public void setPre_bulk(int pre_bulk) {
		this.pre_bulk = pre_bulk;
	}

	public void setPredictability(int predictability) {
		this.predictability = predictability;
	}

	public void setFull_presetting(int full_presetting) {
		this.full_presetting = full_presetting;
	}

	public void setRsr(int rsr) {
		this.rsr = rsr;
	}

	public void setModule_no(int module_no) {
		this.module_no = module_no;
	}

	public void setFeeding_time(int feeding_time) {
		this.feeding_time = feeding_time;
	}

	public void setQco_time(int qco_time) {
		this.qco_time = qco_time;
	}

	public void setClocked_hrs_1(double clocked_hrs_1) {
		this.clocked_hrs_1 = clocked_hrs_1;
	}

	public void setProduced_hrs_1(double produced_hrs_1) {
		this.produced_hrs_1 = produced_hrs_1;
	}

	public void setTotal_inspected_1(double total_inspected_1) {
		this.total_inspected_1 = total_inspected_1;
	}

	public void setTotal_ftt_1(double total_ftt_1) {
		this.total_ftt_1 = total_ftt_1;
	}

	public void setClocked_hrs_2(double clocked_hrs_2) {
		this.clocked_hrs_2 = clocked_hrs_2;
	}

	public void setProduced_hrs_2(double produced_hrs_2) {
		this.produced_hrs_2 = produced_hrs_2;
	}

	public void setTotal_inspected_2(double total_inspected_2) {
		this.total_inspected_2 = total_inspected_2;
	}

	public void setTotal_ftt_2(double total_ftt_2) {
		this.total_ftt_2 = total_ftt_2;
	}

	public void setClocked_hrs_3(double clocked_hrs_3) {
		this.clocked_hrs_3 = clocked_hrs_3;
	}

	public void setProduced_hrs_3(double produced_hrs_3) {
		this.produced_hrs_3 = produced_hrs_3;
	}

	public void setTotal_inspected_3(double total_inspected_3) {
		this.total_inspected_3 = total_inspected_3;
	}

	public void setTotal_ftt_3(double total_ftt_3) {
		this.total_ftt_3 = total_ftt_3;
	}

	public void setClocked_hrs_4(double clocked_hrs_4) {
		this.clocked_hrs_4 = clocked_hrs_4;
	}

	public void setProduced_hrs_4(double produced_hrs_4) {
		this.produced_hrs_4 = produced_hrs_4;
	}

	public void setTotal_inspected_4(double total_inspected_4) {
		this.total_inspected_4 = total_inspected_4;
	}

	public void setTotal_ftt_4(double total_ftt_4) {
		this.total_ftt_4 = total_ftt_4;
	}

	public void setClocked_hrs_5(double clocked_hrs_5) {
		this.clocked_hrs_5 = clocked_hrs_5;
	}

	public void setProduced_hrs_5(double produced_hrs_5) {
		this.produced_hrs_5 = produced_hrs_5;
	}

	public void setTotal_inspected_5(double total_inspected_5) {
		this.total_inspected_5 = total_inspected_5;
	}

	public void setTotal_ftt_5(double total_ftt_5) {
		this.total_ftt_5 = total_ftt_5;
	}

	public void setClocked_hrs_1d(double clocked_hrs_1d) {
		this.clocked_hrs_1d = clocked_hrs_1d;
	}

	public void setProduced_hrs_1d(double produced_hrs_1d) {
		this.produced_hrs_1d = produced_hrs_1d;
	}

	public void setTotal_inspected_1d(double total_inspected_1d) {
		this.total_inspected_1d = total_inspected_1d;
	}

	public void setTotal_ftt_1d(double total_ftt_1d) {
		this.total_ftt_1d = total_ftt_1d;
	}

	public void setClocked_hrs_2d(double clocked_hrs_2d) {
		this.clocked_hrs_2d = clocked_hrs_2d;
	}

	public void setProduced_hrs_2d(double produced_hrs_2d) {
		this.produced_hrs_2d = produced_hrs_2d;
	}

	public void setTotal_inspected_2d(double total_inspected_2d) {
		this.total_inspected_2d = total_inspected_2d;
	}

	public void setTotal_ftt_2d(double total_ftt_2d) {
		this.total_ftt_2d = total_ftt_2d;
	}

	public void setClocked_hrs_3d(double clocked_hrs_3d) {
		this.clocked_hrs_3d = clocked_hrs_3d;
	}

	public void setProduced_hrs_3d(double produced_hrs_3d) {
		this.produced_hrs_3d = produced_hrs_3d;
	}

	public void setTotal_inspected_3d(double total_inspected_3d) {
		this.total_inspected_3d = total_inspected_3d;
	}

	public void setTotal_ftt_3d(double total_ftt_3d) {
		this.total_ftt_3d = total_ftt_3d;
	}
}
