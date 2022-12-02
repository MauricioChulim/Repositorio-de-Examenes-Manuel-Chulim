package lambdas;

import java.util.*;
import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class PrincipalSinTest {

	static void mostrarPiloto(List<Piloto> lista, PredicadoPiloto pil ) {
		for(Piloto piloto :lista) {
			if (pil.probar(piloto))
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
		mostrarPiloto(listaPilotos, pil -> pil.getEscuderia() == "Red Bull");
		System.out.println();
		
		System.out.println("----------PILOTOS EUROPEOS----------");		
		mostrarPiloto(listaPilotos, pil -> (pil.getNacionalidad() == "neerlandes" || pil.getNacionalidad() == "italiano" ||pil.getNacionalidad() == "britanico"));
		System.out.println();
		
		System.out.println("----------PILOTOS MAYORES DE 30 AÑOS----------");		
		mostrarPiloto(listaPilotos, pil -> pil.getEdad() > 30 );
		System.out.println();
		
		System.out.println("----------PILOTOS QUE GANAN MAS DE 10 MILLONES DE EUROS----------");		
		mostrarPiloto(listaPilotos, pil -> pil.getSalario() > 10.0 );

		
	}
	


}