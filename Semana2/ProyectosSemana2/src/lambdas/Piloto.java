package lambdas;

public class Piloto {
	
	private String nombre;
	private int edad;
	private double salario;
	private String escuderia;
	private String nacionalidad;
	private int lugar;
	
	public Piloto(String nombre, int edad, double salario, String escuderia, String nacionalidad, int lugar) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
		this.escuderia = escuderia;
		this.nacionalidad = nacionalidad;
		this.lugar = lugar;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getEscuderia() {
		return escuderia;
	}

	public void setEscuderia(String escuderia) {
		this.escuderia = escuderia;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	
	public int getLugar() {
		return lugar;
	}

	public void setLugar(int lugar) {
		this.lugar = lugar;
	}

	@Override
	public String toString() {
		return "Piloto: " + nombre + ", edad: " + edad + ", salario (en milllones de euros): " + salario + ", escuderia: " + escuderia
				+ ", nacionalidad: " + nacionalidad + ", lugar en el campeonato de pilotos: " + lugar + ".";
	}

}