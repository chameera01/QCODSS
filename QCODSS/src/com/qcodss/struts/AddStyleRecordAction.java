package com.qcodss.struts;

import com.qcodss.dao.StyleDAO;
import com.qcodss.model.Plant;
import com.qcodss.model.Style;



public class AddStyleRecordAction {
	
	public Integer plantName;
	public String styleNo;
	public String styleType;
	public Integer moduleNo;
	public Integer machineSetting;
	public Integer preTraining;
	public Integer preBulk;
	public Integer predictability;
	public Integer feedingTime;
	public Integer QCOTime;
	public Integer similarityRank;
	

	Plant plant= new Plant();
	
	
	public String execute(){
		String returnVal = "error";
		
		plant.setId(plantName);
	
		Style style = new Style();
		style.setStyle_no(styleNo);
		style.setNewRepeat(styleType);
		style.setModuleNo(moduleNo);
		style.setPreSetting(machineSetting);
		style.setPreTraining(preTraining);
		style.setPreBulk(preBulk);
		style.setPredictability(predictability);
		style.setFeedingTime(feedingTime);
		style.setQCOTime(QCOTime);
		style.setRsr(similarityRank);
		style.setPlant(plant);
	
		Boolean value = StyleDAO.addStyle(style);
	
		if(value){
			returnVal = "success";
		}
	
		
		
		return returnVal;
	}
	
}
