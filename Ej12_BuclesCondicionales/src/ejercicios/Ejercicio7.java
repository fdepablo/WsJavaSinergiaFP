package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int opcion = 0;
		do {
			System.out.println("1- Sumar");
			System.out.println("2- Restar");
			System.out.println("3- Multiplicar");
			System.out.println("4- Dividir");
			System.out.println("5- Salir del programa");
			System.out.println("Elija una opcion (1-5):");
			opcion = sc.nextInt();

			int numero1 = 0;
			int numero2 = 0;
			if(opcion >= 1 && opcion <= 4) {
				System.out.println("Introduzca el primer numero: ");
				numero1 = sc.nextInt();
				System.out.println("Introduzca el segundo numero: ");
				numero2 = sc.nextInt();
			}	
			
			//Tambien podriamos usar Switch
			if(opcion == 1) {
				System.out.println("La suma es: " + (numero1 + numero2));
			}else if(opcion == 2) {
				System.out.println("La resta es: " + (numero1 - numero2));
			}else if(opcion == 3) {
				System.out.println("La multiplicación es: " + (numero1 * numero2));
			}else if(opcion == 4) {
				System.out.println("La división es: " + (numero1 / numero2));
			}
		}while(opcion != 5);
		
		System.out.println("Fin del programa. Gracias por usar");
	}
}
