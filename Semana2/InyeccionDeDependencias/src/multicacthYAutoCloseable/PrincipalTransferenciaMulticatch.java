package multicacthYAutoCloseable;

import java.util.Scanner;

public class PrincipalTransferenciaMulticatch {
	
	public static void main(String[] args) {
		
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
		
		
		
		
		
		try {
			sobra = transferencia(x,y,cuentaBloqueada,cuenta);
			System.out.println("Se realizo una tranferencia de: "+ y +" pesos le quedan " + sobra +" pesos en su cuenta.");
		}
		catch(FondosInsuficientes| CuentaBloqueada | DatosErroneos  e) {
			e.printStackTrace();
		}
		

	}
	
	
	static double transferencia(double x, double y, boolean cuentaBloqueada,String cuenta) throws FondosInsuficientes, CuentaBloqueada, DatosErroneos{
		if ((x-y) < 0) {
			throw new FondosInsuficientes("No cuenta con los fondos suficientes para realizar esta transferencia");
		} else if (cuentaBloqueada==true) {
			throw new CuentaBloqueada("Su cuenta esta bloqueada usted no puede realizar transferencias");			
		} else if (cuenta.length() > 5) {
			throw new DatosErroneos("Los datos de su cuenta que ingreso son erroneos");
		}
		
		
		return x-y;
	}
	

}
