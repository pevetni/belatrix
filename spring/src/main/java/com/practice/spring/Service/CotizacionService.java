package com.practice.spring.Service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.spring.Dao.CotizacionDao;
import com.practice.spring.Entity.Cotizacion;

@Service
public class CotizacionService {
	
	@Autowired
	private CotizacionDao cotizacionDao;
	
	public Collection<Cotizacion> getAllCotizaciones(){
		return this.cotizacionDao.getAllCotizaciones();
	}
	
	public Cotizacion getCotizacionById(String id){
		return this.cotizacionDao.getCotizacionById(id);
	}
}
