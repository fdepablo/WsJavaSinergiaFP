package swich;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Intruduzca la nota del alumno (0-100)");
		int nota = sc.nextInt();
		
		String frase = (nota >= 50 && nota <= 100)
				? "aprobado"
				: "suspenso";
		
		System.out.println(frase);
	}
}
