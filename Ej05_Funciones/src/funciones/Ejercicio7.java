package funciones;

public class Ejercicio7 {
	public static void main(String[] args) {
		calcularMediaTresNumeros(5, 5, 5);
		calcularMediaTresNumeros(6, 34, 70);
	}
	
	public static void calcularMediaTresNumeros(double numero1, double numero2, double numero3) {
		double media = (numero1 + numero2 + numero3) / 3;
		System.out.println("La media es: " + media);
	}
}
