package ejercicios;

import java.util.Date;

public class Ejercicio9 {
	public static void main(String[] args) {
		Date fechaActual = new Date();
		//Este objeto contiene el numero de milisegundos que han pasado
		//desde el año 1970
		System.out.println("Numero de milisegundos: " + fechaActual.getTime());
	}
}
