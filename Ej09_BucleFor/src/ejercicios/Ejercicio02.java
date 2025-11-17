package ejercicios;

public class Ejercicio02 {

	public static void main(String[] args) {
		for(int i = 1; i <= 20; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
		
		for(int i = 1; i <= 20; i+=2) {
			System.out.println(i);
		}

	}

}
