package com.code.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class Hello {

	@RequestMapping("/hello")
	public String hello(Model moel) {

		
		System.out.println("ds");

		return "hello";
	}
}
