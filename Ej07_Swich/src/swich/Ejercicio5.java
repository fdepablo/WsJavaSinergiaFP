package swich;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		mostrarMenu();
		
		Scanner sc = new Scanner(System.in);
		int opcion = sc.nextInt();
		
		System.out.println("Introduzca el primer número:");
		double numero1 = sc.nextDouble();
		
		System.out.println("Introduzca el segundo número:");
		double numero2 = sc.nextDouble();
		
		switch (opcion) {
		case 1:
			System.out.println(sumar(numero1, numero2)); 
			break;
		case 2:
			System.out.println(restar(numero1, numero2)); 
			break;
		case 3:
			System.out.println(multiplicar(numero1, numero2)); 
			break;
		case 4:
			System.out.println(dividir(numero1, numero2)); 
			break;
		case 5:
			System.out.println(calcularResto(numero1, numero2)); 
			break;
		default:
			System.out.println("Opcion elegida no valida");
			break;
		}		
	}
	
	public static double sumar(double numero1, double numero2) {
		double resultado = numero1 + numero2;
		return resultado;
	}
	
	public static double restar(double numero1, double numero2) {
		return numero1 - numero2;
	}
	
	public static double multiplicar(double numero1, double numero2) {
		double resultado = numero1 * numero2;
		return resultado;
	}
	
	public static double dividir(double numero1, double numero2) {
		double resultado = numero1 / numero2;
		return resultado;
	}
	
	public static double calcularResto(double numero1, double numero2) {
		double resultado = numero1 % numero2;
		return resultado;
	}
	
	public static void mostrarMenu() {
		System.out.println("Bienvenido a nuestra calculadora!!-");
		System.out.println("Para sumar pulse 1");
		System.out.println("Para restar pulse 2");
		System.out.println("Para multiplicar pulse 3");
		System.out.println("Para dividir pulse 4");
		System.out.println("Para el resto de la división entera pulse 5");
	}
}
