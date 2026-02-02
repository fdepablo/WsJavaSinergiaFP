package entidad;

import java.util.Arrays;

public class Empresa {
	String NIF;
	String nombre;
	Trabajador[] trabajadores;
	
	public Empresa() {
		super();
	}

	public Empresa(String nIF, String nombre, Trabajador[] trabajadores) {
		super();
		NIF = nIF;
		this.nombre = nombre;
		this.trabajadores = trabajadores;
	}

	@Override
	public String toString() {
		return "Empresa [NIF=" + NIF + ", nombre=" + nombre + ", trabajadores=" + Arrays.toString(trabajadores) + "]";
	}
	

}
