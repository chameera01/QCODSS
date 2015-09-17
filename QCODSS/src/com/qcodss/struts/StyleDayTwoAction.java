package com.qcodss.struts;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.qcodss.dao.StyleDAO;
import com.qcodss.model.Style;

public class StyleDayTwoAction implements SessionAware {
	public Double dayTwoClocked;
	public Double dayTwoProduced;
	public Double dayTwoTotalInspected;
	public Double dayTwoTotalPassed;
	public String styleNo;
	
	Style style;
	private Map<String, Object> userSession ;
	
	public String execute(){
		String returnVal = "error";
		
		styleNo = (String) userSession.get("styleNo");
		
		style = StyleDAO.getStyle(styleNo);
		
		
		style.setClockedHrs_2(dayTwoClocked);
		style.setProducedHrs_2(dayTwoProduced);
		style.setTotalInspected_2(dayTwoTotalInspected);
		style.setTotalFTT_2(dayTwoTotalPassed);
		
		
		
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
