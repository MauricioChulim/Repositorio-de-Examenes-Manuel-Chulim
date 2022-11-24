package autos.v2;
import java.util.*;
import java.util.Scanner;

public class Principal {

	static List<AutoUsado> getAutoUsados(){
		/*return List.of(	new PoloComfort(50000,"VW", "HatchBack", 4, 251460.4, "disco", "hidraulica"),
						new Platina(35500,"Nissan", "Sedan", 4, 635784, "tambor", "mecanica"));
		*/
		List<AutoUsado> lista = new ArrayList<>();
		lista.add(new PoloComfort(50000,"VW", "HatchBack", 4, 251460.4, "disco", "hidraulica"));
		lista.add(new Platina(35500,"Nissan", "Sedan", 4, 635784, "tambor", "mecanica"));
		return lista;
		
	}
	
	
	
	public static void main(String[] args) {
		
		double x;
		Scanner entrada = new Scanner(System.in);
		
		List<AutoUsado> listaAutosUsados = getAutoUsados();
		
		for (AutoUsado auto : listaAutosUsados) {
			System.out.println(auto.toString());
			System.out.println(auto.kilometrosRecorridos());
			System.out.println(auto.seguridadComfort());
			System.out.println("Ingrese el cilindraje de su auto");
			x = entrada.nextDouble(); 
			System.out.println("La potencia es de: " + auto.potencia(x) + " CV");
			System.out.println();
		}
	
		
		
	}

}
