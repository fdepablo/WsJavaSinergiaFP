package funciones;

public class Ejercicio6 {
	public static void main(String[] args) {
		double resultado = sumar(5,9);
		System.out.println(resultado);
		resultado = sumar(15,99);
		System.out.println(resultado);
		
		resultado = restar(15,99);
		System.out.println(resultado);
		resultado = restar(99,15);
		System.out.println(resultado);
		
		resultado = multiplicar(15,99);
		System.out.println(resultado);
		resultado = multiplicar(99,15);
		System.out.println(resultado);
		
		resultado = dividir(15,99);
		System.out.println(resultado);
		resultado = dividir(99,15);
		System.out.println(resultado);
		
		System.out.println("--- Operaciones ---");
		imprimirOperaciones(5, 5);
	}
	
	public static double sumar(double numero1, double numero2) {
		double resultado = numero1 + numero2;
		return resultado;
	}
	
	public static double restar(double numero1, double numero2) {
		return numero1 - numero2;
	}
	
	public static double multiplicar(double numero1, double numero2) {
		double resultado = numero1 * numero2;
		return resultado;
	}
	
	public static double dividir(double numero1, double numero2) {
		double resultado = numero1 / numero2;
		return resultado;
	}
	
	public static void imprimirOperaciones(double numero1, double numero2) {
		double resultado = sumar(numero1, numero2);
		System.out.println(resultado);
		
		resultado = restar(numero1, numero2);
		System.out.println(resultado);
		
		resultado = multiplicar(numero1, numero2);
		System.out.println(resultado);
		
		resultado = dividir(numero1, numero2);
		System.out.println(resultado);
		
	}
}
