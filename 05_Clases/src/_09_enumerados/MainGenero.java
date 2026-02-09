package _09_enumerados;

import java.util.Scanner;

public class MainGenero {

	public static void main(String[] args) {
		System.out.println(Genero.HOMBRE);
		System.out.println(Genero.MUJER);
		
		Genero genero = null;
		genero = Genero.HOMBRE;
		System.out.println(genero);
		genero = Genero.NO_BINARIO;
		System.out.println(genero);
		
		System.out.println("--------------");
		int contador = 1;
		for(Genero g : Genero.values()) {
			System.out.println(contador++ + " - " + g);
		}
		
		System.out.println("Elija un genero: ");
		Scanner sc = new Scanner(System.in);
		int opcion = sc.nextInt();
		genero = Genero.values()[opcion - 1];
		
		System.out.println("Enhorabuena ha elegico usted: " + genero);

	}

}
