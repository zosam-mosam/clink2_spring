package com.josam.clink;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import com.josam.clink.user.UserMapper;
import com.josam.clink.user.UserVO;

@SpringBootTest
@AutoConfigureMockMvc
public class UserTest {
	
	@Test
	public void test() {
		System.out.println("sss");
	}
	
	@Autowired
	UserMapper mapper;
	
	@Test
	public void testInsert() {
		UserVO user= new UserVO();
		user.setUserId("GPT");
		user.setUserName("지피티");
		user.setNickname("지땡글");
		user.setPwd("gpt1234");
		user.setEmail("gpt@openai.com");
		
		mapper.insert(user);
	}

}
