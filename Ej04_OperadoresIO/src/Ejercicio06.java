import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca el primer parcial:");
		double parcial1 = sc.nextDouble();
		
		System.out.println("Introduzca el segundo parcial:");
		double parcial2 = sc.nextDouble();
		
		System.out.println("Introduzca el tercer parcial:");
		double parcial3 = sc.nextDouble();
		
		System.out.println("Introduzca el examen final:");
		double examen = sc.nextDouble();
		
		System.out.println("Introduzca el trabajo final:");
		double trabajo = sc.nextDouble();
		
		double mediaParciales = (parcial1 + parcial2 + parcial3) / 3;
		double porcentajeMediaParciales = mediaParciales * 0.55;
		double porcentajeExamen = examen * 0.30;
		double porcentajeTrabajo= trabajo * 0.15;
		double notaFinal = porcentajeExamen + porcentajeTrabajo + porcentajeMediaParciales;
		
		//Para que de dos decimales
		System.out.printf("La nota final es: %.2f ", notaFinal);
	}

}
