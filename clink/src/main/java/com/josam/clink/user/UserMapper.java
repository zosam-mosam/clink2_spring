package com.josam.clink.user;

import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
	
	int insert(UserVO vo);
	int login(String userId, String pwd);
}
