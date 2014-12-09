package com.code.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.code.Mapper.UserMapper;
import com.code.Model.Mes;
import com.code.Model.User;

@Controller
public class LoginController {

	@Resource
	private UserMapper usermapper;
	@Resource
	private Mes me;
	@RequestMapping("/login")
	private String login(Model mo){
		User u =new User();
		mo.addAttribute("err", me);
		mo.addAttribute(u);
		return "/login/login";
	}
	
	@RequestMapping("/log")
	private String log(User u,Model mo,HttpServletRequest req){
		String username =u.getUsername();
		String pas = u.getPassword();
		User user =usermapper.selectUserByname(username);
		if(username==null){
			me.setMes_name("用户名为空");
			mo.addAttribute("err", me);
			return "redirect:/login";
		}
		else if(pas==null){
			me.setMes_name("密码为空");
			mo.addAttribute("err", me);
			return "redirect:/login";
		}
		else if(user==null){
			me.setMes_name("账号不存在");
			mo.addAttribute("err", me);
			return "redirect:/login";
		}
		else if(!pas.equals(user.getPassword())){
			me.setMes_name("密码输入有误");
			mo.addAttribute("err", me);
			return "redirect:/login";
		}
		req.getSession().setAttribute("user", user);
		return "/index";
	}
	@RequestMapping("index")
	private String index(Model mo,HttpServletRequest req){
		User u =(User) req.getSession().getAttribute("user");
		if(u==null){
			me.setMes_name("请先登录");
			mo.addAttribute("err", me);
			return "redirect:/login";
			
		}
		return "/index";
	}
}
