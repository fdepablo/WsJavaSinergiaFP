package ejercicios;

import java.util.Scanner;
import java.util.Random;

public class Ejercicio07 {
    public static String comprobarNumero(int numeroUsuario, int numeroSecreto) {
        if (numeroUsuario < numeroSecreto)
            return "Demasiado bajo. el número es: " + numeroSecreto;
        else if (numeroUsuario > numeroSecreto)
            return "Demasiado alto. el número es: " + numeroSecreto;
        else
            return "¡Correcto!";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(10) + 1;

        System.out.print("Adivina el número (1-10): ");
        int numeroUsuario = sc.nextInt();

        System.out.println(comprobarNumero(numeroUsuario, numeroSecreto));
    }
}
