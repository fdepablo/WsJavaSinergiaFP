package ejercicios;

import java.util.Scanner;

public class Ejercicios2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int opcion = 0;
		do {
			System.out.println("Introduzca (1) para convertir de F a C o "
					+ "(2) para introducir de C a F:");
			opcion = sc.nextInt();
			
			System.out.println("Introduca la temperatura a convertir");
			double temperatura = sc.nextDouble();
			
			if(opcion == 1) {
				//De F a C
				double celsius = (temperatura - 32) * 5/9;
				System.out.println("Celsius: " + celsius);
			}else if(opcion == 2) {
				//De C a F
				double farenheit = (temperatura * 9/5) + 32;
				System.out.println("Farenheit: " + farenheit);
			}else {
				System.out.println("Opcion no valida");
			}
		}while(opcion != 1 && opcion != 2);
		
		System.out.println("Fin del programa");
	}

}
