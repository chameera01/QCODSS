package com.qcodss.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;



@Entity
public class User {
	
	@Id
	@GeneratedValue
	@Column(name = "user_id")
	private int id;
	
	@Column(name = "user_name")
	private String name;
	
	@Column(name = "user_email", unique = true, nullable = false)
	private String email;
	
	@Column(name = "user_password")
	private String password;
	
	@Column(name = "user_profile_pic")
	private String profile_pic;
	
	@Column(name = "user_role")
	private String role;
	
	@OneToOne
	//@Column(name = "user_plantid")
	private Plant  plantid;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getProfile_pic() {
		return profile_pic;
	}
	public void setProfile_pic(String profile_pic) {
		this.profile_pic = profile_pic;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Plant getPlantid() {
		return plantid;
	}
	public void setPlantid(Plant plantid) {
		this.plantid = plantid;
	}

}
