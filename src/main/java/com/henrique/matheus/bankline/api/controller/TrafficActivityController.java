package com.henrique.matheus.bankline.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.henrique.matheus.bankline.api.dto.NewBankAccount;
import com.henrique.matheus.bankline.api.dto.NewTrafficActivity;
import com.henrique.matheus.bankline.api.model.BankAccount;
import com.henrique.matheus.bankline.api.model.TrafficActivity;
import com.henrique.matheus.bankline.api.repository.BankAccountRepository;
import com.henrique.matheus.bankline.api.repository.TrafficActivityRepository;
import com.henrique.matheus.bankline.api.service.BankAccountService;
import com.henrique.matheus.bankline.api.service.TrafficActivityService;

@RestController
@RequestMapping("/traffic-activity")
public class TrafficActivityController {
	@Autowired
	private TrafficActivityRepository repository;
	
	@Autowired
	private TrafficActivityService service;
	
	@GetMapping
	public List<TrafficActivity> findAll(){
		return repository.findAll();
	}
	
	@PostMapping
	public void save(@RequestBody NewTrafficActivity trafficActivity) {
		service.save(trafficActivity);
	}
}
