package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Pon el número para calcular su fibonacci");
		int numeroUsuario = sc.nextInt();

		if(numeroUsuario < 0) {
			System.out.println("No existen Fibonacci de negativos");
		}else if(numeroUsuario == 0) {
			System.out.println("Fibonacci(0) = 0");
		}else if(numeroUsuario == 1) {
			System.out.println("Fibonacci(1) = 1");
		}else {
			int a = 0;//n - 1
			int b = 1;//n - 2
			
			int fibonacci = 0;
			for(int i = 2; i <= numeroUsuario; i++) {
				fibonacci = a + b;
				a = b;
				b = fibonacci;
			}
			
			System.out.println("Fibonnaci(" + numeroUsuario + ") = " + fibonacci);
		}
	}

}
