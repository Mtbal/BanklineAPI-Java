package com.dio.santander.banklineapi.model;

import java.time.LocalDateTime;

public class Movimentação {
	private Integer id;
	private LocalDateTime datahora;
	private String descrição;
	private Double valor;
	private MovimentaçãoTipo tipo;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public LocalDateTime getDatahora() {
		return datahora;
	}
	public void setDatahora(LocalDateTime datahora) {
		this.datahora = datahora;
	}
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
	
}
