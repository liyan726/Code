package com.code.envTest;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.code.Mapper.UserMapper;
import com.code.Model.User;

@RunWith(SpringJUnit4ClassRunner.class) //ʹ��Springtest���
@ContextConfiguration("/beans.xml")
public class UserTest {
	@Resource //ע��
	private UserMapper userMapper;
	
	@Test
	public void test() {
		User u = new User();
		u.setEmails("ds");
		u.setUsername("����");
		u.setPassword("pas");
		u.setRole("role2");
		
		//User user = userMapper.selectUserByid(0);
	System.out.println("dsd"+u.getUsername());
		//System.out.println(user.getPassword());
	userMapper.saveUser(u);
	//System.out.println(re);
		
	}
}
