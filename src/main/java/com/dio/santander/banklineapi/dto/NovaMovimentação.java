package com.dio.santander.banklineapi.dto;

import com.dio.santander.banklineapi.model.MovimentaçãoTipo;

public class NovaMovimentação {
	private String descrição;
	private Double valor;
	private MovimentaçãoTipo tipo;
	private Integer idConta;
	public String getDescrição() {
		return descrição;
	}
	public void setDescrição(String descrição) {
		this.descrição = descrição;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public MovimentaçãoTipo getTipo() {
		return tipo;
	}
	public void setTipo(MovimentaçãoTipo tipo) {
		this.tipo = tipo;
	}
	public Integer getIdConta() {
		return idConta;
	}
	public void setIdConta(Integer idConta) {
		this.idConta = idConta;
	}
	
	
}
