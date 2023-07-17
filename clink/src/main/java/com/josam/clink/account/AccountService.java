package com.josam.clink.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class AccountService {
	@Autowired
	AccountMapper accountMapper;
	
	public int registAccount(AccountVO vo) {
		return accountMapper.registAccount(vo);
	}

}
