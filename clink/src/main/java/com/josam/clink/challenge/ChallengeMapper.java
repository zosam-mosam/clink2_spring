package com.josam.clink.challenge;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.josam.clink.user.UserVO;

@Mapper
public interface ChallengeMapper {
	
	ChallengeVO myChallenge(ExpenseVO vo);
	List<ExpenseVO> todayExpense(ExpenseVO vo);
	List<ExpenseVO> weekExpense(ExpenseVO vo);
	List<ExpenseVO> selectedExpense(ExpenseVO vo);
	List<DayChallengeVO> allExpense(ExpenseVO vo);
	List<DayChallengeVO> getTodayExpense(ExpenseVO vo);
	int insertDayChallenge(DayChallengeVO vo);
}
