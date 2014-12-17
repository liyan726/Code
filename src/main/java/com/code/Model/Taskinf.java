package com.code.Model;

import java.util.Date;



public class Taskinf {

	private int id;
	private String name;
	private String content;
	
	private Date pastime;
	private int email;
	private User user;
	
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
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
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getPastime() {
		return pastime;
	}
	public void setPastime(Date pastime) {
		this.pastime = pastime;
	}
	public int getEmail() {
		return email;
	}
	public void setEmail(int email) {
		this.email = email;
	}
	
	
}
