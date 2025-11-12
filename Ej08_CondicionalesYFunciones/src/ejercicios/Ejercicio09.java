package ejercicios;
import java.util.Scanner;

public class Ejercicio09 {
    public static String categoriaPersona(int edad, int genero) {
        if (edad < 12)
            return (genero == 1) ? "Niño" : "Niña";
        else if (edad <= 17)
            return (genero == 1) ? "Chico" : "Chica";
        else if (edad <= 64)
            return (genero == 1) ? "Hombre" : "Mujer";
        else
            return (genero == 1) ? "Hombre mayor" : "Mujer mayor";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la edad: ");
        int edad = sc.nextInt();

        System.out.print("Introduce el género (1=masculino, 2=femenino): ");
        int genero = sc.nextInt();

        System.out.println("Categoría: " + categoriaPersona(edad, genero));
    }
}
