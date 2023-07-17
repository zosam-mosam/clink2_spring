package com.josam.clink.challenge;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.josam.clink.user.UserVO;

@RequestMapping("/challenge")
@Controller
public class ChallengeController {
	@Autowired
	ChallengeService challengeService;

	@GetMapping("/")
	@ResponseBody
	public ChallengeVO challenge(@RequestBody String userId) {
		
		ExpenseVO evo = new ExpenseVO();
		evo.setUserNO(Integer.parseInt(userId));
		ChallengeVO cvo = challengeService.myChallenge(evo);
		
		
		return cvo; 
	}
}
