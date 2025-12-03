package ejercicio_while;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número: ");
		int numero = sc.nextInt();
		
		int factorial = 1;
		int contador = 1;
		do{
			factorial *= contador;
			contador++;
		}while(contador <= numero);

		System.out.println("factorial: " + factorial);
		
		sc.close();
	}

}
