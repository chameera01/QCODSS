package com.qcodss.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class PlantBaseline {
	
	@Id
	@GeneratedValue
	private int id;
	
	private int year;
	
	private int month;
	
	private double budgetedEfficiency; 
	
	@OneToOne
	private Plant plant;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public double getBudgetedEfficiency() {
		return budgetedEfficiency;
	}

	public void setBudgetedEfficiency(double budgetedEfficiency) {
		this.budgetedEfficiency = budgetedEfficiency;
	}

	public Plant getPlant() {
		return plant;
	}

	public void setPlant(Plant plant) {
		this.plant = plant;
	}
	
	
	
}
