package unico;

public class Persona {

	String sNombre; //
	String sApellidos; //
	String sEdad;
	public Persona(String sNombre, String sApellidos, String sEdad) {
		super();
		this.sNombre = sNombre;
		this.sApellidos = sApellidos;
		this.sEdad = sEdad;
	}
	public String getsNombre() {
		return sNombre;
	}
	public void setsNombre(String sNombre) {
		this.sNombre = sNombre;
	}
	public String getsApellidos() {
		return sApellidos;
	}
	public void setsApellidos(String sApellidos) {
		this.sApellidos = sApellidos;
	}
	public String getsEdad() {
		return sEdad;
	}
	public void setsEdad(String sEdad) {
		this.sEdad = sEdad;
	}
	@Override
	public String toString() {
		return "Persona [sNombre=" + sNombre + ", sApellidos=" + sApellidos + ", bEdad=" + sEdad + "]";
	} //
	
	
}
