package examen.Final;

public class AreaTrianguloEquilatero extends AreaTrianguloRectangulo {


	
	/*
	@Override
	double areaTrianguloRectangulo(double b, double h) {
		// TODO Auto-generated method stub
		return super.areaTrianguloRectangulo(b, h);
	}
	*/
	
	//FINAL EN UN MÉTODO
	
	//EN ESTE CASO SE TIENE QUE EL MÉTODO "areaTrianguloRectangulo"
	//ESTA DECLARADO COMO FINAL, POR LO QUE NO ES POSIBLE SOBRE ESCRIBIR
	//ESTE MÉTODO COMO SE MUESTRA EN LAS LINEAS DE CÓDIGO 8, 9, 10, 11 Y 12. 
	//SE PUEDE OBSERVAR QUE SI ES POSIBLE HEREDAR LA CLASE 
	//"AreaTrianguloRectangulo" YA QUE NO ESTA DECLARADA COMO "final".
	
	//SIN EMBARGO DEBIDO A QUE UNICAMENTE UN MÉTODO ESTA DECLARADO COMO "final"
	//Y NO TODA LA CLASE, ES POSIBLE SOBREESCRIBIR EL OTRO MÉTODO DE LA CLASE 
	//EL MÈTODO "AreaTriángulo" COMO SE MUESTRA EN LAS LINEAS 24, 25, 26, 27 Y 28.
	
	//RESUMIENDO, EL "final" EN UN MÉTODO EVITA SU SOBREESCRITURA.
	
	@Override
	double areaTriángulo(double x, double y) {
		double art = (x * y)/2;
	return art;
	}
	
	
}
