import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final double TASA_CONVERSION_DOLAR_EURO = 0.85;
		
		System.out.println("Introduzca los dolares: ");
		double dolares = sc.nextDouble();
		double euros = dolares * TASA_CONVERSION_DOLAR_EURO;
		System.out.println("El cambio a euros sería: " + euros + "€");
		
		
	}

}
