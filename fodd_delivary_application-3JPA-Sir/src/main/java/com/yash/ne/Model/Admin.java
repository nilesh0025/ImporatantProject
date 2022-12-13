package com.yash.ne.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Admin {
	
	@Id
	int id;
    String emailId;
    String username;
    String password;  
    
	public Admin() {
		super();
	}

	public Admin(int id, String emailId, String username, String password) {
		super();
		this.id = id;
		this.emailId = emailId;
		this.username = username;
		this.password = password;
	}





	public int getId() {
		return id;
	}





	public void setId(int id) {
		this.id = id;
	}





	public String getEmailId() {
		return emailId;
	}





	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}





	public String getUsername() {
		return username;
	}





	public void setUsername(String username) {
		this.username = username;
	}





	public String getPassword() {
		return password;
	}





	public void setPassword(String password) {
		this.password = password;
	}
	
    
    

}
