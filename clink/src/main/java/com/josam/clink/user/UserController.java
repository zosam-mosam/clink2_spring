package com.josam.clink.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/user")
@Controller
public class UserController {
	@Autowired
	UserService userService;

	@PostMapping("/join.do")
	@ResponseBody
	public String join(@RequestBody UserVO userVO) {
		System.out.println(userVO);
		int r = userService.insert(userVO);
		if (r == 0) {
			System.out.println("등록실패");
		} else {
			System.out.println("등록성공");
		}
		return "도착";
//		System.out.println("=======도착============");
	}
}
