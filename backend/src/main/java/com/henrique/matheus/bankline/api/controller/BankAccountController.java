package com.henrique.matheus.bankline.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.henrique.matheus.bankline.api.dto.NewBankAccount;
import com.henrique.matheus.bankline.api.model.BankAccount;
import com.henrique.matheus.bankline.api.repository.BankAccountRepository;
import com.henrique.matheus.bankline.api.service.BankAccountService;

@RestController
@RequestMapping("/bank-accounts")
public class BankAccountController {
	@Autowired
	private BankAccountRepository repository;
	
	@Autowired
	private BankAccountService service;
	
	@GetMapping
	public List<BankAccount> findAll(){
		return repository.findAll();
	}
	
	@PostMapping
	public void save(@RequestBody NewBankAccount bankAccount) {
		service.save(bankAccount);
	}
}
