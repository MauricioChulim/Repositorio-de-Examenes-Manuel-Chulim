package com.luv2code.web.jdbc;

public class Piloto {

	private int id;
	private String apPaterno;
	private String apMaterno;
	private String correo;

	public Piloto(String apPaterno, String apMaterno, String correo) {
		this.apPaterno = apPaterno;
		this.apMaterno = apMaterno;
		this.correo = correo;
	}

	public Piloto(int id, String apPaterno, String apMaterno, String correo) {
		this.id = id;
		this.apPaterno = apPaterno;
		this.apMaterno = apMaterno;
		this.correo = correo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getApPaterno() {
		return apPaterno;
	}

	public void setApPaterno(String apPaterno) {
		this.apPaterno = apPaterno;
	}

	public String getApMaterno() {
		return apMaterno;
	}

	public void setApMaterno(String apMaterno) {
		this.apMaterno = apMaterno;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	
	
	
	@Override
	public String toString() {
		return "Piloto [id=" + id + ", apPaterno=" + apPaterno + ", apMaterno=" + apMaterno + ", Correo=" + correo
				+ "]";
	}	
}
