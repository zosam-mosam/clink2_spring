package com.josam.clink.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	UserMapper userMapper;

	public int insert(UserVO vo) {
		return userMapper.insert(vo);
	}
}
