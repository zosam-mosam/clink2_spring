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
		System.out.println(vo.getUserNo());
		int r = userMapper.insert(vo);
		System.out.println(vo.getUserNo());
		return r;
	}
	
	public UserVO login(UserVO vo) {
//		Map map = new HashMap();
//		map.put("userId", userId);
//		map.put("pwd", pwd);
		return userMapper.login(vo);
	}
	
	public UserVO getUserById(int userId) {
		return userMapper.selectUserById(userId);
	}
	
	public int checkDuplicateId(String userId) {
		return userMapper.checkDuplicateId(userId);
	}
	
	   
}
