package ejercicios;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		int numeroAleatorio = random.nextInt(10) + 1;
		System.out.println("jejeje, ya he creado el número secreto 😈😈😈");
		
		int numeroUsuario = 0;
		do {
			System.out.println("Pon el número a ver si lo adivinas 😁");
			numeroUsuario = sc.nextInt();
			if(numeroUsuario == numeroAleatorio) {
				System.out.println("Has acertado!! Enhorabuena!! 🎉");
			}else if(Math.abs(numeroUsuario - numeroAleatorio) > 3) {
				System.out.println("Estas bastante lejos jejeje 😁");
			}else if(Math.abs(numeroUsuario - numeroAleatorio) <= 3){
				System.out.println("Caliente caliente 😅");
			}
		}while(numeroUsuario != numeroAleatorio);
	}

}
