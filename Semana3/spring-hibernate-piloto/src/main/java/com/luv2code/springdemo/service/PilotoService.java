package com.luv2code.springdemo.service;

import java.util.List;

import com.luv2code.springdemo.entity.Piloto;

public interface PilotoService {

	public List<Piloto> getPilotos();

	public void savePiloto(Piloto theCustomer);

	public Piloto getPiloto(int theId);

	public void deletePiloto(int theId);
	
}
