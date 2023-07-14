package com.josam.clink.community;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommunityService {
	
	@Autowired
	CommunityMapper mapper;
	
	public List<CommuityVO> boardList(){
		List<CommuityVO> list = mapper.list();
		return list;
	}
	public List<CommuityVO> boardFreeList(){
		List<CommuityVO> list = mapper.freeList();
		return list;
	}
	public List<CommuityVO> boardInfoList(){
		List<CommuityVO> list = mapper.infoList();
		return list;
	}
	public List<CommuityVO> boardAnnList(){
		List<CommuityVO> list = mapper.annList();
		return list;
	}
}
