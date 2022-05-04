package com.henrique.matheus.bankline.api.dto;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.henrique.matheus.bankline.api.model.TypeTrafficActivity;

public class NewTrafficActivity {
	private String description;
	private BigDecimal value;
	private TypeTrafficActivity type;
	private Long idAccount;
	
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
	public TypeTrafficActivity getType() {
		return type;
	}
	public void setType(TypeTrafficActivity type) {
		this.type = type;
	}
	public Long getIdAccount() {
		return idAccount;
	}
	public void setIdAccount(Long idAccount) {
		this.idAccount = idAccount;
	}
}
