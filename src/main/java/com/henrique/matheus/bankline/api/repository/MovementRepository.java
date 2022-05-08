package com.henrique.matheus.bankline.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.henrique.matheus.bankline.api.model.Movement;

public interface MovementRepository extends JpaRepository<Movement, Long>{

	public List<Movement>findByAccountId(Long accountId);
}