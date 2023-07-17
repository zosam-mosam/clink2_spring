package com.josam.clink.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/community")// http://localhost:port/community/?category=
public class BoardController {
	@Autowired
	BoardService boardService;
	
	@GetMapping("/category")
	public @ResponseBody List<BoardVO> findCommonCategory(@RequestParam int categoryNo) throws Exception{
		
		return boardService.getCategoryPosts(categoryNo);
	}
	
	@GetMapping("/post")
	public @ResponseBody BoardVO getPostConetent(@RequestParam int boardNo) {
		return boardService.getPost(boardNo);
	}
	@GetMapping("/post/comment")
	public @ResponseBody List<CommentVO> getComments(@RequestParam int boardNo) throws Exception {
		return boardService.getPostsComment(boardNo);
	}
	
}
