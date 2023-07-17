package com.josam.clink.main;

import java.sql.Date;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MainMapper {
	
	QuoteVO getQuote(int no);
	List<MonthDataVO> getMonthData(String id);
	DataVO getData(String id);
	String getUserNo(String id);
}
