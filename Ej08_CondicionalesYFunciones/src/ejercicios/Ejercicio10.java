package ejercicios;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio10 {

    public static int obtenerMultiplicador(int poder) {
        if (poder <= 3) {
        	return 1;
        }else if (poder <= 7) {
        	return 2;
        }else {
        	return 3;
        }
    }

    public static int calcularDanioMago(int poder) {
        int multiplicador = obtenerMultiplicador(poder);
        return poder * multiplicador;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Introduce el nivel de poder del mago (1–10): ");
        int poderMago = sc.nextInt();

        int poderMonstruo = random.nextInt(20) + 1;
        int danioMago = calcularDanioMago(poderMago);

        System.out.println("El monstruo tiene un poder de: " + poderMonstruo);
        System.out.println("El mago causa un daño de: " + danioMago);

        if (danioMago > poderMonstruo)
            System.out.println("¡El mago ha ganado!");
        else if (danioMago == poderMonstruo)
            System.out.println("Empate en el combate.");
        else
            System.out.println("El monstruo ha ganado.");
    }
}
