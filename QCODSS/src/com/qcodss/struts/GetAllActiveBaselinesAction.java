package com.qcodss.struts;

import java.util.List;

import com.qcodss.dao.ActiveBaselineDAO;

import com.qcodss.model.ActiveBaseline;


public class GetAllActiveBaselinesAction {
	String returnVal = "success";
	
	
	public List<ActiveBaseline> allActiveBaselines = null;
	
	public String execute(){
		
		ActiveBaselineDAO ABDao = new ActiveBaselineDAO();
		
		allActiveBaselines = ABDao.getAllActiveBaselines();
		
		
		
		return returnVal;
	}	
}
