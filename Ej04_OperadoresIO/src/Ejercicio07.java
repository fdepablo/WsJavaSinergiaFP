import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca el numero de preguntas acertadas:");
		int acertadas = sc.nextInt();
		
		System.out.println("Introduzca el numero de preguntas falladas:");
		int falladas = sc.nextInt();
		
		System.out.println("Introduzca el numero de preguntas no contestadas:");
		int noContestadas = sc.nextInt();
		
		int notaAcertadas = acertadas * 5;
		
		int notaTotal = notaAcertadas - falladas;
		System.out.println("Nota total: " + notaTotal);

	}

}
