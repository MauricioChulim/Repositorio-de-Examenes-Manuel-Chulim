package inyector.de.vehiculos;

public class Mercedes extends AutoF1 {

	public Mercedes(String modelo, int puestoCampeonato, double velocidadMaxima) {
		super(modelo, puestoCampeonato, velocidadMaxima);
	}

	@Override
	void mostrarModelo() {
		System.out.println("Este piloto usa un auto Mercedes modelo: " + modelo);
		
	}

	@Override
	void lugarCampeonato() {
		if (puestoCampeonato == 1) System.out.println("El equipo Mercedes gano el primer lugar del campeonato");
		if (puestoCampeonato == 2) System.out.println("El equipo Mercedes gano el segundo lugar del campeonato");
		if (puestoCampeonato == 3) System.out.println("El equipo Mercedes gano el tercer lugar del campeonato");
		if (puestoCampeonato == 4) System.out.println("El equipo Mercedes gano el cuarto lugar del campeonato");
	}

	@Override
	void maximaVelocidad() {
		System.out.println("La velocidad maxima del auto Mercedes en km/es de: " + velocidadMaxima);
		System.out.println("en mph es: "  + Math.round((velocidadMaxima/1.60934)));
		
	}

}
