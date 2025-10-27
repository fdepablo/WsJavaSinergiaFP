package condicionales;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Intruduzca el número del día de la semana:");
		int diaDeLaSemana = sc.nextInt();
		
		if(diaDeLaSemana == 1) {
			System.out.println("Estamos a lunes");
		}else if(diaDeLaSemana == 2) {
			System.out.println("Estamos a martes");
		}else if(diaDeLaSemana == 3) {
			System.out.println("Estamos a miercoles");
		}else if(diaDeLaSemana == 4) {
			System.out.println("Estamos a jueves");
		}else if(diaDeLaSemana == 5) {
			System.out.println("Estamos a viernes");
		}else if(diaDeLaSemana == 6) {
			System.out.println("Estamos a sabado");
		}else if(diaDeLaSemana == 7) {
			System.out.println("Estamos en domingo");
		}else {
			System.out.println("No renocemos el día de la semana");
		}
		
		/* Esto es diferente, ya que evalua todos lo if
		if(diaDeLaSemana == 1) {
			System.out.println("Estamos a lunes");
		}
		if(diaDeLaSemana == 2) {
			System.out.println("Estamos a martes");
		}
		if(diaDeLaSemana == 3) {
			System.out.println("Estamos a miercoles");
		}*/
	}
}
