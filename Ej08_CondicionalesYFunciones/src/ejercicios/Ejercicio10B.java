package ejercicios;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio10B {

    // Devuelve el multiplicador según el nivel de poder del mago
    public static int obtenerMultiplicador(int poder) {
        if (poder <= 3) {
        	return 1;
        }else if (poder <= 7) {
        	return 2;
        }else {
        	return 3;
        }
    }

    // Calcula el daño total del mago usando el multiplicador
    public static int calcularDanioMago(int poder) {
        int multiplicador = obtenerMultiplicador(poder);
        return poder * multiplicador;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("=== EL COMBATE DEL MAGO ===");

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

        // Puntos de vida del mago
        System.out.print("¿Quieres introducir los puntos de vida del mago (1) o generarlos aleatoriamente (2)? ");
        int opcionVida = sc.nextInt();

        int vidaMago = 0;
        if (opcionVida == 1) {
            System.out.print("Introduce los puntos de vida del mago (10–20): ");
            vidaMago = sc.nextInt();
        } else {
            vidaMago = random.nextInt(11) + 10; // entre 10 y 20
            System.out.println("Puntos de vida generados: " + vidaMago);
        }

        // Generar los dos monstruos con poder aleatorio (1 a 20)
        int poderMonstruo1 = random.nextInt(20) + 1;
        int poderMonstruo2 = random.nextInt(20) + 1;

        System.out.println("\nAparecen dos monstruos!");
        System.out.println("Monstruo 1 → Poder: " + poderMonstruo1);
        System.out.println("Monstruo 2 → Poder: " + poderMonstruo2);

        // Primer combate
        System.out.println("\n=== Primer combate ===");
        int danioMago = calcularDanioMago(poderMago);
        System.out.println("El mago lanza un ataque de poder " + danioMago);

        if (danioMago > poderMonstruo1) {
            System.out.println("El mago vence al primer monstruo.");
        } else if (danioMago == poderMonstruo1) {
            System.out.println("Empate, pero el monstruo logra golpear al mago.");
        } else {
            System.out.println("El monstruo resiste el ataque y contraataca.");
        }

        // El monstruo siempre le causa daño igual a su poder
        vidaMago -= poderMonstruo1;
        System.out.println("El mago recibe " + poderMonstruo1 + " puntos de daño.");
        System.out.println("Vida restante del mago: " + vidaMago);

        // Comprobar si el mago puede luchar contra el segundo monstruo
        if (vidaMago < 1) {
            System.out.println("El mago ha sido derrotado antes de enfrentar al segundo monstruo...");
            return;
        }

        // Segundo combate
        System.out.println("=== Segundo combate ===");
        danioMago = calcularDanioMago(poderMago);
        System.out.println("El mago lanza un ataque de poder " + danioMago);

        if (danioMago > poderMonstruo2) {
            System.out.println("El mago vence al segundo monstruo.");
        } else if (danioMago == poderMonstruo2) {
            System.out.println("Empate, el combate termina en tablas.");
        } else {
            System.out.println("El segundo monstruo resiste y ataca.");
        }

        // El segundo monstruo también causa daño
        vidaMago -= poderMonstruo2;
        System.out.println("El mago recibe " + poderMonstruo2 + " puntos de daño.");
        System.out.println("Vida restante del mago: " + vidaMago);

        // Resultado final
        if (vidaMago >= 1 && danioMago > poderMonstruo2) {
            System.out.println("¡El mago ha derrotado a los dos monstruos!");
            System.out.println("El mago ha sido el héroe del pueblo.");
        } else if (vidaMago >= 1) {
            System.out.println("El mago sobrevive, pero no ha logrado vencer a todos los monstruos.");
        } else {
            System.out.println("El mago cae tras un duro combate...");
        }
    }
}
