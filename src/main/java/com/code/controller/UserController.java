package com.code.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.code.Mapper.UserMapper;
import com.code.Model.User;

@Controller()
@RequestMapping("/user")
public class UserController {

	@Resource
	private UserMapper usermapper;
	
	@RequestMapping("/adduser")
	private String add(User u,Model mo){
		
		return "/user/addusers";
	}
	@RequestMapping(value="/add",method=RequestMethod.POST)
	private String addUser(@Validated User u,BindingResult br){
		if(br.hasErrors()){
			return "/user/addusers";
		}
		usermapper.saveUser(u);
		return "/suc";
	}
}
