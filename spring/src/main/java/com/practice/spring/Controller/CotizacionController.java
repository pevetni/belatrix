package com.practice.spring.Controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.practice.spring.Entity.Cotizacion;
import com.practice.spring.Service.CotizacionService;
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/cotizaciones")
public class CotizacionController {
	
	@Autowired
	private CotizacionService cotizacionService;
	
	@RequestMapping(value = "/{id}",method = RequestMethod.GET)
	public Cotizacion getAllCotizacionByBase(@PathVariable("id") String id){
		return this.cotizacionService.getCotizacionByBase(id);
	}
	
	@RequestMapping(value = "/{id}/{symbol}", method = RequestMethod.GET)
	public Cotizacion getCotizacionBySymbol(@PathVariable("id") String id, @PathVariable("symbol") String symbol){
		Map<String, Double> tasa = new HashMap<String, Double>();
		Cotizacion cot = this.cotizacionService.getCotizacionById(id);
		tasa.put(symbol, cot.getTasa().get(symbol));
		cot.setTasa(tasa);
		return cot;
	}
}
