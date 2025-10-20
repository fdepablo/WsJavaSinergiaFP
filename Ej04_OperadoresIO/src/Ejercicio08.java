import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca el salario base:");
		double salarioBase = sc.nextDouble();
		
		System.out.println("Introduzca el numero de hora extra:");
		int horasExtra = sc.nextInt();
		
		final int PRECIO_HORA = 40;
		
		int salarioHorasExtra = horasExtra * PRECIO_HORA;
		double salarioTotal = salarioBase + salarioHorasExtra;
		
		System.out.println("Salario total: " + salarioTotal);

	}

}
