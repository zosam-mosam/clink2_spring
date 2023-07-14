package com.josam.clink.community;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class CommuityVO {
	private int boardNO;
	private int boardCategoryNo;
	private int userNo;
	private int boardView;
	private int boardLikes;
	private String boardTitle;
	private String boardContent;
	private String boardWriter;
	private Timestamp boardDate;
	
}
