package com.code.envTest;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.code.Mapper.UserMapper;
import com.code.Model.User;

@RunWith(SpringJUnit4ClassRunner.class)
// Ê¹ÓÃSpringtest¿ò¼Ü
@ContextConfiguration("/beans.xml")
public class UserTest {
	@Resource
	// ×¢Èë
	private UserMapper userMapper;

	@Test
	public void test() {
		User use = userMapper.selectUserByname("test");

		System.out.println(use);
	}

}
