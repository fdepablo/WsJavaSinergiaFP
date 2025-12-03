package ejercicio_while;

public class Ejercicio04 {

	public static void main(String[] args) {
		
		int i = 1;
		int suma = 0;
		while(i <= 100) {
			suma += i;
			i++;
		}
		
		System.out.println("La suma de los 100 primeros números es: " + suma);
	}

}
