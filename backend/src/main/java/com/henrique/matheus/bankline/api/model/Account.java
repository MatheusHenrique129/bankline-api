package com.henrique.matheus.bankline.api.model;

import java.math.BigDecimal;

public class Account {
	private Long number;
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
