package ejercicios;
import java.util.Scanner;

public class Ejercicio04 {
    public static boolean esMultiplo(int a, int b) {
        boolean esMultiplo = false;
        if(a % b == 0) {
        	esMultiplo = true;
        }
    	return esMultiplo;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        int a = sc.nextInt();

        System.out.print("Introduce el segundo número: ");
        int b = sc.nextInt();

        if (esMultiplo(a, b)) {
            System.out.println(a + " es múltiplo de " + b);
        } else {
            System.out.println(a + " no es múltiplo de " + b);
        }
    }
}
