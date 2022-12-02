package examen.Final;

public class AreaCirculo {
	
	final double pi = 3.1416;
	
	double areaCirculo(double r) {
		
		double area = pi * r;
		
		return area;
	}

	public double getPi() {
		return pi;
	}

	/* public void setPi(double pi) {
		this.pi = pi;
	} */
	
	//FINAL EN UNA VARIABLE PRIMITIVA
	
	//DEBIDO A QUE SE A DECLARADO LA VARIABLE PRIMITIVA "pi" COMO FINAL NO ES POSIBLE USAR 
	//LAS LINEAS DE CODIGO 18, 19 Y 20, YA QUE EL MÉTODO SETTER MODIFICARÍA EL VALOR
	//DE PI, Y COMO SE HA MENCIONADO, LA VARIABLE "pi" ESTA COMO UNA VARIABLE "final"
	//LO QUE SIGNIFICA QUE ES UNA CONSTANTE Y SU VALOR NO PUEDE SER MODIFICADO.
	
	//RESUMIENDO, EL "final" EN UNA VARIABLE PRIMITIVA EVITA QUE PUEDA SER MODIFICADA,
	//ES DECIR LA VUELVE UNA CONSTANTE.
	
}
