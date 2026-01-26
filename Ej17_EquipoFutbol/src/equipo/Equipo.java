package equipo;

import java.util.Arrays;

public class Equipo {
	String nombre;
	String ciudad;
	int anioFundacion;
	String[] jugadores;
	
	public Equipo(String nombre, String ciudad, int anioFundacion, String[] jugadores) {
		super();
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.anioFundacion = anioFundacion;
		this.jugadores = jugadores;
	}

	public Equipo() {
		super();
	}

	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", ciudad=" + ciudad + ", anioFundacion=" + anioFundacion + ", jugadores="
				+ Arrays.toString(jugadores) + "]";
	}
	
	public void mostrarJugadores() {
		System.out.println("Jugadores del equipo: " + this.nombre);
		if(this.jugadores == null) {
			System.out.println("No hay jugadores en el equipo");
		}else {
			for(String jugador : this.jugadores) {
				System.out.println(jugador);
			}
		}

	}
	
	public boolean existeJugador(String jugador) {
		if(this.jugadores == null) {
			return false;
		}
		
		boolean existe = false;
		for(String j : this.jugadores) {
			if(j.equalsIgnoreCase(jugador)) {
				existe = true;
				break;
			}
		}
		
		return existe;
	}
	
	public int obtenerNumeroJugadores() {
		if(this.jugadores == null) {
			return 0;
		}else {
			return this.jugadores.length;
		}			
	}
	
	public boolean esAnioBisiesto() {
		if((this.anioFundacion % 4 == 0 && !(this.anioFundacion % 100 == 0))
				|| this.anioFundacion % 400 == 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public int obtenerNumeroCaracteresCiudad() {
		int numeroCaracteres = 0;
		if(this.ciudad != null) {
			numeroCaracteres = this.ciudad.length();
		}
		return numeroCaracteres;
	}
	
	public boolean esAptoParaJugar() {
		//Ya que tenemos un método que nos devuelve el número de jugadores
		//podemos invocarlo
		if(this.obtenerNumeroJugadores() >= 7) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean esDerby(Equipo equipo) {
		if(this.ciudad.equalsIgnoreCase(equipo.ciudad)) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean esIgual(Equipo equipo) {
		if(!this.nombre.equalsIgnoreCase(equipo.nombre)) {
			return false;
		}
		
		for(String jugador : equipo.jugadores) {
			if(!this.existeJugador(jugador)) {
				return false;
			}
		}
		
		return true;
	}
	
}
