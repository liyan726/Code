package com.code.envTest;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.code.Mapper.PhotoMapper;
import com.code.Mapper.UserMapper;
import com.code.Model.Photo;
import com.code.Model.User;



@RunWith(SpringJUnit4ClassRunner.class) //ʹ��Springtest���
@ContextConfiguration("/beans.xml")
public class TestMybatisInterMapper {

	@Resource //ע��
	private UserMapper userMapper;
	
	@Resource //ע��
	private PhotoMapper photoMapper;
	@Test
	public void test() {

		/*Photo p =new Photo();
		p.setUrl("ds893");

		photoMapper.SavePhoto(p);*/
		
	    Photo ph=photoMapper.find("20141211165552965565");
	    
	    System.out.println("============="+ph.getUrl());
		/*System.out.println("====================="+ph.getId());
		User u =userMapper.selectUserByid(1);
	    u.setPhoto(ph);
		userMapper.updateUser(u);
		
		User u2 =userMapper.selectAll(1);
		System.out.println("============"+u2.getPhoto().getUrl());*/
	}

}
