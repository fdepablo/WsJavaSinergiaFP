package ejercicios;

import java.util.Scanner;

public class Ejercicio09 {
	public static String categoriaPersona(int edad, int genero) {
		String cadena = "";
		if (edad < 12) {
			// primera manera. Operador ternario
			cadena = (genero == 1) ? "Niño" : "Niña";
			return cadena;
		} else if (edad <= 17) {
			// If dentro de otro if. If "anidado"
			if (genero == 1) {
				cadena = "Chico";
			} else {
				cadena = "Chica";
			}
			return cadena;
		} else if (edad <= 64) {
			// Tercera manera. Switch
			switch (genero) {
			case 1:
				cadena = "Hombre";
				break;
			case 2:
				cadena = "Mujer";
				break;
			default:
				break;
			}
			return cadena;
		} else {
			// Cuarta manera. Operador ternario y devolviendo directamente su valor
			return (genero == 1) ? "Hombre mayor" : "Mujer mayor";
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce la edad: ");
		int edad = sc.nextInt();

		System.out.print("Introduce el género (1=masculino, 2=femenino): ");
		int genero = sc.nextInt();

		System.out.println("Categoría: " + categoriaPersona(edad, genero));
	}

	public static String categorizer(int gender, int age) {
		String cadena = "";
		switch (gender) {
		case 1:
			if (age <= 12) {
				cadena = "Es un Niño";
			} else if (age >= 13 && age <= 19) {
				cadena = "Es un Chico";
			} else if (age >= 20 && age <= 64) {
				cadena = "Es un Hombre";
			} else if (age >= 65) {
				cadena = "Es un Hombre mayor";
			}
			break;
		case 2:
			if (age <= 12) {
				cadena = "Es una Niña";
			} else if (age >= 13 && age <= 19) {
				cadena = "Es una Chica";
			} else if (age >= 20 && age <= 64) {
				cadena ="Es una Mujer";
			} else if (age >= 65) {
				cadena = "Es una Mujer mayor";
			}
		default:
			cadena = "Number out of range";
		}
		
		return cadena;
	}
}
