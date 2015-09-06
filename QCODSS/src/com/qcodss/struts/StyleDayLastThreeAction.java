package com.qcodss.struts;

public class StyleDayLastThreeAction {
	public String dayLastThreeClocked;
	public String dayLastThreeProduced;
	public String dayLastThreeTotalInspected;
	public String dayLastThreeTotalPassed;
	
	public String execute(){
		String returnVal = "success";
		System.out.println(dayLastThreeClocked);
		
		return returnVal;
	}
}
