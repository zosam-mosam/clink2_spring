package com.josam.clink.main;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/main") // http://localhost:port/main/info?userId=testuser
public class MainController {

	@Autowired
	MainService mainService;
	
	@GetMapping("/info")
	@ResponseBody
	public MainVO getMainInfo(@RequestParam String userId) {

		MainVO mainVO = new MainVO();

		//userID
		mainVO.setUserID(userId);

		//Quote
		int quoteNumber = 2;
		QuoteVO quote = mainService.getQuote(quoteNumber);

		if(quote == null) System.out.println("quote Error");
		else mainVO.setQuote(quote);

		// Month data Test
		List<MonthDataVO> monthData = mainService.getMonthData(userId);
		// mock data
		monthData.add(new MonthDataVO(Date.valueOf("2023-07-10"), 1));
		monthData.add(new MonthDataVO(Date.valueOf("2023-07-11"), 0));
		monthData.add(new MonthDataVO(Date.valueOf("2023-07-12"), 1));
		mainVO.setMonthData(monthData);

		//Data test
		DataVO dataVO = mainService.getData(userId);
		dataVO.setChallenge(50000);
		mainVO.setVo(dataVO);

		return mainVO;
	}
	
}
