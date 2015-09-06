package com.qcodss.struts;

public class StyleLastDayAction {
	
	public String dayLastClocked;
	public String dayLastProduced;
	public String dayLastTotalInspected;
	public String dayLastTotalPassed;
	
	public String execute(){
		String returnVal = "success";
		System.out.println(dayLastClocked);
		System.out.println(dayLastProduced);
		System.out.println(dayLastTotalInspected);
		System.out.println(dayLastTotalPassed);
		
		
		return returnVal;
	}
	
}
