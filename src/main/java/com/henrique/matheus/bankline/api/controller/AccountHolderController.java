package com.henrique.matheus.bankline.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.henrique.matheus.bankline.api.dto.NewAccountHolder;
import com.henrique.matheus.bankline.api.model.AccountHolder;
import com.henrique.matheus.bankline.api.repository.AccountHolderRepository;
import com.henrique.matheus.bankline.api.service.AccountHolderService;

@RestController
@RequestMapping("/accountHolders")
public class AccountHolderController {
	@Autowired
	private AccountHolderRepository repository;
	
	@Autowired
	private AccountHolderService service;
	
	@GetMapping
	public List<AccountHolder> findAll(){
		return repository.findAll();
	}
	
	@PostMapping
	public void save(@RequestBody NewAccountHolder accountHolder) {
		service.save(accountHolder);
	}
}