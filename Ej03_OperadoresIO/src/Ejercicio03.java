import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final double PI = 3.14159;
		
		System.out.println("Intruduzca el radio:");
		double radio = sc.nextDouble();
		double area = PI * radio * radio;
		System.out.println("El area es: " + area);
	}

}
