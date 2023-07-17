package com.josam.clink.challenge;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.josam.clink.user.UserVO;

@Service
public class ChallengeService {
	@Autowired
	ChallengeMapper mapper;

	public ChallengeVO myChallenge(ExpenseVO vo) {
		// 비밀번호 암호화
		return mapper.myChallenge(vo);
	}
	
	public List<ExpenseVO> todayExpense(ExpenseVO vo) {
		
		return mapper.todayExpense(vo);
	}
	
	public List<ExpenseVO> weekExpense(ExpenseVO vo){
		
		return mapper.weekExpense(vo);
	};
	
	public List<ExpenseVO> selectedExpense(ExpenseVO vo){
		
		return mapper.selectedExpense(vo);
	};
}
