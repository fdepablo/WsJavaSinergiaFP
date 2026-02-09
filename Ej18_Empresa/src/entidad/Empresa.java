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
	
	public double obtenerGastoTotalEmpresa() {
		double gastoTotal = 0;//acumulador
		for(Trabajador t : trabajadores) {
			gastoTotal += t.salario;
		}
		
		return gastoTotal;
	}
	
	public int obtenerNumeroTrabajadoresSuperior3000() {
		int contador = 0;
		for(Trabajador t : trabajadores) {
			if(t.salario > 3000) {
				contador++;
			}
		}
		return contador;
	}
	
	public int obtenerNumeroTrabajadoresInferiorSMI() {
		int contador = 0;
		for(Trabajador t : trabajadores) {
			if(t.salario < 1134) {
				contador++;
			}
		}
		return contador;
	}
	
	public int obtenerNumeroTrabajadoresGananMas(double cantidad) {
		int contador = 0;
		for(Trabajador t : trabajadores) {
			if(t.salario > cantidad) {
				contador++;
			}
		}
		return contador;
	}
	
	public boolean tienenTodosTrabajadoresDNIValido() {
		for(Trabajador t : trabajadores) {
			if(!t.esDNIValido()) {
				return false;
			}
		}
		return true;
	}
	
	public boolean esMismaEmpresa(Empresa e) {
		if(this.nombre.equals(e.nombre) 
				&& this.NIF.equals(e.NIF)) {
			return true;
		}else {
			return false;
		}
	}

}
