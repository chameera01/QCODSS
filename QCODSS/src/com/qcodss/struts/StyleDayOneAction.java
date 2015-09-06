package com.qcodss.struts;

public class StyleDayOneAction {
	
	public String dayOneClocked;
	public String dayOneProduced;
	public String dayOneTotalInspected;
	public String dayOneTotalPassed;
	
	public String execute(){
		String returnVal = "success";
		System.out.println(dayOneClocked);
		System.out.println(dayOneProduced);
		System.out.println(dayOneTotalInspected);
		System.out.println(dayOneTotalPassed);
		
		
		return returnVal;
	}
	
}
