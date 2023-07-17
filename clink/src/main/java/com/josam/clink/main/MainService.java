package com.josam.clink.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;
import java.util.Map;

@Service
public class MainService {
	
	@Autowired
	MainMapper mainMapper;

	public QuoteVO getQuote(int no) {
		return mainMapper.getQuote(no);
	}

	public List<MonthDataVO> getMonthData(String id) {
		List<MonthDataVO> vo = mainMapper.getMonthData(id);
		return vo;
	}

	public DataVO getData(String id) {
		DataVO dvo = mainMapper.getData(id);
		dvo.setYesterday(dvo.getChallenge()- dvo.getSum());
		return dvo;
	}
	
	public String getUserNo(String id) {
		return mainMapper.getUserNo(id);
	}
}
