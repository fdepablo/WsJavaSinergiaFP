package funciones;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("-------- Imprimir 1 ---------");
		imprimirPantalla();
		System.out.println("-------- Imprimir 2 ---------");
		imprimirPantalla();
		System.out.println("-------- Imprimir 3 ---------");
		imprimirPantalla();
		
		
	}
	
	public static void imprimirPantalla() {
		System.out.println("1.	Entrar en la aplicación");
		System.out.println("2.	Registrarse en la aplicación");
		System.out.println("3.	Salir del programa");
	}
}
