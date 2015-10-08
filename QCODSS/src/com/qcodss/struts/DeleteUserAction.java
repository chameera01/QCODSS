package com.qcodss.struts;

import com.qcodss.dao.UserDAO;
import com.qcodss.model.User;

public class DeleteUserAction {
	
	public int id;
	
	public String execute(){
		String returnVal ="error";
		
		User user = new User();
		user.setId(id);
		
		boolean result = UserDAO.deleteUser(user);
		
		if(result){
			returnVal = "success";
		}
		
		return returnVal;
	}
	
}
