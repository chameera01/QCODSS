package com.qcodss.struts;

public class StyleDayFourAction {
	public String dayFourClocked;
	public String dayFourProduced;
	public String dayFourTotalInspected;
	public String dayFourTotalPassed;
	
	public String execute(){
		String returnVal = "success";
		System.out.println(dayFourClocked);
		System.out.println(dayFourProduced);
		System.out.println(dayFourTotalInspected);
		System.out.println(dayFourTotalPassed);
		
		return returnVal;
	}
}
