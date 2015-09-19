package com.qcodss.struts;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.qcodss.dao.PlantBaselineDAO;
import com.qcodss.model.Plant;
import com.qcodss.model.PlantBaseline;

public class PlantBaselineAction implements SessionAware  {
	
	private Map<String, Object> userSession ;
	
	public int year;
	public int month;
	public double budgetedEff;
	
	Plant plant = new Plant();
	
	String returnVal="error";
	
	public String execute(){
		
		
		
		int plantID = ((int)userSession.get("plantID"));
		
		
		
		plant.setId(plantID);
		
		
		
		
		PlantBaseline pb = new PlantBaseline();
		pb.setPlant(plant);
		pb.setMonth(month);
		pb.setYear(year);
		pb.setBudgetedEfficiency(budgetedEff);
		
		boolean value = PlantBaselineDAO.addPlantBaseline(pb);
		
		if(value){
			returnVal = "success";
		}
		
		
		
		return returnVal;
	}
	
	
	@Override
	public void setSession(Map<String, Object> session) {
		userSession = session ; 
		
	}
}
