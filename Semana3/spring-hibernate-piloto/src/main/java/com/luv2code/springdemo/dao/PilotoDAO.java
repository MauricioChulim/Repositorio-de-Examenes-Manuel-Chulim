package com.luv2code.springdemo.dao;

import java.util.List;

import com.luv2code.springdemo.entity.Piloto;

public interface PilotoDAO {

	public List<Piloto> getPilotos();

	public void savePiloto(Piloto theCustomer);

	public Piloto getPiloto(int theId);

	public void deletePiloto(int theId);
	
}
