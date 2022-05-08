package com.henrique.matheus.bankline.api.service;


import java.math.BigDecimal;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.henrique.matheus.bankline.api.dto.NewAccountHolder;
import com.henrique.matheus.bankline.api.model.Account;
import com.henrique.matheus.bankline.api.model.AccountHolder;
import com.henrique.matheus.bankline.api.repository.AccountHolderRepository;

@Service
public class AccountHolderService {
	@Autowired
	private AccountHolderRepository repository;
	
	public void save(NewAccountHolder newAccountHolder) {
		AccountHolder accountHolder = new AccountHolder();
		accountHolder.setCpf(newAccountHolder.getCpf());
		accountHolder.setName(newAccountHolder.getName());
		
		Account account = new Account();
		account.setBalance(BigDecimal.ZERO);
		account.setNumber(new Date().getTime());
		
		accountHolder.setAccount(account);
		repository.save(accountHolder);
	}
}
