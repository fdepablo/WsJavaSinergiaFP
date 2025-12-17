package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4 {

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
		int[] arrayNumerosInvertido = new int[tamanio];
		int posicion = tamanio - 1;
		for(int i = 0; i < tamanio;i++) {
			arrayNumerosInvertido[posicion] = arrayNumeros[i];
			posicion--;
		}
		
		System.out.println("El array invertido es: " + Arrays.toString(arrayNumerosInvertido));
	}

}
