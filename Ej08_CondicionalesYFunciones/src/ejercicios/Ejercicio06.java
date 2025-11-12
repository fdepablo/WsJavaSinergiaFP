package ejercicios;
import java.util.Scanner;

public class Ejercicio06 {
    public static String convertirTiempo(int segundosTotales) {
        int horas = segundosTotales / 3600;
        int resto = segundosTotales % 3600;
        int minutos = resto / 60;
        int segundos = resto % 60;

        return horas + " horas, " + minutos + " minutos y " + segundos + " segundos";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce los segundos totales: ");
        int segundos = sc.nextInt();

        System.out.println("Resultado: " + convertirTiempo(segundos));
    }
}
