package com.henrique.matheus.bankline.api.service;


import java.math.BigDecimal;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.henrique.matheus.bankline.api.dto.NewBankAccount;
import com.henrique.matheus.bankline.api.model.Account;
import com.henrique.matheus.bankline.api.model.BankAccount;
import com.henrique.matheus.bankline.api.repository.BankAccountRepository;

@Service
public class BankAccountService {
	@Autowired
	private BankAccountRepository repository;
	
	public void save(NewBankAccount newBankAccount) {
		BankAccount bankAccount = new BankAccount();
		bankAccount.setCpf(newBankAccount.getCpf());
		bankAccount.setName(newBankAccount.getName());
		
		Account account = new Account();
		account.setBalance(BigDecimal.ZERO);
		account.setNumber(new Date().getTime());
		
		bankAccount.setAccount(account);
	}
}
