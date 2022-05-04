package com.henrique.matheus.bankline.api.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Account {
	@Column(name = "account_number")
	private Long number;
	
	@Column(name = "account_balance")
	private BigDecimal balance;
	
	
	public Long getNumber() {
		return number;
	}
	public void setNumber(Long number) {
		this.number = number;
	}
	public BigDecimal getBalance() {
		return balance;
	}
	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}
	
	
	
}
