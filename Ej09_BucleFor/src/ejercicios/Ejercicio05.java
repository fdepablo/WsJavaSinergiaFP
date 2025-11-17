package ejercicios;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca el primer número");
		int primerNumero = sc.nextInt();
		
		System.out.println("Introduzca el segundo número");
		int segundoNumero = sc.nextInt();
		
		for(int i = primerNumero; i <= segundoNumero; i++) {
			System.out.println(i);
		}
	}

}
