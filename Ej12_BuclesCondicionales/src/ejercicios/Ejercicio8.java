package ejercicios;

import java.util.Date;
import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca el número para saber si es primo:");
		long numero = sc.nextLong();
		
		if(numero < 0) {
			System.out.println("Los números primos no son negativos");
		}else if(numero == 0) {
			System.out.println("El numero 0 no es primo");
		}else if(numero == 1) {
			System.out.println("El numero 1 es primo");
		}else {
			
			Date fechaInicial = new Date();
			boolean esPrimo = true;
			for(long i = 2; i < numero; i++) {
				if(numero % i == 0) {
					esPrimo = false;
					break;
				}
			}
			
			Date fechaFinal = new Date();
			long tiempoTotal = fechaFinal.getTime() - fechaInicial.getTime();
			
			if(esPrimo) System.out.println("El numero " + numero + " es primo");
			else System.out.println("El numero " + numero + " no es primo");
			
			System.out.println("El tiempo total del algoritmo ha sido: " + tiempoTotal + " milisegundos");
		}
		
		System.out.println("Fin del programa. Gracias por usar");
	}
}
