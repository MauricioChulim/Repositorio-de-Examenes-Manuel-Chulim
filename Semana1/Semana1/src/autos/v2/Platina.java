package autos.v2;

public class Platina extends AutoUsado{


	private double precio;
	private String marca;
	private String tipovehiculo;
	private int numerocilindros; // potencia
	private double kilometraje; // uso
	private String frenos; //seguro
	private String direccion; //confortable
	
	
	public Platina(){
		
	}

	
	
	public Platina(double precio, String marca, String tipovehiculo, int numerocilindros, double kilometraje,
			String frenos, String direccion) {
		super();
		this.precio = precio;
		this.marca = marca;
		this.tipovehiculo = tipovehiculo;
		this.numerocilindros = numerocilindros;
		this.kilometraje = kilometraje;
		this.frenos = frenos;
		this.direccion = direccion;
	}



	public String kilometrosRecorridos() {
		String uso; 
		if (kilometraje > 750_000) {
			uso = "El auto esta extremadamente usado";
		} 
		else
			if (kilometraje > 500_000 && kilometraje <= 750_000) {
				uso = "El auto bastante usado";
			}
			else 
				if (kilometraje > 250_000 && kilometraje <= 500_000) {
					uso = "El auto esta algo usado";
				}
				else  
					if (kilometraje > 0 && kilometraje < 250_000) {
						uso = "El auto casi no esta usado";
					} 
					else {
						uso = "El auto no puede tener kilometraje negativo";
					}
		return uso;
		
	}
	
	public double potencia (double cilindrada) {
		double pot;
		pot = Math.round( ((0.08 * numerocilindros) * Math.pow(((cilindrada*1000)/numerocilindros),0.9) ));
		return pot;
	}



	public String seguridadComfort(){
		String segAndCom = "";
		if (frenos == "abs" && direccion == "asistida") {
			segAndCom = "El auto es muy seguro y muy confortable";
		} 
		else
			if ((frenos == "disco" || frenos =="abs") && (direccion == "hidraulica")) {
				segAndCom = "El auto es seguro y confortable";	
			}
			else 
				if (frenos == "disco" && direccion == "mecanica") {
					segAndCom = "El auto es seguro pero no es comfortable";
				}
				else 
					if (frenos == "tambor" && direccion == "mecanica") {
						segAndCom = "El auto no es seguro y tampoco es comfortable";
					}
		
		return segAndCom;
	}
	
	
	
	public double getPrecio() {
		return precio;
	}



	public void setPrecio(double precio) {
		this.precio = precio;
	}



	public String getMarca() {
		return marca;
	}



	public void setMarca(String marca) {
		this.marca = marca;
	}



	public String getTipovehiculo() {
		return tipovehiculo;
	}



	public void setTipovehiculo(String tipovehiculo) {
		this.tipovehiculo = tipovehiculo;
	}



	public double getNumerocilindros() {
		return numerocilindros;
	}



	public void setNumerocilindros(int numerocilindros) {
		this.numerocilindros = numerocilindros;
	}



	public double getKilometraje() {
		return kilometraje;
	}



	public void setKilometraje(double kilometraje) {
		this.kilometraje = kilometraje;
	}



	public String getFrenos() {
		return frenos;
	}



	public void setFrenos(String frenos) {
		this.frenos = frenos;
	}



	public String getDireccion() {
		return direccion;
	}



	public void setDirección(String direccion) {
		this.direccion = direccion;
	}



	@Override
	public String toString() {
		return "Caracteristicas de platina [Precio=" + precio + ", Marca=" + marca + ", Tipo de vehiculo=" + tipovehiculo
				+ ", Numero de cilindros=" + numerocilindros + ", Kilometraje=" + kilometraje + ", Frenos=" + frenos
				+ ", Direccion=" + direccion + "]";
	}


	
	
}