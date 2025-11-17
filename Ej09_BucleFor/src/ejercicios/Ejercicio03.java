package ejercicios;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca el numero:");
		int numero = sc.nextInt();
		
		for(int i = 1; i <= 20; i++) {
			int resultado = i * numero;//
			System.out.println(i + " x " + numero + " = " + resultado);
		}
	}

}
