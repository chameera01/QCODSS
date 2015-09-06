package com.qcodss.struts;

public class StyleDayThreeAction {
	public String dayThreeClocked;
	public String dayThreeProduced;
	public String dayThreeTotalInspected;
	public String dayThreeTotalPassed;
	
	public String execute(){
		String returnVal = "success";
		System.out.println(dayThreeClocked);
		System.out.println(dayThreeProduced);
		System.out.println(dayThreeTotalInspected);
		System.out.println(dayThreeTotalPassed);
		
		return returnVal;
	}
}
