package com.code.controller;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.code.Mapper.UserMapper;
import com.code.Model.CheckBox;
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
	
	@RequestMapping("/users")
	private String users(Model mo){
		List<User> user =usermapper.getAlluser();
		mo.addAttribute("lis", user);
		return "/user/users";
	}
	
	@RequestMapping(value = "/deluser", method = RequestMethod.POST)
	@ResponseBody
	private void delUser(CheckBox ck,Model mo,HttpServletRequest request,HttpServletResponse response) throws IOException{
		List li =ck.getCheckboxes();
		for(Iterator<Integer> it =li.iterator();it.hasNext();){
			usermapper.deleteUser(it.next());
		}
		String res="�ɹ�ɾ��"+li.size()+"��";
		response.setCharacterEncoding("UTF-8");
		response.getWriter().write(res);
	}
	
	@RequestMapping("/update")
	private String updateUser(int id,Model mo){
		mo.addAttribute("user",usermapper.selectUserByid(id));
		return "/user/updateusers";
	}
	
	@RequestMapping("/updatedo")
	private String updatedo(User u,Model mo){
		
		System.out.println(u.getUsername());
		System.out.println(u.getPassword());
		System.out.println(u.getRole());
		System.out.println(u.getId());
			usermapper.updateUser(u);
		return "/sucup";
	}
	
	
	@RequestMapping("/info")
	private String infodo(int id,Model mo){
	  User u= usermapper.selectUserByid(id);
	    mo.addAttribute("user",u);
		return "/user/usershow";
	}
	
}
