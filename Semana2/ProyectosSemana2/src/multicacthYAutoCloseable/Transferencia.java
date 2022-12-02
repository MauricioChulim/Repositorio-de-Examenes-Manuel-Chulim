package multicacthYAutoCloseable;

public class Transferencia implements AutoCloseable{
	
	public Transferencia() {
		super();
	}

	double transferencia(double x, double y, boolean cuentaBloqueada, String cuenta) throws FondosInsuficientes, CuentaBloqueada, DatosErroneos{
		if ((x-y) < 0) {
			throw new FondosInsuficientes("No cuenta con los fondos suficientes para realizar esta transferencia");
		}
		if (cuentaBloqueada==true) {
			throw new CuentaBloqueada("Su cuenta esta bloqueada usted no puede realizar transferencias");			
		}
		if (cuenta.length() > 5) {
			throw new DatosErroneos("Los datos de su cuenta que ingreso son erroneos");
		}
		return x-y;
	}

	@Override
	public void close() throws Exception {
		System.out.println("Cerrando recurso Transferencia");
		
	}
	
}
