package com.josam.clink.challenge;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class ChallengePageVO {
	
	private int challengeId;
	private int userNO;
	private String title;
	private String description;
	private BigDecimal goal;
}
