package com.henrique.matheus.bankline.api.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.henrique.matheus.bankline.api.dto.NewMovement;
import com.henrique.matheus.bankline.api.model.AccountHolder;
import com.henrique.matheus.bankline.api.model.Movement;
import com.henrique.matheus.bankline.api.model.TypeMovement;
import com.henrique.matheus.bankline.api.repository.AccountHolderRepository;
import com.henrique.matheus.bankline.api.repository.MovementRepository;

@Service
public class MovementService {
	@Autowired
	private MovementRepository repository;
	
	@Autowired
	private AccountHolderRepository accountHolderRepository;	
	public void save(NewMovement newMovement) {
		BigDecimal movementGetValue = newMovement.getValue();
		TypeMovement movementGetType = newMovement.getType();
		
		Movement movement = new Movement();
		
		BigDecimal value = movementGetType == TypeMovement.RECEITA ? movementGetValue: movementGetValue.multiply(new BigDecimal(-1));
		
		movement.setDateTime(LocalDateTime.now());
		movement.setDescription(newMovement.getDescription());
		movement.setAccountId(newMovement.getIdAccount());
		movement.setType(newMovement.getType());
		movement.setValue(value);
		
		AccountHolder accountHolder = accountHolderRepository.findById(movement.getAccountId()).orElse(null);
		if(accountHolder != null) {
			accountHolder.getAccount().setBalance(accountHolder.getAccount().getBalance().add(value));
			accountHolderRepository.save(accountHolder);
		}
		
		repository.save(movement);
	}
}
