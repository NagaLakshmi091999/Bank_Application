package com.example.BankingApplication.controller;

import java.net.URI;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.BankingApplication.dto.AccountDto;
import com.example.BankingApplication.service.AccountService;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {

	private final AccountService accountService;

	public AccountController(AccountService accountService) {
		this.accountService = accountService;
	}

	@PostMapping
	public ResponseEntity<AccountDto> addAccount(@RequestBody AccountDto accountDto) {
		AccountDto createdAccount = accountService.createAccount(accountDto);

		// Assuming AccountDto has a getId() method to get the account's ID
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(URI.create("/api/accounts/" + createdAccount.getId()));

		return new ResponseEntity<>(createdAccount, headers, HttpStatus.CREATED);
	}
}
