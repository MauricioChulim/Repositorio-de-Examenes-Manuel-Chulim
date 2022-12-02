package examen.Final;

import java.util.Scanner;

public class CalculadoraArea {
	
	public static void main(String[] args) {
		
		final String titulo = new String("ESTA ES UNA CALCULADORA DE AREAS");
		Scanner entrada = new Scanner(System.in);
		AreaCirculo ope1 = new AreaCirculo();
		AreaCuadrado ope2 = new AreaCuadrado();
		AreaTrianguloRectangulo ope3 = new AreaTrianguloRectangulo();
		AreaTrianguloEquilatero ope4 = new AreaTrianguloEquilatero();

		
		System.out.println(titulo);
		
		/*titulo = "SE INTENTA CAMBIAR EL TITULO DE LA CALCULADORA";*/
		
		//FINAL EN UNA VARIABLE DE REFERENCIA
		
		//EN ESTE CASO EN LA LINEA DE CODIGO 16 SE INTENTA QUE 
		//LA VARIABLE DE INSTANCIA "titulo" APUNTE DEL OBJETO TIPO
		//STRING "ESTA ES UNA CALCULADORA", HACIA OTRO OBJETO TIPO STRING
		//QUE ES EL "SE INTENTA CAMBIAR EL TITULO DE LA CALCULADORA",
		//SIN EMBARGO DEBIDO A QUE ESTA VARIABLE DE REFERENCIA ESTA DECLARADA
		//COMO "final", NO ES POSIBLE QUE ESTA VARIABLE DE REFERENCIA APUNTE 
		//A OTRO OBJETO.
		
		//RESUMIENDO, EL "final" EN UNA VARIABLE DE REFERENCIA EVITA QUE 
		//DICHA VARIABLE DE REFERENCIA CAMBIE DE OBJETO AL QUE HACE REFERENCIA.
		System.out.println("---------------");
		System.out.println("Calculo del área de un circulo");
		System.out.println("Ingrese la longitud del radio del circulo para calcular su área");
		double r = entrada.nextInt();
		System.out.println(ope1.areaCirculo(r));
		System.out.println("");
		
		System.out.println("---------------");
		System.out.println("Calculo del área de un cuadrado");
		System.out.println("Ingrese la longitud de un lado del cuadrado para calcular su área");
		double l = entrada.nextInt();
		System.out.println(ope2.areaCuadrado(l));
		System.out.println("");

		System.out.println("---------------");
		System.out.println("Calculo del área de un triangulo rectangulo");
		System.out.println("Ingrese la longitud de la base del triángulo rectangulo para calcular su área");
		double b = entrada.nextInt();
		System.out.println("Ingrese la longitud de la altura del triángulo rectangulo para calcular su área");
		double h = entrada.nextInt();
		System.out.println(ope3.areaTrianguloRectangulo(b, h));
		System.out.println("");
		
		System.out.println("---------------");
		System.out.println("Calculo del área de un triangulo equilatero");	
		System.out.println("Ingrese la longitud de la base del triángulo equilatero para calcular su área");
		double x = entrada.nextInt();
		System.out.println("Ingrese la longitud de la altura del triángulo equilatero para calcular su área");
		double y = entrada.nextInt();
		System.out.println(ope3.areaTrianguloRectangulo(x, y));
		
	}

	

	
}
