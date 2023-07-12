package com.josam.clink.user;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
public interface UserMapper {
	
	int insert(UserVO vo);
}
