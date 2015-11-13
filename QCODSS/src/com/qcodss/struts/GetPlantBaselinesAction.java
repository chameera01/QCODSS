package com.qcodss.struts;

import java.util.List;



import com.qcodss.dao.PlantBaselineDAO;
import com.qcodss.model.PlantBaseline;

public class GetPlantBaselinesAction {
String returnVal = "success";
	
	public int plantID;
	public List<PlantBaseline> allPlantBaselines = null;
	
	public String execute(){
		
		
		
		PlantBaselineDAO PBDao = new PlantBaselineDAO();
		
		allPlantBaselines = PBDao.getAllPlantBaselinesByPlant(plantID);
		
		
		
		return returnVal;
	}	
}
