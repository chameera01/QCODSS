package com.qcodss.struts;

public class StyleDayTwoAction {
	public String dayTwoClocked;
	public String dayTwoProduced;
	public String dayTwoTotalInspected;
	public String dayTwoTotalPassed;
	
	public String execute(){
		String returnVal = "success";
		System.out.println(dayTwoClocked);
		System.out.println(dayTwoProduced);
		System.out.println(dayTwoTotalInspected);
		System.out.println(dayTwoTotalPassed);
		
		return returnVal;
	}
}
