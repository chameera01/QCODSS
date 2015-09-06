package com.qcodss.struts;

public class StyleDayFiveAction {
	
	public String dayFiveClocked;
	public String dayFiveProduced;
	public String dayFiveTotalInspected;
	public String dayFiveTotalPassed;
	
	public String execute(){
		String returnVal = "success";
		System.out.println(dayFiveClocked);
		System.out.println(dayFiveProduced);
		System.out.println(dayFiveTotalInspected);
		System.out.println(dayFiveTotalPassed);
		
		return returnVal;
	}
}
