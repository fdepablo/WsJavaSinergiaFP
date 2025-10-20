import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca el salario Base:");
		double salarioBase = sc.nextDouble();
		
		System.out.println("Introduzca la primera venta:");
		double venta1 = sc.nextDouble();
		
		System.out.println("Introduzca la segunda venta:");
		double venta2 = sc.nextDouble();
		
		System.out.println("Introduzca la tercera venta:");
		double venta3 = sc.nextDouble();
		
		double comision = (venta1 + venta2 + venta3) / 10;
		double sueldoTotal = salarioBase + comision;
		
		System.out.println("El sueldo total es: " + sueldoTotal);
	}

}
