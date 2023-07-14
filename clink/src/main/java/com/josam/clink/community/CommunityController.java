package com.josam.clink.community;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CommunityController {
	
	@Autowired
	CommunityService commService;
	
	@GetMapping("/community")
	@ResponseBody
	public PopularPostList BoardList(){
		System.out.println("여기는 깐뜨롤러");
		PopularPostList ppl = new PopularPostList();
		ppl.setPopularPost(commService.boardList());
		ppl.setPopularFreePost(commService.boardFreeList());
		ppl.setPopularInfoPost(commService.boardInfoList());
		ppl.setPopularAnnPost(commService.boardAnnList());
		return ppl;
	}
//	@GetMapping("/community")
//	@ResponseBody
//	public String BoardList(){
//		System.out.println("찍혔다리");
//		return "하이";
//	}
}
