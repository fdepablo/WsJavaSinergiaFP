package _01_condicionales;

import java.util.Scanner;

public class _01_IF_01 {

	public static void main(String[] args) {
		// Los condicinales van a ayudarnos a romper la secuencialidad
		System.out.println("Escriba un numero: ");
		
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		if(numero == 5) {
			System.out.println("El numero introducido es 5");
		}
		
		if(numero >= 5) {
			System.out.println("El numero introducido es mayor o igual que 5");
		}
		
		if(numero < 5) {
			System.out.println("El número introducido es menor que 5");
		}
		
		//Tenemos tambien if-else
		System.out.println("Introduzca otro número:");
		numero = sc.nextInt();
		
		if(numero > 10) {
			System.out.println("El número introducido es mayor que 10");
		}else {
			System.out.println("El número introducido es menor o igual que 10");
		}
		
		//Tenemos tambien el if-else if-else
		System.out.println("Introduzca la nota del alumno:");
		int nota = sc.nextInt();
		if(nota < 5) {//si
			System.out.println("SUSPENSO");
		}else if(nota < 7) {//si
			System.out.println("APROBADO");
		}else if(nota < 9) {
			System.out.println("NOTABLE");
		}else if(nota <= 10) {
			System.out.println("SOBRESALIENTE");
		}else {//SI NO
			System.out.println("LA NOTA NO ES VALIDA");
		}
		
		//podemos usar tambien expresiones lógicas (AND, OR, NOT)
		System.out.println("Introduzca la edad");
		int edad = sc.nextInt();
		if(edad > 30 && nota == 7) {
			System.out.println("Felicidades un NOTABLE(7) para ser mayor que 30");
		}
		
		if(edad > 30 || nota == 7) {
			System.out.println("O has sacado un 7 o eres mayor que 30 o las dos");
		}
		
		if(!(edad >30)) {//equivalente a poner if(edad <= 30)
			System.out.println("La edad es menor o igua que 30");
		}

	}

}
