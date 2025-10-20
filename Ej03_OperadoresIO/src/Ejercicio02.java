import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Intruduzca los grados Farenheit:");
		double gradosFarenheit = sc.nextDouble();
		double gradosCelsius = (gradosFarenheit - 32) * 5 / 9;
		System.out.println("Grados Celsius: " + gradosCelsius);
	}

}
