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
	
	public void mostrarTrabajadores() {
		for(Trabajador t : trabajadores) {
			System.out.println(t);//Gracias al toString
		}
	}
	
	public Trabajador existeTrabajador(String DNI) {
		for(Trabajador t : trabajadores) {
			if(t.DNI.equals(DNI)) {
				return t;
			}
		}
		
		return null;
	}
	
	public int obtenerNumeroDeTrabajadores() {
		return this.trabajadores.length;
	}

}
