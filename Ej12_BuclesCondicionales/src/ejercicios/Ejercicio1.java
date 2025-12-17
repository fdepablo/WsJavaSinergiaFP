package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el primer número:");
		int n1 = sc.nextInt();
		
		System.out.println("Introduzca el segundo número:");
		int n2 = sc.nextInt();
		
		int contadorPares = 0;
		for(int i = n1; i <= n2; i++) {
			if(i % 2 == 0) {
				contadorPares++;
			}
		}

		System.out.println("El numero de pares es: " + contadorPares);
	}

}
