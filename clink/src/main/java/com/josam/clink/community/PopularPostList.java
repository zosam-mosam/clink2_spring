package com.josam.clink.community;

import java.util.List;

import lombok.Data;

@Data
public class PopularPostList {
	private List<CommuityVO> popularPost;
	private List<CommuityVO> popularFreePost;
	private List<CommuityVO> popularInfoPost;
	private List<CommuityVO> popularAnnPost;
}
