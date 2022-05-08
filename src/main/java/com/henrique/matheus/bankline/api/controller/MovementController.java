package com.henrique.matheus.bankline.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.henrique.matheus.bankline.api.dto.NewAccountHolder;
import com.henrique.matheus.bankline.api.dto.NewMovement;
import com.henrique.matheus.bankline.api.model.AccountHolder;
import com.henrique.matheus.bankline.api.model.Movement;
import com.henrique.matheus.bankline.api.repository.AccountHolderRepository;
import com.henrique.matheus.bankline.api.repository.MovementRepository;
import com.henrique.matheus.bankline.api.service.AccountHolderService;
import com.henrique.matheus.bankline.api.service.MovementService;

@RestController
@RequestMapping("/movements")
public class MovementController {
	@Autowired
	private MovementRepository repository;
	
	@Autowired
	private MovementService service;
	
	@GetMapping
	public List<Movement> findAll(){
		return repository.findAll();
	}
	
	@GetMapping("/{accountId}")
	public List<Movement> findAll(@PathVariable("accountId") Long accountId){
		return repository.findByAccountId(accountId);
	}
	
	@PostMapping
	public void save(@RequestBody NewMovement movement) {
		service.save(movement);
	}
}
