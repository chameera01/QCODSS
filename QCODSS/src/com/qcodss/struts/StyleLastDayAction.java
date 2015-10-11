package com.qcodss.struts;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.qcodss.dao.StyleDAO;
import com.qcodss.model.Style;

public class StyleLastDayAction implements SessionAware{
	
	public Double dayLastClocked;
	public Double dayLastProduced;
	public Double dayLastTotalInspected;
	public Double dayLastTotalPassed;
	
	public String styleNo;
	
	Style style;
	private Map<String, Object> userSession ;
	
	public String execute(){
		String returnVal = "error";
		
		styleNo = (String) userSession.get("styleNo");
		
		StyleDAO styleDao = new StyleDAO();
		style = styleDao.getStyle(styleNo);
		
		
		style.setClockedHrs_1d(dayLastClocked);
		style.setProducedHrs_1d(dayLastProduced);
		style.setTotalInspected_1d(dayLastTotalInspected);
		style.setTotalFTT_1d(dayLastTotalPassed);
		
		
		//StyleDAO styleDao = new StyleDAO();
		boolean success = styleDao.addStyle(style);
		
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
