package ejercicios;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la base: ");
		int base = sc.nextInt();
		
		System.out.println("Introduce el exponente:");
		int exponente = sc.nextInt();
		
		int resultado = 1;
		for(int i = 1; i <= exponente; i++) {
			resultado *= base;
		}
		System.out.println("El resultado es: " + resultado);
	}

}
