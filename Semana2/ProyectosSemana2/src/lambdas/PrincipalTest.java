package lambdas;

import java.util.*;
import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class PrincipalTest {

	static void mostrarPilotoString(List<Piloto> lista, Predicate<Piloto> p ) {
		for(Piloto piloto :lista) {
			if (p.test(piloto))
				System.out.println(piloto);
		}		
	}
	
	static void mostrarPilotoInt(List<Piloto> lista, IntPredicate edads ) {
		for(Piloto piloto :lista) {
			if (edads.test(piloto.getEdad()))
				System.out.println(piloto);
		}
	}
	
	static void mostrarPilotoDouble(List<Piloto> lista, DoublePredicate sueldo ) {
		for(Piloto piloto :lista) {
			if (sueldo.test(piloto.getSalario()))
				System.out.println(piloto);
		}
	}
	
	public static void main(String[] args) {

		List<Piloto> listaPilotos = new ArrayList<>();
		listaPilotos.add(new Piloto("Perez", 32, 16, "Red Bull", "mexicano",3));
		listaPilotos.add(new Piloto("Verstappen", 25, 65, "Red Bull", "neerlandes",1));
		listaPilotos.add(new Piloto("Leclerc", 25, 11, "Ferrari", "italiano",2));
		listaPilotos.add(new Piloto("Rusell", 24, 5, "Mercedes", "britanico",4));
		
		System.out.println("----------PILOTOS DE REB BULL----------");		
		mostrarPilotoString(listaPilotos, pil -> pil.getEscuderia() == "Red Bull");
		System.out.println();
		
		System.out.println("----------PILOTOS EUROPEOS----------");		
		mostrarPilotoString(listaPilotos, pil -> (pil.getNacionalidad() == "neerlandes" || pil.getNacionalidad() == "italiano" ||pil.getNacionalidad() == "britanico"));
		System.out.println();
		
		System.out.println("----------PILOTOS MAYORES DE 30 AÑOS----------");		
		mostrarPilotoInt(listaPilotos, pil -> pil > 30 );
		System.out.println();
		
		System.out.println("----------PILOTOS QUE GANAN MAS DE 10 MILLONES DE EUROS----------");		
		mostrarPilotoDouble(listaPilotos, pil -> pil > 10.0 );

		
	}
	


}