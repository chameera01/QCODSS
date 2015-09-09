package com.qcodss.struts;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

/* this class save styleNo and plantID in session */
public class sessionAction implements SessionAware {
	
	private Map<String, Object> styleRecSession ;
	
	public String styleNo;
	public String stylePlantID;
	
	public String execute(){
		
		/* previous sessions are removed */
		styleRecSession.remove("styleNo");
		styleRecSession.remove("stylePlantID");
		
		styleRecSession.put("styleNo",styleNo);
		styleRecSession.put("stylePlantID",stylePlantID);
		
		/* verify whether new session values are stored */
		if(styleRecSession.get("styleNo") != null || styleRecSession.get("stylePlantID") != null){
			System.out.println("styleNo : "+styleRecSession.get("styleNo"));
			System.out.println("stylePlantID : "+styleRecSession.get("stylePlantID"));
			
			return "success";
		} else{
			return "error";
		}
	}
	
	@Override
	public void setSession(Map<String, Object> session) {
		styleRecSession = session ;
		
	}

}
