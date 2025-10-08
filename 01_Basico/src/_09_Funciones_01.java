
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
		copyrigthNombre("Oscar");
		
		sumar(8,9);
		sumar(12,98);
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

}
