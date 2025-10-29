package swich;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un número:");
		int numero = sc.nextInt();
		int moduloNumero = numero % 2;
		
		switch (moduloNumero) {
		case 0:
			System.out.println("El número es par");
			break;
		case 1:
			System.out.println("El número es impar");
		}		
	}
}
