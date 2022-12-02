package inyector.de.vehiculos;

public abstract class AutoF1 {
	
	String modelo;
	int puestoCampeonato;
	double velocidadMaxima;
	
	
	public AutoF1(String modelo, int puestoCampeonato, double velocidadMaxima) {
		super();
		this.modelo = modelo;
		this.puestoCampeonato = puestoCampeonato;
		this.velocidadMaxima = velocidadMaxima;
	}
	
	abstract void mostrarModelo();
	
	abstract void lugarCampeonato();
	
	abstract void maximaVelocidad();
	
}
