import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Intruduzca el principal:");
		double principal = sc.nextDouble();
		
		System.out.println("Intruduzca la tasa:");
		double tasa = sc.nextDouble();
		
		System.out.println("Intruduzca el tiempo (dias):");
		//si ponemos un doble, dara error
		int dias = sc.nextInt();
		
		double interesSimple = principal * tasa * dias;
		System.out.println("El interes simple es: " + interesSimple);
		
	}

}
