import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca el primer número:");
		double numero1 = sc.nextDouble();
		
		System.out.println("Introduzca el segundo número:");
		double numero2 = sc.nextDouble();
		
		System.out.println("Introduzca el tercer número:");
		double numero3 = sc.nextDouble();
		
		double media = (numero1 + numero2 + numero3) / 3;
		System.out.println("La media es: " + media);
	}

}
