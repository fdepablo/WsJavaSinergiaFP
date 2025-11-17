package ejercicios;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca el número para calcular su factorial:");
		long numero = sc.nextInt();
		
		long factorial = 1;
		for(long i = numero; i >= 2; i--) {
			factorial *= i;
		}

		System.out.println("El factorial es: " + factorial);
	}

}
