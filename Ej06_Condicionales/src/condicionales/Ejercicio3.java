package condicionales;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Intruduzca la nota del alumno (0-100)");
		int nota = sc.nextInt();
		if(nota >= 50 && nota <= 100) {
			System.out.println("aprobado");
		}else if(nota >= 0 && nota < 50){
			System.out.println("suspenso");
		}else {
			System.out.println("La nota no es valida (0-100)");
		}
	}
}
