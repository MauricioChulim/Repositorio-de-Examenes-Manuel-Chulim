package com.luv2code.springboot.cruddemo.service;

import java.util.List;

import com.luv2code.springboot.cruddemo.entity.Piloto;

public interface PilotoService {

	public List<Piloto> findAll();
	
	public Piloto findById(int theId);
	
	public void save(Piloto thePiloto);
	
	public void deleteById(int theId);
	
}
