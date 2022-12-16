package com.luv2code.springboot.cruddemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springboot.cruddemo.dao.PilotoDAO;
import com.luv2code.springboot.cruddemo.entity.Piloto;

@Service
public class PilotoServiceImpl implements PilotoService {

	
	private PilotoDAO pilotoDAO;
	
	@Autowired
	public PilotoServiceImpl(@Qualifier("pilotoDAOJdbcImpl") PilotoDAO thePilotoDAO) {
		pilotoDAO = thePilotoDAO;
	}
	
	@Override
	@Transactional
	public List<Piloto> findAll() {
		return pilotoDAO.findAll();
	}

	@Override
	@Transactional
	public Piloto findById(int theId) {
		return pilotoDAO.findById(theId);
	}

	@Override
	@Transactional
	public void save(Piloto thePiloto) {
		pilotoDAO.save(thePiloto);
	}

	@Override
	@Transactional
	public void deleteById(int theId) {
		pilotoDAO.deleteById(theId);
	}

}






