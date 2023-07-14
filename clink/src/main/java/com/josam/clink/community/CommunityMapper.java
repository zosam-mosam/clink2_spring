package com.josam.clink.community;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CommunityMapper {
	List<CommuityVO> list();
	List<CommuityVO> freeList(); 
	List<CommuityVO> infoList(); 
	List<CommuityVO> annList(); 
}
