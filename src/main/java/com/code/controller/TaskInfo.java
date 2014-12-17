package com.code.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.code.Mapper.UserMapper;
import com.code.Model.Taskinf;


@Controller
@RequestMapping("/task")
public class TaskInfo {
	
	@Resource
	private UserMapper usermapper;
	
	@RequestMapping("/taskpage")
	public String toTaskfiler(Model mo){
		Taskinf ta =new Taskinf();
		mo.addAttribute(ta);
		
		return "/task/taskinf";
	}
	
	@RequestMapping("/taskdo")
	public String doTask(){
		
		
		return "/suc";
	}
}
