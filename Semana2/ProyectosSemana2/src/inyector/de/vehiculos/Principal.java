package inyector.de.vehiculos;

public class Principal {

	public static void main(String[] args) {
		
		Piloto max = new Piloto("Verstappen");
		
		InyectorEquipo.inyectaAutoF1(max,Escuderia.REDBULL);
		System.out.println(max.toString());
		max.mostrarMod();
		max.lugarCamp();
		max.velocidadMax();

		System.out.println("------------");
		
		Piloto per = new Piloto("Perez");
		
		InyectorEquipo.inyectaAutoF1(per,Escuderia.REDBULL);
		System.out.println(per.toString());
		per.mostrarMod();
		per.lugarCamp();
		per.velocidadMax();

		
		System.out.println("------------");
		
		Piloto lec = new Piloto("Leclerc");
		
		InyectorEquipo.inyectaAutoF1(lec,Escuderia.FERRARI);
		System.out.println(lec.toString());
		lec.mostrarMod();
		lec.lugarCamp();
		lec.velocidadMax();
		
		System.out.println("------------");
		
		Piloto rus = new Piloto("Rusell");
		
		InyectorEquipo.inyectaAutoF1(rus,Escuderia.MERCEDES);
		System.out.println(rus.toString());
		rus.mostrarMod();
		rus.lugarCamp();
		rus.velocidadMax();
		
		System.out.println("------------");
		
		Piloto oco = new Piloto("Ocon");
		
		InyectorEquipo.inyectaAutoF1(oco,Escuderia.ALPINE);
		System.out.println(oco.toString());
		oco.mostrarMod();
		oco.lugarCamp();
		oco.velocidadMax();
		
		System.out.println("------------");
	}
	
	
}
