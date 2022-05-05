package com.dio.santander.banklineapi.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Conta {
	@Column(name = "conta_número")
	private Long número;
	
	@Column(name = "conta_saldo")
	private Double saldo;
	public Long getNumero() {
		return número;
	}
	public void setNumero(Long número) {
		this.número = número;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
}
