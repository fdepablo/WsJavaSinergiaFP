import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca el primer número:");
		double numero1 = sc.nextDouble();
		
		System.out.println("Introduzca el segundo número:");
		double numero2 = sc.nextDouble();
		
		double suma = numero1 + numero2;
		System.out.println("La suma es: " + suma);
		double resta = numero1 - numero2;
		System.out.println("La resta es: " + resta);
		double multiplicacion = numero1 * numero2;
		System.out.println("La multiplicación es: " + multiplicacion);
		double division = numero1 / numero2;
		System.out.println("La división es: " + division);

	}

}
