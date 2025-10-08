
public class _03_Variables {

	//Una variable es como una caja donde podemos guardar
	//literales. Se llama variable porque puede cambiar su 
	//valor o contenido con el tiempo
	public static void main(String[] args) {
		// Declarar una variable
		// Cuando declaramos una variable, estamos creandola
		// Solamente puede existir una variable con el mismo nombre
		// dentro de un bloque.
		// Un bloque es lo que hay dentro de "{ }"
		
		//Declaramos una variable poniendo primero el tipo y luego
		//el nombre y despues el valor
		int edad = 25;
		System.out.println(edad);//imprimimos lo que hay en la caja "edad"
		//Podemos cambiar su valor
		edad = 30;
		System.out.println(edad);
		
		//Esto da error en tiempo de compilación
		//int edad = 35;
		
		int edad2 = 40;
		edad2 = 45;
		edad = edad2;//edad = 45
		System.out.println(edad);//45
		
		//Variables de double
		double peso = 45.67;
		System.out.println(peso);
		peso = 68.90;
		System.out.println(peso);
		
		//Variable boolean
		boolean estaCasado = false;
		System.out.println(estaCasado);
		boolean estaCasadoPorLaIglesia = true;
		
		//Variable caracter
		char caracter = 'a';
		//caracter = "a";
		//caracter = true;
		//edad = 56.89;
		peso = 70;
		
		//Variables de tipo entero largo
		long numeroLargo = 2200000000L;
		System.out.println(numeroLargo);
		
		//Variables de tipo flota
		float peso2 = 34.5F;
		
		//Todas las variables anteriores se llaman "primitivas"
		//Variable de cadena de texto
		//Esto es una variable de clase
		String cadena = "Ola ke ase?";
		System.out.println(cadena);
		
		//Variables mas importantes son String, int, double, boolean y long
	}

}
