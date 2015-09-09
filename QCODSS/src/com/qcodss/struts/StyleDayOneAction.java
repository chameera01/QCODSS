package com.qcodss.struts;

import com.qcodss.dao.StyleDAO;
import com.qcodss.model.Style;

public class StyleDayOneAction {
	
	public String dayOneClocked;
	public String dayOneProduced;
	public String dayOneTotalInspected;
	public String dayOneTotalPassed;
	public String styleNo;
	
	Style style;
	
	public String execute(){
		String returnVal = "error";
		
		
		System.out.println(styleNo);
		//style = StyleDAO.getStyle(styleNo);
		
		
		return returnVal;
	}
	
}
