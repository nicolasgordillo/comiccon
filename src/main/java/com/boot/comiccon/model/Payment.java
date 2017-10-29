package com.boot.comiccon.model;

import java.time.LocalDate;

public class Payment {
	Long id;
	LocalDate date;
	Float amount;
	Integer installments;
	
	public Payment() { }

	public Payment(Long id, LocalDate date, Float amount, Integer installments) {
		this.id = id;
		this.date = date;
		this.amount = amount;
		this.installments = installments;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Float getAmount() {
		return amount;
	}

	public void setAmount(Float amount) {
		this.amount = amount;
	}

	public Integer getInstallments() {
		return installments;
	}

	public void setCondition(Integer installments) {
		this.installments = installments;
	}
}
