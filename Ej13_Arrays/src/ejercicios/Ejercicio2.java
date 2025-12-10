package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el tamaño del array");
		int tamanio = sc.nextInt();
		int[] arrayNumeros = new int[tamanio];
		
		//Primera parte, llenar el array de numeros
		for(int i = 0; i < tamanio; i ++) {
			System.out.println("Introduzca el valor: " + i);
			int valor = sc.nextInt();
			arrayNumeros[i] = valor;
		}
		
		//Segunda parte, sumar los valores dentro del array
		int suma = 0;
		for(int i = 0; i < tamanio; i ++) {
			suma += arrayNumeros[i];
		}

		System.out.println("La suma es: " + suma);
	}

}
