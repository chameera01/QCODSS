package com.qcodss.struts;

import com.opensymphony.xwork2.ActionContext;
import com.qcodss.dao.PlantDAO;
import com.qcodss.dao.UserDAO;
import com.qcodss.model.Plant;
import com.qcodss.model.User;

public class AddUsersAction {
	public String name;
	public String email;
	public String password;
	public String userlevel;
	public String plant;
	
	
	public String execute(){
		
		//int id = Integer.parseInt(ActionContext.getContext().getSession().get("id").toString());
		
		String returnVal = "error";
		Plant p = new Plant();
		p = PlantDAO.getPlant(plant);
		
		User user = new User();
		user.setName(name);
		user.setEmail(email);
		user.setPassword(password);
		user.setPlantid(p);
		user.setRole(userlevel);
		
		boolean ret = UserDAO.addUser(user);
		
		if(ret){
			returnVal = "success";
		}
		
		return returnVal;
	}
	
	
	
} 
