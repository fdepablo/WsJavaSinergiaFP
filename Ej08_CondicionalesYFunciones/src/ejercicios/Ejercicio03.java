package ejercicios;
import java.util.Scanner;

public class Ejercicio03 {
    public static String saludoSegunHora(int hora) {
        if (hora >= 6 && hora <= 12)
            return "Buenos días";
        else if (hora >= 13 && hora <= 19)
            return "Buenas tardes";
        else if (hora >= 20 && hora <= 23)
            return "Buenas noches";
        else
            return "Es muy tarde, deberías dormir";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la hora (0-23): ");
        int hora = sc.nextInt();

        System.out.println(saludoSegunHora(hora));
    }
}
