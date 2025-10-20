import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Intruduzca el ancho:");
		double ancho = sc.nextDouble();
		System.out.println("Introduzca el largo:");
		double largo = sc.nextDouble();
		double area = ancho * largo;
		System.out.println("El area es: " + area);
		
		double perimetro = 2 * (ancho + largo);
		System.out.println("El perimetro es: " + perimetro);
		

	}

}
