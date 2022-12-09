package multicacthYAutoCloseable;

public class Prueba {
	
	
	public static void main(String[] args) throws FondosInsuficientes, CuentaBloqueada, DatosErroneos {
		Transferencia transfer1 = new Transferencia();
		transfer1.transferencia(1000, 900, false,"12345");
		System.out.println(transfer1);
	}

}
