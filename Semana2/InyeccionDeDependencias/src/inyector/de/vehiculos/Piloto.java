package inyector.de.vehiculos;

public class Piloto {
	
	
	String piloto;
	AutoF1 auto;
	
	
	public Piloto(String piloto) {
		super();
		this.piloto = piloto;
	}


	public AutoF1 getAuto() {
		return auto;
	}


	public void setAuto(AutoF1 auto) {
		this.auto = auto;
	}
	
	
	void mostrarMod() {
		auto.mostrarModelo();
	}
	
	void lugarCamp() {
		auto.lugarCampeonato();
	}
	
	void velocidadMax() {
		auto.maximaVelocidad();
	}


	@Override
	public String toString() {
		return "Piloto: " + piloto + ".";
	}
	
	

}
