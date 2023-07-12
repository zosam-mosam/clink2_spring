package com.josam.clink.user;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	UserMapper userMapper;

	public int insert(UserVO vo) {
		// 비밀번호 암호화
		return userMapper.insert(vo);
	}
	
	public int login(String userId, String pwd) {
//		Map map = new HashMap();
//		map.put("userId", userId);
//		map.put("pwd", pwd);
		return userMapper.login(userId, pwd);
	}
}
