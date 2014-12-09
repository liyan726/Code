package com.code.Mapper;

import com.code.Model.User;


public interface UserMapper {

	User selectUserByid(int id);
	
	User selectUserByname(String name);
	
	void saveUser(User  u);
	
	int updateUser(User u);
}
