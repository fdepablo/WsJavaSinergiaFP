package ejercicio_while;

public class Ejercicio02 {

	public static void main(String[] args) {
		
		int i = 2;
		while(i <= 20) {
			System.out.println("Imprimimos el número " + i);
			i+=2;
		}
		
		System.out.println("-----------");
		i=2;
		while(i <=20) {
			if(i % 2 == 0) {
				System.out.println("Imprimimos el número " + i);
			}			
			i++;
		}
	}

}
