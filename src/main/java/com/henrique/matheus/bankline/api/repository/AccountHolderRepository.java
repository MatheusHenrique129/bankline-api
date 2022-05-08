package com.henrique.matheus.bankline.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.henrique.matheus.bankline.api.model.AccountHolder;

public interface AccountHolderRepository extends JpaRepository<AccountHolder, Long> {

}