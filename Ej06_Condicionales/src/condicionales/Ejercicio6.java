package condicionales;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un número:");
		int numero = sc.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println("El número es par");
		}else {
			System.out.println("El número es impar");
		}
	}
}
