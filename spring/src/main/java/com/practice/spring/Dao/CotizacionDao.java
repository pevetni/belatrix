package com.practice.spring.Dao;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.practice.spring.Entity.Cotizacion;
import com.practice.spring.Entity.Tasa;

@Repository
public class CotizacionDao {
	private static Map<String, Cotizacion> cotizacion;
	
	static{
		cotizacion = new HashMap<String, Cotizacion>(){
			{	
				put("USD", new Cotizacion("USD", new Date(), new HashMap<String, Double>(){{
																						put("EUR", 0.8111);
																						put("AUD", 1.2757);
																						put("BGN", 1.5863);
																						put("BRL", 3.2753);
																						put("CAD", 1.2562);
																						put("CHF", 0.93852);
																						put("CNY", 6.2816);
																						put("CZK", 20.466);
																						put("DKK", 6.0369);
																						put("GBP", 0.72094);
																						put("HKD", 7.8192);
																						put("HRK", 6.0311);
																						put("HUF", 251.97);
																						put("IDR", 13575.0);
																						put("ILS", 3.4853);
																						put("INR", 64.273);
																						put("ISK", 101.39);
																						put("JPY", 109.47);
																						put("KRW", 1086.8);
																						put("MXN", 18.811);
																						put("MYR", 3.915);
																						put("NOK", 7.868);
																						put("NZD", 1.3752);
																						put("PHP", 51.54);
																						put("PLN", 3.3777);
																						put("RON", 3.7671);
																						put("RUB", 57.353);
																						put("SEK", 8.0043);
																						put("SGD", 1.3232);
																						put("THB", 31.585);
																						put("TRY", 3.7835);
																						put("ZAR", 12.063);																						
																					}}));
			}
		};
	}
	
	public Collection<Cotizacion> getAllCotizaciones(){
		return this.cotizacion.values();
	}
	
	public Cotizacion getCotizacionById(String id){
		return this.cotizacion.get(id);
	}
}
