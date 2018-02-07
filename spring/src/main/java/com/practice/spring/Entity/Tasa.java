package com.practice.spring.Entity;

public class Tasa {
	private String moneda;
	private Double valor;	
	
	public Tasa(String moneda, Double valor) {
		super();
		this.moneda = moneda;
		this.valor = valor;
	}
	
	public Tasa(){}

	public String getMoneda() {
		return moneda;
	}

	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}	
}
