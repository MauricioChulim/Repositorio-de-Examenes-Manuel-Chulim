package com.luv2code.springboot.cruddemo.dao;

import java.util.List;
import com.luv2code.springboot.cruddemo.entity.Piloto;

public interface PilotoDAO {

	List<Piloto> findAll();
	
	Piloto findById(int theId);
	
	void save(Piloto thePiloto);
	
	void deleteById(int theId);
	
}
