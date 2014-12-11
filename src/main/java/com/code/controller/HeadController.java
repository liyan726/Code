package com.code.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.code.Model.User;


@Controller
@RequestMapping("/head")
public class HeadController {

	@RequestMapping("/userinf")
	public String userinf(Model no,HttpSession session){
		User user =(User)session.getAttribute("user");
		System.out.println(".......");
		no.addAttribute("user", user);
		return "/ui/basic";
	}
}
