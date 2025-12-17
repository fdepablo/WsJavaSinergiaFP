package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca el tamaño del array");
		int tamanio = sc.nextInt();
		int[] arrayNumeros = new int[tamanio];
		
		//Primera parte, llenar el array de numeros
		for(int i = 0; i < tamanio; i ++) {
			System.out.println("Introduzca el valor " + (i+1));
			int valor = sc.nextInt();
			arrayNumeros[i] = valor;
		}
		
		//Segunda parte
		int numeroMayor = arrayNumeros[0];
		for(int i = 1; i < tamanio; i++) {
			if(arrayNumeros[i] > numeroMayor) {
				numeroMayor = arrayNumeros[i];
			}
		}
		
		System.out.println("El numero mayor es: " + numeroMayor);
	}

}
