package entidad;

public class Trabajador {
	String DNI;
	String nombre;
	double salario;
	
	public Trabajador() {
		super();
	}

	public Trabajador(String dNI, String nombre, double salario) {
		super();
		DNI = dNI;
		this.nombre = nombre;
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Trabajador [DNI=" + DNI + ", nombre=" + nombre + ", salario=" + salario + "]";
	}
	
	public boolean esDNIValido() {
		if(this.DNI == null) {
			return false;
		}
		
		if(this.DNI.length() != 9) {
			return false;
		}	

		return true;
	}
	
	public boolean ganaMas(Trabajador t) {
		if(this.salario > t.salario) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean esIgual(Trabajador t) {
		if(this != null &&
				this.nombre.equals(t.nombre) &&
				this.DNI.equals(t.DNI) &&
				this.salario == t.salario) {
			return true;
		}else {
			return false;
		}
	}
}
