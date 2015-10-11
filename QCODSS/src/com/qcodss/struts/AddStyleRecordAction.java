package com.qcodss.struts;

import java.util.Date;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.qcodss.dao.StyleDAO;
import com.qcodss.model.Plant;
import com.qcodss.model.Style;



public class AddStyleRecordAction implements SessionAware {
	
	private Map<String, Object> userSession ;
	
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
	public Integer weekNo;
	Date startDate = new Date();

	Plant plant= new Plant();
	
	public String execute() {
		
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
		style.setStartDate(startDate);
		style.setWeekNo(weekNo);
		
		if(fullPresettingChecker()){
			style.setFullPresetting(1);
		}
		
		
		StyleDAO styleDao = new StyleDAO();
		
		Boolean value = styleDao.addStyle(style);
		
		System.out.println("** : "+value);
	
		if(value){
			returnVal = "success";
		}	
		
		return returnVal;
		
	}
	
	
	public boolean fullPresettingChecker(){
		boolean value = false;
		
		if(machineSetting.equals(1) && preTraining.equals(1) && preBulk.equals(1) && predictability.equals(1)){
			value= true;
		}
		
		
		return value;
	}
	
	@Override
	public void setSession(Map<String, Object> session) {
		userSession = session ;
		
	}
	
}
