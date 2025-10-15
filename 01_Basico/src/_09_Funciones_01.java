
public class _09_Funciones_01 {

	public static void main(String[] args) {
		/*
		System.out.println("*********************");
		System.out.println("* Copyrigth Felix ***");
		System.out.println("*********************");*/
		
		copyright();
		System.out.println("Esto es una parte del programa que hace cosas...");
		
		/*
		System.out.println("*********************");
		System.out.println("* Copyrigth Felix ***");
		System.out.println("*********************");*/
		
		copyright();
		System.out.println("Seguimos haciendo cosas...");
		
		/*
		 * System.out.println("*********************");
		 * System.out.println("* Copyrigth Felix ***");
		 * System.out.println("*********************");
		 */
		System.out.println("*********************");
		
		copyrigthNombre("Oscar");
		copyrigthNombre("Felix");
		copyrigthNombre("Ana");
		
		sumar(8,9);
		sumar(12,98);
		sumar(12,89,10);
		int numero = sumarConRetorno(45, 45);
		System.out.println(numero);
		numero = sumarConRetorno(numero, 10);
		System.out.println(numero);
		numero = sumarConRetorno(numero, numero);
		System.out.println(numero);
		numero = sumarConRetorno(numero, sumarConRetorno(50, 50));
		System.out.println(numero);
		numero = (int)restarConRetorno(numero, 50);
		
		String concatenacion = concatenar("Ola ", "K ase?");
		System.out.println(concatenacion);
		
		ejecutarCalculos();
	}
	
	public static void copyright() {
		System.out.println("*********************");
		System.out.println("* Copyrigth Felix ***");
		System.out.println("*********************");
	}
	
	public static void copyrigthNombre(String nombre) {
		System.out.println("*********************");
		System.out.println("* Copyrigth " + nombre + " ***");
		System.out.println("*********************");
	}
	
	public static void sumar(int n1, int n2) {
		int resultado = n1 + n2;
		System.out.println("el resultado de la suma es: " + resultado);
	}
	
	public static void sumar(int n1, int n2, int n3) {
		int resultado = n1 + n2 + n3;
		System.out.println("el resultado de la suma es: " + resultado);
	}
	
	public static int sumarConRetorno(int n1, int n2) {
		int resultado = n1 + n2;
		return resultado;
	}
	
	public static double restarConRetorno(int n1, int n2) {
		double resultado = n1 - n2;
		return resultado;
	}
	
	public static String concatenar(String s1, String s2) {
		String resultado = s1 + s2;
		return resultado;
	}
	
	public static void ejecutarCalculos() {
		sumar(34,78);
		sumar(23,45,67);
		copyright();
	}
}
