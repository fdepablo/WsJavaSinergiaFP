package ejercicio_while;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio10 {
	
	/**
	 * Funcion que compara dos números. Devuelve true o false si el usuario ha 
	 * acertado el número.
	 * @param numeroUsuario el número elegido por el usuario
	 * @param numeroSecreto el número aleatorio
	 * @return true si el numeroUsuario es igual que numeroSecreto, 
	 * false en caso contrio
	 */
	public static boolean comprobarNumero(int numeroUsuario, int numeroSecreto) {
        if (numeroUsuario < numeroSecreto) {
            System.err.println("Demasiado bajo");
            return false;
        }else if (numeroUsuario > numeroSecreto) {
        	System.err.println("Demasiado alto");
        	return false;
        }else {
        	System.err.println("correcto!");
        	return true;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(10) + 1;
        boolean haAcertado = false;
        do {
        	System.out.println("Adivina el número (1-10): ");
        	int numeroUsuario = sc.nextInt();

        	haAcertado = comprobarNumero(numeroUsuario, numeroSecreto);
        }while(!haAcertado);//while se ejecuta mientras sea "true"
        
        System.out.println("Has ganado!");
    }
}
