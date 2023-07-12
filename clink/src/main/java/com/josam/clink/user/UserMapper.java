package com.josam.clink.user;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
	
	int insert(UserVO vo);
}
