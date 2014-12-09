package com.code.Model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;



public class User {
	
	private int id;
	private String username;
	private String password;
	private String emails;
	private String role;
	private String qq;
	private String pho;
	private String confirm_password;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@NotEmpty(message="请输入Emails")
	@Email(message="请检查Emails格式")
	public String getEmails() {
		return emails;
	}

	@NotEmpty(message="用户名不能为空")
	public String getUsername() {
		return username;
	}
	@NotEmpty(message="密码不能为空")
	public String getPassword() {
  
		return password;
	}

	public void setEmails(String emails) {
		this.emails = emails;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		
		  System.out.println(password.length());
		this.password = password;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getPho() {
		return pho;
	}

	public void setPho(String pho) {
		this.pho = pho;
	}

	@NotEmpty(message="确认密码不能为空")
	public String getConfirm_password() {
		return confirm_password;
	}

	public void setConfirm_password(String confirm_password) {
		this.confirm_password = confirm_password;
	}

}
