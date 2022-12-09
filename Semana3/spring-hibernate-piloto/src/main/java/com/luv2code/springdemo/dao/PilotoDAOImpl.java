package com.luv2code.springdemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luv2code.springdemo.entity.Piloto;

@Repository
public class PilotoDAOImpl implements PilotoDAO {

	// need to inject the session factory
	@Autowired
	private SessionFactory sessionFactory;
			
	@Override
	public List<Piloto> getPilotos() {
		
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
				
		// create a query  ... sort by last name
		Query<Piloto> theQuery = 
				currentSession.createQuery("from Piloto order by apPaterno",
											Piloto.class);
		
		// execute query and get result list
		List<Piloto> pilotos = theQuery.getResultList();
				
		// return the results		
		return pilotos;
	}

	@Override
	public void savePiloto(Piloto thePiloto) {

		// get current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// save/upate the customer ... finally LOL
		currentSession.saveOrUpdate(thePiloto);
		
	}

	@Override
	public Piloto getPiloto(int theId) {

		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// now retrieve/read from database using the primary key
		Piloto thePiloto = currentSession.get(Piloto.class, theId);
		
		return thePiloto;
	}

	@Override
	public void deletePiloto(int theId) {

		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// delete object with primary key
		Query theQuery = 
				currentSession.createQuery("delete from Piloto where id=:pilotoId");
		theQuery.setParameter("pilotoId", theId);
		
		theQuery.executeUpdate();		
	}

}











