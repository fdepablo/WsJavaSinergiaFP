package ejercicios;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el número: ");
		int numero = sc.nextInt();
		
		imprimirTablaMultiplicar(numero);
		
		System.out.println("Introduzca el segundo número: ");
		int numero2 = sc.nextInt();
		
		imprimirRangoNumeros(numero, numero2);
		
		long factorial = calcularFactorial(numero);
		System.out.println("El factorial es: " + factorial);
	}

	public static void imprimirTablaMultiplicar(int numero) {
		for(int i = 1; i <= 20; i++) {
			int resultado = i * numero;//
			System.out.println(i + " x " + numero + " = " + resultado);
		}
	}
	
	public static void imprimirRangoNumeros(int primerNumero, int segundoNumero) {
		for(int i = primerNumero; i <= segundoNumero; i++) {
			System.out.println(i);
		}
	}
	
	public static long calcularFactorial(int numero) {
		long factorial = 1;
		for(long i = numero; i >= 2; i--) {
			factorial *= i;
		}
		return factorial;
	}
}
