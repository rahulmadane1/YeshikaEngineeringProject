package com.boot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="UserDetails",schema="reportgneration")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="userId")	
    private	int userId;
			

    private String username;
	
    private String emailId;
		
    private String password;

    private String role;
	
	
	

	public User() {
		
		// TODO Auto-generated constructor stub
	}

	public User(int userId, String username, String emailId, String password, String role) {
		super();
		this.userId = userId;
		this.username = username;
		this.emailId = emailId;
		this.password = password;
		this.role = role;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + ", emailId=" + emailId + ", password=" + password
				+ ", role=" + role + "]";
	}
    
    
    



}