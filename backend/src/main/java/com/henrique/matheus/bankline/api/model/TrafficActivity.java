package com.henrique.matheus.bankline.api.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TrafficActivity {
	private Integer id;
	private LocalDateTime dateTime;
	private String description;
	private BigDecimal value;
	private TypeTrafficActivity type;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public LocalDateTime getDateTime() {
		return dateTime;
	}
	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}
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

	
}
