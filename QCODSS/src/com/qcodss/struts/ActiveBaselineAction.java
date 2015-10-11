package com.qcodss.struts;

import com.qcodss.dao.ActiveBaselineDAO;
import com.qcodss.model.ActiveBaseline;

public class ActiveBaselineAction {
	
	public int year;
	public double newTarget;
	public double repeatTarget;
	
	String returnVal="error";
	
	public String execute(){
		
		ActiveBaseline AB = new ActiveBaseline();
		AB.setYear(year);
		AB.setNewTarget(newTarget);
		AB.setRepeatTarget(repeatTarget);
		
		ActiveBaselineDAO activeBaselineDao = new ActiveBaselineDAO();
		
		boolean value = activeBaselineDao.addActiveBaseline(AB);
		
		if(value){
			returnVal="success";
		}
		
		return returnVal;
	}
	
}
