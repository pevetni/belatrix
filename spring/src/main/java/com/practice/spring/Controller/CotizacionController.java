package com.practice.spring.Controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.practice.spring.Entity.Cotizacion;
import com.practice.spring.Service.CotizacionService;

@RestController
@RequestMapping("/cotizaciones")
public class CotizacionController {
	
	@Autowired
	private CotizacionService cotizacionService;
	
	@RequestMapping(method = RequestMethod.GET)
	public Collection<Cotizacion> getAllCotizaciones(){
		return this.cotizacionService.getAllCotizaciones();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Cotizacion getCotizacionById(@PathVariable("id") String id){
		return this.cotizacionService.getCotizacionById(id);
	}
}
