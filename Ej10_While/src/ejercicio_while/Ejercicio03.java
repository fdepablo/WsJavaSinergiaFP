package ejercicio_while;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el primer número: ");
		int numero1 = sc.nextInt();
		
		System.out.println("Introduzca el segundo número: ");
		int numero2 = sc.nextInt();
		
		while(numero1 <= numero2) {
			System.out.println(numero1);
			numero1++;
		}
	}

}
