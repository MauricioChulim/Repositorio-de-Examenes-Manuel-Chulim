package autos.v4;
import java.util.*;




public class Principal {

	static List<AutoEnVenta> getAutosEnVenta(){
		//return List.of(	new PoloComfort(50000,"VW", "HatchBack", 4, 251460.4, "disco", "hidraulica"),
		//				new Platina(35500,"Nissan", "Sedan", 4, 635784, "tambor", "mecanica"),
		//				new Mustang(250499,"Ford", "Coupe", 6, 123875, "abs", "asistida"));
		
		List<AutoEnVenta> lista = new ArrayList<>();
		lista.add(new PoloComfort(50000,"VW", "HatchBack", 4, 251460.4, "disco", "hidraulica"));
		lista.add(new Platina(35500,"Nissan", "Sedan", 4, 635784, "tambor", "mecanica"));
		lista.add(new Mustang(250499,"Ford", "Coupe", 6, 123875, "abs", "asistida"));
		return lista;
	}
	
	
	
	public static void main(String[] args) {
		
		double x;
		Scanner entrada = new Scanner(System.in);
		
		List<AutoEnVenta> listaAutosUsados = getAutosEnVenta();
		
		for (AutoEnVenta auto : listaAutosUsados) {
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
