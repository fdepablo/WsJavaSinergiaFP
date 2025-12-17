package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numeroMayor = -1;
		int numero = 0;
		do {
			System.out.println("Introduzca un número por teclado:");
			numero = sc.nextInt();
			if(numero > numeroMayor) {//comparamos el numero del usuario con el mayor
				numeroMayor = numero;
			}
		}while(numero >= 0);
		
		System.out.println("El numero mayor es: " + numeroMayor);
	}
}
