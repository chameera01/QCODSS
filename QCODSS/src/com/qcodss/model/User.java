package com.qcodss.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String username;
	private String email;
	private String password;
	private String profile_pic;
	private String role;
	private int plantid;

}
