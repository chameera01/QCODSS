package com.qcodss.struts;

import com.qcodss.dao.UserDAO;
import com.qcodss.model.User;

public class DeleteUserAction {
	
	public int id;
	
	public String execute(){
		String returnVal ="error";
		
		User user = new User();
		user.setId(id);
		
		UserDAO userDao = new UserDAO();
		
		boolean result = userDao.deleteUser(user);
		
		if(result){
			returnVal = "success";
		}
		
		return returnVal;
	}
	
}
