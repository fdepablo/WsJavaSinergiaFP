package ejercicio_while;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el número: ");
		int numero = sc.nextInt();
		
		int i = 1;
		do{
			int resultado = i * numero;
			System.out.println(numero + " X " + i + " = " + resultado);
			i++;
		}while(i <= 10);	
		
		sc.close();
	}

}
