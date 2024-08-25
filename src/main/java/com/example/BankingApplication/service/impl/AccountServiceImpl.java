package com.example.BankingApplication.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.BankingApplication.dto.AccountDto;
import com.example.BankingApplication.entity.Account;
import com.example.BankingApplication.mapper.AccountMapper;
import com.example.BankingApplication.repository.AccountRepository;
import com.example.BankingApplication.service.AccountService;
@Service
public class AccountServiceImpl implements AccountService{
	
	@Autowired
	private AccountRepository accountRepository;

	@Override
	public AccountDto createAccount(AccountDto accountDto) {
		Account account = AccountMapper.mapToAccount(accountDto);
		Account savedAccount = accountRepository.save(account);
		return AccountMapper.mapToAccountDto(savedAccount);
	
	}

}
