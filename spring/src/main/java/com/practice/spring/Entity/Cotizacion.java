package com.practice.spring.Entity;

import java.util.Date;
import java.util.Map;

public class Cotizacion {
	private String base;
	private Date date;
	private Map<String, Double> tasa;
	
	public Cotizacion(String base, Date date, Map<String, Double> tasa) {
		super();
		this.base = base;
		this.date = date;
		this.tasa = tasa;
	}

	public Cotizacion(){}
	
	public String getBase() {
		return base;
	}
	public void setBase(String base) {
		this.base = base;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

	public Map<String, Double> getTasa() {
		return tasa;
	}

	public void setTasa(Map<String, Double> tasa) {
		this.tasa = tasa;
	}
	
}
