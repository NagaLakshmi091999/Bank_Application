package com.example.BankingApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.BankingApplication.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long>{

}
