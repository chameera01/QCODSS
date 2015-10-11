package com.qcodss.struts;

import com.qcodss.dao.PlantDAO;
import com.qcodss.model.Plant;

public class AddPlantsAction {
	
	public String name;
	
	public String execute(){
		
		String returnVal = "success";
		
		
		System.out.println(name);
		Plant p1 = new Plant();
		
		p1.setName(name);
		
		PlantDAO plantDao = new PlantDAO(); 
		
		plantDao.addPlant(p1);
		
		
		return returnVal;
	}

}
