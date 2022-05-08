package com.henrique.matheus.bankline.api.dto;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.henrique.matheus.bankline.api.model.TypeMovement;

public class NewMovement {
	private String description;
	private BigDecimal value;
	private TypeMovement type;
	private Long accountId;
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public BigDecimal getValue() {
		return value;
	}
	public void setValue(BigDecimal value) {
		this.value = value;
	}
	public TypeMovement getType() {
		return type;
	}
	public void setType(TypeMovement type) {
		this.type = type;
	}
	public Long getIdAccount() {
		return accountId;
	}
	public void setIdAccount(Long accountId) {
		this.accountId = accountId;
	}
}
