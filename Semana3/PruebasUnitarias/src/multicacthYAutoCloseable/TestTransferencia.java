package multicacthYAutoCloseable;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TestTransferencia {

	@Test
	void Transferencia_Fondos_Insuficientes() throws FondosInsuficientes, CuentaBloqueada, DatosErroneos {
		Transferencia transfer1 = new Transferencia();
		assertTrue(transfer1.transferencia(1000, 1500, false,"12345")>0);	
	}
	
	@Test
	void Transferencia_Cuenta_Bloqueada() throws FondosInsuficientes, CuentaBloqueada, DatosErroneos {
		Transferencia transfer2 = new Transferencia();
		assertTrue(transfer2.transferencia(1000, 500, true,"12345")>0);	
	}
	
	
	@Test
	void Transferencia_Datos_Erroneos() throws FondosInsuficientes, CuentaBloqueada, DatosErroneos {
		Transferencia transfer3 = new Transferencia();
		assertTrue(transfer3.transferencia(1000, 500, false,"123456")>0);	
	}
	
	@Test
	void Transferencia_Correcta() throws FondosInsuficientes, CuentaBloqueada, DatosErroneos {
		Transferencia transfer3 = new Transferencia();
		assertTrue(transfer3.transferencia(1000, 500, false,"12345")>0);	
	}
	
	@Test
	void Revisar_Si_TransferA_Igual_Objeto_TransferB() throws FondosInsuficientes, CuentaBloqueada, DatosErroneos {
		Transferencia transferA = new Transferencia();
		Transferencia transferB = new Transferencia();
		assertNotSame(transferA,transferB);
	}
	
	@Test
	void Revisar_Si_TransferC_Igual_Objeto_TransferD() throws FondosInsuficientes, CuentaBloqueada, DatosErroneos {
		Transferencia transferC = new Transferencia();
		Transferencia transferD = new Transferencia();
		assertSame(transferC,transferD);
	}
	
	@Test
	void Transferencia_Nula() throws FondosInsuficientes, CuentaBloqueada, DatosErroneos {
		Transferencia transferE = new Transferencia();
		assertNull(transferE);	
	}
	
	@Test
	void Transferencia_No_Nula() throws FondosInsuficientes, CuentaBloqueada, DatosErroneos {
		Transferencia transferF = new Transferencia();
		assertNotNull(transferF);	
	}
	
	@Test
	void TransferenciaIgualA() throws FondosInsuficientes, CuentaBloqueada, DatosErroneos {
		Transferencia transferG = new Transferencia();
		assertEquals(transferG.transferencia(1000, 750, false, "12345"), 250);	
	}
	
	@Test
	void TransferenciaNoIgualA() throws FondosInsuficientes, CuentaBloqueada, DatosErroneos {
		Transferencia transferH = new Transferencia();
		assertNotEquals(transferH.transferencia(1000, 750, false, "12345"), 250);	
	}
	
	
	/*@Test
	void TransferenciaFallo() throws FondosInsuficientes, CuentaBloqueada, DatosErroneos {
		Transferencia transferI = new Transferencia();
		fail(transferI.transferencia(0, 0, false, null));	
	}
	*/
}
