package com.luv2code.springdemo.model;

public class Piloto {

	private int id;
	private String nombre;
	private String apellidoPaterno;
	private String apellidoMaterno;	
	private String escuderia;
	private String correo;
	
	public Piloto() {
	}

	public Piloto(String nombre, String apellidoPaterno, String apellidoMaterno, String escuderia, String correo) {
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.escuderia = escuderia;
		this.correo = correo;
	}

	public Piloto(int id, String nombre,String apellidoPaterno, String apellidoMaterno, String escuderia, String correo) {
		this.id = id;
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.escuderia = escuderia;
		this.correo = correo;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}


	public String getEscuderia() {
		return escuderia;
	}

	public void setEscuderia(String escuderia) {
		this.escuderia = escuderia;
	}
	
	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	@Override
	public String toString() {
		return "Piloto [id=" + id + ", Apellido paterno=" + apellidoPaterno + ", apellido materno=" + apellidoMaterno + ", escuderia="+ escuderia + ", correo=" + correo + "]";
	}
		
}











