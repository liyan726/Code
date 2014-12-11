package com.code.InfoService.Impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.code.InfoService.UserInfoservice;
import com.code.Mapper.PhotoMapper;
import com.code.Mapper.UserMapper;
import com.code.Model.Photo;
import com.code.Model.User;

@Service
public class UserInfoImpl implements UserInfoservice {


	@Resource //×¢Èë
	private UserMapper userMapper;
	
	@Resource //×¢Èë
	private PhotoMapper photoMapper;
	public boolean SavePhoto(Photo ph, User u) {
		photoMapper.SavePhoto(ph);
		Photo p =photoMapper.find(ph.getMark());
		u.setPhoto(p);
		userMapper.updateUser(u);
		
		return true;
	}

}
