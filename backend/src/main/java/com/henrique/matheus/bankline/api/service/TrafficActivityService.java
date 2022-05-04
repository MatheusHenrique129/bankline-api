package com.henrique.matheus.bankline.api.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.henrique.matheus.bankline.api.dto.NewTrafficActivity;
import com.henrique.matheus.bankline.api.model.BankAccount;
import com.henrique.matheus.bankline.api.model.TrafficActivity;
import com.henrique.matheus.bankline.api.model.TypeTrafficActivity;
import com.henrique.matheus.bankline.api.repository.BankAccountRepository;
import com.henrique.matheus.bankline.api.repository.TrafficActivityRepository;

@Service
public class TrafficActivityService {
	@Autowired
	private TrafficActivityRepository repository;
	
	@Autowired
	private BankAccountRepository bankAccountRepository;
	
	public void save(NewTrafficActivity newTrafficActivity) {
		BigDecimal trafficActivityGetValue = newTrafficActivity.getValue();
		TypeTrafficActivity trafficActivityGetType = newTrafficActivity.getType();
		
		TrafficActivity trafficActivity = new TrafficActivity();
		
		BigDecimal value = trafficActivityGetType == TypeTrafficActivity.REVENUE ? trafficActivityGetValue: trafficActivityGetValue.multiply(new BigDecimal(-1));
		
		trafficActivity.setDateTime(LocalDateTime.now());
		trafficActivity.setDescription(newTrafficActivity.getDescription());
		trafficActivity.setIdAccount(newTrafficActivity.getIdAccount());
		trafficActivity.setType(newTrafficActivity.getType());
		trafficActivity.setValue(value);
		
		BankAccount bankAccount = bankAccountRepository.findById(trafficActivity.getIdAccount()).orElse(null);
		
		if(bankAccount != null) {
			bankAccount.getAccount().setBalance(bankAccount.getAccount().getBalance().add(value));
			bankAccountRepository.save(bankAccount);
		}
		
		repository.save(trafficActivity);
	}
}
