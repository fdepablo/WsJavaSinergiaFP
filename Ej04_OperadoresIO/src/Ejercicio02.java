import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca el primer cateto:");
		double cateto1 = sc.nextDouble();
		
		System.out.println("Introduzca el segundo cateto:");
		double cateto2 = sc.nextDouble();
		
		double sumaCuadradoCatetos = (cateto1 * cateto1) + (cateto2 * cateto2);
		double hipotenusa = Math.sqrt(sumaCuadradoCatetos);
		
		System.out.println("La hipotenusa es: " + hipotenusa);

	}

}
