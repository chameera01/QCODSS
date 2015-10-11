package com.qcodss.struts;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.qcodss.dao.StyleDAO;
import com.qcodss.model.Style;

public class StyleDayFourAction implements SessionAware{
	public Double dayFourClocked;
	public Double dayFourProduced;
	public Double dayFourTotalInspected;
	public Double dayFourTotalPassed;
	public String styleNo;
	
	Style style;
	private Map<String, Object> userSession ;
	
	
	public String execute(){
		String returnVal = "success";
		
		StyleDAO styleDao = new StyleDAO();
		
		styleNo = (String) userSession.get("styleNo");
		
		
		
		style = styleDao.getStyle(styleNo);
		
		
		style.setClockedHrs_4(dayFourClocked);
		style.setProducedHrs_4(dayFourProduced);
		style.setTotalInspected_4(dayFourTotalInspected);
		style.setTotalFTT_4(dayFourTotalPassed);
		
		
		
		
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
