package com.example.BankingApplication.service;

import java.util.List;

import com.example.BankingApplication.dto.AccountDto;

public interface AccountService {

	AccountDto createAccount(AccountDto account);
	
	AccountDto getAccountById(Long id);
	
	AccountDto deposit(Long id, double amount);
	
	AccountDto withDraw(Long id, double amount);
	
	List<AccountDto> getAllAccounts();

}
