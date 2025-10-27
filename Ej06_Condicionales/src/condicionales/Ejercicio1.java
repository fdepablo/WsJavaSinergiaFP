package condicionales;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Intruduzca el primer número");
		int numero1 = sc.nextInt();
		
		System.out.println("Intruduzca el segundo número");
		int numero2 = sc.nextInt();
		
		imprimirMayorMenor(numero1, numero2);
	}
	
	public static void imprimirMayorMenor(int numero1, int numero2) {
		if(numero1 < numero2) {
			System.out.println("El número 1 es menor que el numero 2");
		}else if(numero1 > numero2) {
			System.out.println("El número 1 es mayor que el numero 2");
		}else {
			System.out.println("Los dos número son iguales");
		}
	}

}
