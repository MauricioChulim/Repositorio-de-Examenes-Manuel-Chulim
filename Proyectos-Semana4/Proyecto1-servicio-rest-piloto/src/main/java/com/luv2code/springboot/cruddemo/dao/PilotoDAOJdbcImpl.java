package com.luv2code.springboot.cruddemo.dao;

import java.sql.*;
import java.util.*;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luv2code.springboot.cruddemo.entity.Piloto;

@Repository
public class PilotoDAOJdbcImpl implements PilotoDAO {

	@Autowired
	DataSource dataSource;

	@Override
	public List<Piloto> findAll() {
		System.out.println("Implementación DAO con JDBC findAll(): " + dataSource);

		List<Piloto> listaPilotos = new ArrayList<>();

		String sql = "select * from piloto";

		try (Connection myConn = dataSource.getConnection();
			Statement myStmt = myConn.createStatement();
			ResultSet myRs = myStmt.executeQuery(sql);) {

			// process result set
			while (myRs.next()) {

				// retrieve data from result set row
				int id = myRs.getInt("id");
				String nombre = myRs.getString("nombre");
				String apellidoPaterno = myRs.getString("apellido_paterno");
				String apellidoMaterno = myRs.getString("apellido_materno");
				String escuderia = myRs.getString("escuderia");
				String correo = myRs.getString("correo");

				// create new student object
				Piloto tempPiloto = new Piloto(id, nombre, apellidoPaterno, apellidoMaterno, escuderia, correo);

				// add it to the list of students
				listaPilotos.add(tempPiloto);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return listaPilotos;
	}

	@Override
	public Piloto findById(int theId) {
		
		System.out.println("Implementación DAO con JDBC findById(): ");
		Piloto thePiloto = null;

		try (Connection myConn = dataSource.getConnection();
			PreparedStatement myStmt = createPreparedStatement(myConn, theId);
			ResultSet myRs = myStmt.executeQuery();) {

			// retrieve data from result set row
			if (myRs.next()) {
				String nombre = myRs.getString("nombre");
				String apellidoPaterno = myRs.getString("apellido_paterno");
				String apellidoMaterno = myRs.getString("apellido_materno");
				String escuderia = myRs.getString("escuderia");
				String correo = myRs.getString("correo");

				// use the studentId during construction
				thePiloto = new Piloto(theId, nombre, apellidoPaterno, apellidoMaterno, escuderia, correo);
			} else {
				throw new SQLException("Could not find piloto id: " + theId);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return thePiloto;
	}

	private PreparedStatement createPreparedStatement(Connection con, int pilotoId) throws SQLException {
		String sql = "select * from piloto where id=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, pilotoId);
		return ps;
	}

	@Override
	public void save(Piloto thePiloto) {
		String sql = "";

		if (thePiloto.getId() == 0)
			sql = "insert into piloto (nombre, apellido_paterno, apellido_materno, escuderia, correo) values (?, ?, ?, ?, ?)";
		else
			sql = "update piloto set nombre=?, apellido_paterno=?, apellido_materno=?, escuderia=?, correo=? where id=?";

		try (Connection myConn = dataSource.getConnection();
			 PreparedStatement myStmt = myConn.prepareStatement(sql)) {
			
			myStmt.setString(1, thePiloto.getNombre());
			myStmt.setString(2, thePiloto.getApellidoPaterno());
			myStmt.setString(3, thePiloto.getApellidoMaterno());
			myStmt.setString(4, thePiloto.getEscuderia());
			myStmt.setString(5, thePiloto.getCorreo());
			

			if (thePiloto.getId() != 0)
				myStmt.setInt(6, thePiloto.getId());

			myStmt.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void deleteById(int theId) {
		
		try (Connection myConn = dataSource.getConnection(); 
			 PreparedStatement myStmt = myConn.prepareStatement("delete from piloto where id=?")) {
			
			myStmt.setInt(1, theId);
			myStmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
