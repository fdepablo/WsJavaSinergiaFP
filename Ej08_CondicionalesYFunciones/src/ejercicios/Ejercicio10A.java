package ejercicios;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio10A {

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

        // El jugador puede elegir introducir el poder o generarlo aleatoriamente
        System.out.print("¿Quieres introducir el poder del mago (1) o generarlo aleatoriamente (2)? ");
        int opcion = sc.nextInt();

        int poderMago = 0;
        if (opcion == 1) {
            System.out.print("Introduce el nivel de poder del mago (1–10): ");
            poderMago = sc.nextInt();
        } else {
            poderMago = random.nextInt(10) + 1;
            System.out.println("El poder del mago generado aleatoriamente es: " + poderMago);
        }
        
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
