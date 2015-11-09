package com.qcodss.struts;

import java.util.List;

import com.qcodss.dao.PlantDAO;

import com.qcodss.model.Plant;


public class ViewPlantsAction {
	
String returnVal = "success";
	
	
	public List<Plant> allPlants = null;
	
	public String execute(){
		
		PlantDAO plantDao = new PlantDAO();
		
		allPlants = plantDao.getAllPlants();
		
		
		
		return returnVal;
	}
	
}
