package inyector.de.vehiculos;

public class InyectorEquipo {
	
	static RedBull rb18 = new RedBull("RB-18", 1, 335.1);
	static Ferrari f175 = new Ferrari("F1-75", 2, 335.1);
	static Mercedes w13 = new Mercedes("W13 E-Performance", 3, 352.0);
	static Alpine a522 = new Alpine("A522", 4, 342.0);
	

	static void inyectaAutoF1(Piloto p, Escuderia escuderia) {
		switch(escuderia) {
		case REDBULL: p.setAuto(rb18);
			break;
		case FERRARI: p.setAuto(f175);
			break;
		case MERCEDES: p.setAuto(w13);
			break;
		default: p.setAuto(a522);
			break;
		}
	}
	
	
}
