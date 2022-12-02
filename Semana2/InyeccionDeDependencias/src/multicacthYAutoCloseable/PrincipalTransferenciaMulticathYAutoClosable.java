package multicacthYAutoCloseable;

import java.util.Scanner;

public class PrincipalTransferenciaMulticathYAutoClosable {
	
	
	
	
	public static void main(String[] args) throws Exception {
		
		double x = 1500;
		double y = 0;
		double sobra =0;
		boolean cuentaBloqueada = true;
		int b=0;
		String cuenta;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese su numero de cuenta de 5 digitos");
		cuenta = entrada.next();
		System.out.println("Usted cuenta con: "+ x +" pesos en su cuenta");
		System.out.println("Ingrese el monto que desea transferir");
		y = entrada.nextDouble();
		if (cuentaBloqueada == true) {
			System.out.println("Su cuenta esta bloqueada, inserte 1 si desea desbloquearla");
			b = entrada.nextInt();
			if (b==1) {
				cuentaBloqueada = false;
			} else {
				cuentaBloqueada =true;
			}
		} else {
			System.out.println("Su cuenta esta desbloqueada");
		}
		
		
		
		try (Transferencia trans1 = new Transferencia(x,y,cuentaBloqueada,cuenta)) {
			sobra = trans1.transferencia();
			System.out.println("Se realizo una tranferencia de: "+ y +" pesos le quedan " + sobra +" pesos en su cuenta.");
		}

		
	
	}

	

	

}
