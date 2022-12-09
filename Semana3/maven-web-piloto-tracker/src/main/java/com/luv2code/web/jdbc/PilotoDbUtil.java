package com.luv2code.web.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

public class PilotoDbUtil {

	private DataSource dataSource;

	public PilotoDbUtil(DataSource theDataSource) {
		dataSource = theDataSource;
	}
	
	public List<Piloto> getPilotos() throws Exception {
		
		List<Piloto> pilotos = new ArrayList<>();
		
		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;
		
		try {
			// get a connection
			myConn = dataSource.getConnection();
			
			// create sql statement
			String sql = "select * from pilotos order by Apellido_paterno";
			
			myStmt = myConn.createStatement();
			
			// execute query
			myRs = myStmt.executeQuery(sql);
			
			// process result set
			while (myRs.next()) {
				
				// retrieve data from result set row
				int id = myRs.getInt("id");
				String apPaterno = myRs.getString("Apellido_paterno");
				String apMaterno = myRs.getString("Apellido_materno");
				String Correo = myRs.getString("Correo");
				
				// create new student object
				Piloto tempPiloto = new Piloto(id, apPaterno, apMaterno, Correo);
				
				// add it to the list of students
				pilotos.add(tempPiloto);				
			}
			
			return pilotos;		
		}
		finally {
			// close JDBC objects
			close(myConn, myStmt, myRs);
		}		
	}

	private void close(Connection myConn, Statement myStmt, ResultSet myRs) {

		try {
			if (myRs != null) {
				myRs.close();
			}
			
			if (myStmt != null) {
				myStmt.close();
			}
			
			if (myConn != null) {
				myConn.close();   // doesn't really close it ... just puts back in connection pool
			}
		}
		catch (Exception exc) {
			exc.printStackTrace();
		}
	}

	public void addPiloto(Piloto theStudent) throws Exception {

		Connection myConn = null;
		PreparedStatement myStmt = null;
		
		try {
			// get db connection
			myConn = dataSource.getConnection();
			
			// create sql for insert
			String sql = "insert into pilotos "
					   + "(Apellido_paterno, Apellido_materno, Correo) "
					   + "values (?, ?, ?)";
			
			myStmt = myConn.prepareStatement(sql);
			
			// set the param values for the student
			myStmt.setString(1, theStudent.getApPaterno());
			myStmt.setString(2, theStudent.getApMaterno());
			myStmt.setString(3, theStudent.getCorreo());
			
			// execute sql insert
			myStmt.execute();
		}
		finally {
			// clean up JDBC objects
			close(myConn, myStmt, null);
		}
	}

	public Piloto getPiloto(String thePilotoId) throws Exception {

		Piloto thePiloto = null;
		
		Connection myConn = null;
		PreparedStatement myStmt = null;
		ResultSet myRs = null;
		int pilotoId;
		
		try {
			// convert student id to int
			pilotoId = Integer.parseInt(thePilotoId);
			
			// get connection to database
			myConn = dataSource.getConnection();
			
			// create sql to get selected student
			String sql = "select * from pilotos where id=?";
			
			// create prepared statement
			myStmt = myConn.prepareStatement(sql);
			
			// set params
			myStmt.setInt(1, pilotoId);
			
			// execute statement
			myRs = myStmt.executeQuery();
			
			// retrieve data from result set row
			if (myRs.next()) {
				String apPater = myRs.getString("Apellido_paterno");
				String apMater = myRs.getString("Apellido_materno");
				String Correo = myRs.getString("Correo");
				
				// use the studentId during construction
				thePiloto = new Piloto(pilotoId, apPater, apMater, Correo);
			}
			else {
				throw new Exception("Could not find pilotos id: " + pilotoId);
			}				
			
			return thePiloto;
		}
		finally {
			// clean up JDBC objects
			close(myConn, myStmt, myRs);
		}
	}

	public void updatePiloto(Piloto thePiloto) throws Exception {
		
		Connection myConn = null;
		PreparedStatement myStmt = null;

		try {
			// get db connection
			myConn = dataSource.getConnection();
			
			// create SQL update statement
			String sql = "update pilotos "
						+ "set Apellido_paterno=?, Apellido_materno=?, Correo=? "
						+ "where id=?";
			
			// prepare statement
			myStmt = myConn.prepareStatement(sql);
			
			// set params
			myStmt.setString(1, thePiloto.getApPaterno());
			myStmt.setString(2, thePiloto.getApMaterno());
			myStmt.setString(3, thePiloto.getCorreo());
			myStmt.setInt(4, thePiloto.getId());
			
			// execute SQL statement
			myStmt.execute();
		}
		finally {
			// clean up JDBC objects
			close(myConn, myStmt, null);
		}
	}

	public void deletePiloto(String thePilotoId) throws Exception {

		Connection myConn = null;
		PreparedStatement myStmt = null;
		
		try {
			// convert student id to int
			int pilotoId = Integer.parseInt(thePilotoId);
			
			// get connection to database
			myConn = dataSource.getConnection();
			
			// create sql to delete student
			String sql = "delete from pilotos where id=?";
			
			// prepare statement
			myStmt = myConn.prepareStatement(sql);
			
			// set params
			myStmt.setInt(1, pilotoId);
			
			// execute sql statement
			myStmt.execute();
		}
		finally {
			// clean up JDBC code
			close(myConn, myStmt, null);
		}	
	}
}















