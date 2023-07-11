package com.josam.clink;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/clink") // localhost:8080//clink/~~
public class ClinkController {

	@GetMapping("/main")
	@ResponseBody
	public String main() {
		return "test";

		// main -> 사용자 이름, quote, 4month data, 연속날짜(4month data로 계산한 결과)
	}
	
}
