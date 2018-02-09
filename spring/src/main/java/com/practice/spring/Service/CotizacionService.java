package com.practice.spring.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.spring.Dao.CotizacionDao;
import com.practice.spring.Entity.Cotizacion;

@Service
public class CotizacionService {
	
	@Autowired
	private CotizacionDao cotizacionDao;
	
	public List<Cotizacion> getAllCotizaciones(){
		return this.cotizacionDao.findAll();
	}
	
	public Cotizacion getCotizacionById(String id){
		return this.cotizacionDao.findOne(id);
	}
}
