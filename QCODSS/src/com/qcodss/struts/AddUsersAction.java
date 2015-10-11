package com.qcodss.struts;


import com.qcodss.dao.PlantDAO;
import com.qcodss.dao.UserDAO;
import com.qcodss.model.Plant;
import com.qcodss.model.User;

public class AddUsersAction {
	public String name;
	public String email;
	public String password;
	public String userlevel;
	public String plantName;
	
	
	public String execute(){
		
		//int id = Integer.parseInt(ActionContext.getContext().getSession().get("id").toString());
		
		String returnVal = "error";
		
		//System.out.println("From the drop down" + plantName);
		
		Plant p = new Plant();
		
		PlantDAO plantDao = new PlantDAO();
		
		p = plantDao.getPlant(plantName);
		
		//System.out.println("from plant table "+ p.getName());
		
		User user = new User();
		user.setName(name);
		user.setEmail(email);
		user.setPassword(password);
		user.setPlantid(p);
		user.setRole(userlevel);
		
		UserDAO userDao = new UserDAO();
		
		boolean ret = userDao.addUser(user);
		
		if(ret){
			returnVal = "success";
		}
		
		return returnVal;
	}
	
	
	
} 
