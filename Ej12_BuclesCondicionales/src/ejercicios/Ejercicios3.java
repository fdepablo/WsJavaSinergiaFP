package ejercicios;

import java.util.Scanner;

public class Ejercicios3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int suma = 0;
		int numero = 0;
		do {
			System.out.println("Introduzca numeros a sumar hasta que ponga un negativo");
			numero = sc.nextInt();
			if(numero >= 0) {
				suma += numero;
			}
			System.out.println("La suma parcial es: " + suma);
		}while(numero >= 0);
		
		System.out.println("Fin del programa. La suma total es: " + suma);
	}

}
