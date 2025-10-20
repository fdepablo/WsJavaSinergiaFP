import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Intruduzca el peso (Kg):");
		double peso = sc.nextDouble();
		
		System.out.println("Intruduzca la altura (cm):");
		double alturaCM = sc.nextDouble();
		
		double alturaMetros = alturaCM / 100;
		
		double IMC = peso / (alturaMetros * alturaMetros);
		System.out.println("El IMC es: " + IMC);
		
	}

}
