package com.qcodss.struts;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.qcodss.dao.StyleDAO;
import com.qcodss.model.Style;

public class StyleDayLastTwoAction implements SessionAware{
	public Double dayLastTwoClocked;
	public Double dayLastTwoProduced;
	public Double dayLastTwoTotalInspected;
	public Double dayLastTwoTotalPassed;
	
	public String styleNo;
	
	Style style;
	private Map<String, Object> userSession ;
	
	public String execute(){
		String returnVal = "error";
		styleNo = (String) userSession.get("styleNo");
		
		style = StyleDAO.getStyle(styleNo);
		
		
		style.setClockedHrs_2d(dayLastTwoClocked);
		style.setProducedHrs_2d(dayLastTwoProduced);
		style.setTotalInspected_2d(dayLastTwoTotalInspected);
		style.setTotalFTT_2d(dayLastTwoTotalPassed);
		
		
		
		boolean success = StyleDAO.addStyle(style);
		
		if(success){
			returnVal = "success";
		}
		return returnVal;
	}
	
	@Override
	public void setSession(Map<String, Object> session) {
		userSession = session ; 
		
	}
}
