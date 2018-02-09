package com.practice.spring.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.spring.Entity.Cotizacion;

public interface CotizacionDao extends JpaRepository<Cotizacion, String> {

}