package com.henrique.matheus.bankline.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.henrique.matheus.bankline.api.model.BankAccount;

public interface BankAccountRepository extends JpaRepository<BankAccount, Long> {

}
