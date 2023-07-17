package com.josam.clink.user;

import java.net.http.HttpClient.Redirect;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/user")
@Controller
public class UserController {
	@Autowired
	UserService userService;

	@PostMapping("/join.do") // 얘는 되는 애,,
	@ResponseBody
	public String join(@RequestBody UserVO userVO) {
//		System.out.println(userVO);
		int r = userService.insert(userVO);
		if (r == 0) {
			return "no";
		} else {
			return "yes";
		}
	}
	
	@PostMapping("/login.do")
	@ResponseBody
<<<<<<< HEAD
	public String login(@RequestBody UserVO userVO) { 
		System.out.println("도착했니?@!?!?!?!?!?!??!!!?");
		int login = userService.login(userVO.getUserId(), userVO.getPwd());
=======
	public String login(@RequestBody
			UserVO userVO) { 
		System.out.println("도착했니?@!?!?!?!?!?!??!!!?");
		int login = userService.login(userVO.userId, userVO.pwd);
>>>>>>> upstream/main
		System.out.println(login);
		if(login == 0) {
			return "fail";
		}else {
			// 토큰..? 저장
			return "success";
		}
		
	}
}
