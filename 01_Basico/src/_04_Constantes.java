
public class _04_Constantes {

	public static void main(String[] args) {
		// Una constante es una "variable" que no puede cambiar
		//su valor en el tiempo
		
		//Su objetivo es que puedan ayudarnos a recordar datos que no
		//cambian durante todo nuestro programa
		
		//Notose que se usa Upper Snake Case
		//para ello usamos la palabra reservada final
		final double VALOR_PI = 3.14159;
		
		System.out.println(VALOR_PI);
		
		System.out.println(5 * 3.14159);
		System.out.println(4 * 3.14159);

		System.out.println(5 * VALOR_PI);
		System.out.println(4 * VALOR_PI);
		
		//VALOR_PI = 6;
	}

}
