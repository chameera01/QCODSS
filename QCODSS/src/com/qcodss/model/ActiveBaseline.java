package com.qcodss.model;

import javax.persistence.Entity;

import javax.persistence.Id;

@Entity
public class ActiveBaseline {
	
	@Id
	private int year;
	private double newTarget;
	private double repeatTarget;
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getNewTarget() {
		return newTarget;
	}
	public void setNewTarget(double newTarget) {
		this.newTarget = newTarget;
	}
	public double getRepeatTarget() {
		return repeatTarget;
	}
	public void setRepeatTarget(double repeatTarget) {
		this.repeatTarget = repeatTarget;
	}
	 
	
}
