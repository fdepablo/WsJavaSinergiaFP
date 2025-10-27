package condicionales;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Intruduzca la edad:");
		int edad = sc.nextInt();
		
		if(edad >= 0 && edad <= 12) {
			System.out.println("Nino");
		}else if(edad >= 13 && edad <= 19){
			System.out.println("adolescente");
		}else if(edad >= 20 && edad <= 64){
			System.out.println("adulto");
		}else if(edad >= 65 && edad <= 130) {
			System.out.println("Adulto mayor");
		}else {
			System.out.println("La edad no es valida :(");
		}

	}

}
