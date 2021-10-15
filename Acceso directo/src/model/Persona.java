package model;

public class Persona {

	private String nombre;
	private int edad;
	private Double altura;
	
	public Persona(String nombre, int edad, Double altura) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.altura = altura;
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






	public Double getAltura() {
		return altura;
	}






	public void setAltura(Double altura) {
		this.altura = altura;
	}






	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", altura=" + altura + "]";
	}
}
