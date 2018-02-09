package com.practice.spring.Entity;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.MapKeyClass;

@Entity
public class Cotizacion {
	
	@Id
	private String base;
	private Date date;
	@ElementCollection(targetClass = Double.class)
	@MapKeyClass(String.class)
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
	public String getDate() {
		return new SimpleDateFormat("dd-MM-yyyy").format(date);
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
