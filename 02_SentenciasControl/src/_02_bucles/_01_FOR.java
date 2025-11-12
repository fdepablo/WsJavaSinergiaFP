package _02_bucles;

public class _01_FOR {
	public static void main(String[] args) {
		System.out.println("Hola Félix");
		System.out.println("Hola Félix");
		System.out.println("Hola Félix");
		System.out.println("Hola Félix");
		System.out.println("Hola Félix");
		System.out.println("Hola Félix");
		
		saludar();
		saludar();
		saludar();
		saludar();
		saludar();
		saludar();
		
		//Tenemos las llamadas estructuras repetitivas
		//Cuando queremos ejecutar algo N veces (siendo N, finito)
		//podemos utilizar la estructura "for"
		System.out.println("-- bucle for --");
		for(int i = 1; i <= 1_000;i++) {
			System.out.println("Hola Félix");
		}
		
		for(int i = 1; i <= 1_000;i++) {
			System.out.println("Hola Félix. Este es el saludo número " + i);
		}
		
		for(int i = 0; i <= 6; i++) {
			System.out.println("Hola Félix. Este es el saludo número " + i);
		}
		
		int contador = 0;
		for(int i = -2; i <= 7; i++) {
			contador++;
		}
		System.out.println("El bucle se ha ejecutado: " + contador);
		
		contador = 0;
		for(int i = 0; i < 7; i++) {
			contador++;
		}
		System.out.println("El bucle se ha ejecutado: " + contador);
		
		contador = 0;
		for(int i = -7; i < -2; i++) {
			contador++;
		}
		System.out.println("El bucle se ha ejecutado: " + contador);
		
		contador = 0;
		for(int i = 0; i < 6; i+=2) {
			contador++;
		}
		System.out.println("El bucle se ha ejecutado: " + contador);
		
		contador = 0;
		for(int i = 10; i > 0; i--) {
			System.out.println(i);
		}
	}
	
	public static void saludar() {
		System.out.println("Hola Félix");
	}
}
