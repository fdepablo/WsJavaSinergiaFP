package ejercicio_while;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca la base: ");
		int base = sc.nextInt();
		
		System.out.println("Introduzca el exponente: ");
		int exponente = sc.nextInt();
		
		int potencia = 1;
		int contador = 1;
		do{
			potencia *= base;
			contador++;
		}while(contador <= exponente);

		System.out.println("potencia: " + potencia);
		
		sc.close();
	}

}
