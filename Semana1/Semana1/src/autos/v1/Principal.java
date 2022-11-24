package autos.v1;

public class Principal {

	public static void main(String[] args) {
		
		PoloComfort pol1 = new PoloComfort(50000,"VW", "HatchBack", 4, 251460.4, "disco", "hidraulica");
		System.out.println(pol1.toString());
		System.out.println(pol1.kilometrosRecorridos());
		System.out.println("La potencia es de: " + pol1.potencia(1.6) + " CV");
		System.out.println(pol1.seguridadComfort());

		System.out.println();
		
		Platina pla1 = new Platina(35500,"Nissan", "Sedan", 4, 635784, "tambor", "mecanica");
		System.out.println(pla1.toString());
		System.out.println(pla1.kilometrosRecorridos());
		System.out.println("La potencia es de: " + pla1.potencia(2.0) + " CV");
		System.out.println(pla1.seguridadComfort());
		
		
		
		
	}

}
