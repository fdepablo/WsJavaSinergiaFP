import java.util.Scanner;

public class _07_EntradaSalida {

	public static void main(String[] args) {
		//Ya hemos trabajado con la salida estandar
		System.out.println("Salida estandar de java. Consola");
		
		//Existe otra salida que es la de errores. syserr
		System.err.println("Esto sería un error!!!. También sale por consola");
		
		//También tenemos la entrada estandar que es System.in
		//lo que ocurre es que normalmente no podemos trabajar directamente
		//con ella, por lo que tenemos que apoyarnos en una clase
		//que se llama Scanner
		Scanner sc = new Scanner(System.in);
		
		//Las clases tienen métodos y accedemos a ellos a traves
		//de la variable y poniendo "."
		
		//Esto lo que hace es parar la ejecución del programa y hasta
		//que no pongamos un número y le demos al "enter", no continuará
		System.out.println("Escriba un número por favor:");
		int numero = sc.nextInt();
		
		System.out.println("Hola, usted ha escrito: " + numero );
		
		System.out.println("Escriba el numerador:");
		int numerador = sc.nextInt();
		System.out.println("Escriba el denominador:");
		int denominador = sc.nextInt();
		int resultado = numerador / denominador;
		System.out.println("El resultado de la división entera es: " + resultado);
		
		//Dentro de la clase Scanner tenemos mas métodos
		System.out.println("Intrudozca un double");
		double d1 = sc.nextDouble();
		System.out.println("Introduzca un long");
		long l1 = sc.nextLong();
		System.out.println("Introduzca un boolean");
		boolean b1 = sc.nextBoolean();
		
		
		//Si en nuestro programa vamos a recojer números y cadenas de texto
		//es mejor tener dos Scanner
		Scanner scCadenas = new Scanner(System.in);
		System.out.println("Introduzca el nombre: ");
		String nombre = scCadenas.nextLine();
		System.out.println("Introduzca los apellidos");
		String apellidos = scCadenas.nextLine();
		System.out.println("Introduzca la edad");
		int edad = sc.nextInt();
		System.out.println("Su nombre es: " + nombre);
		System.out.println("Sus apellidos son: " + apellidos);
		System.out.println("Su edad es: " + edad);
		
		scCadenas.close();
		sc.close();
	}

}
