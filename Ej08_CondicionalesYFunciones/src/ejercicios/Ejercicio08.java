package ejercicios;
import java.util.Scanner;

public class Ejercicio08 {
    public static boolean esBisiesto(int año) {
    	boolean esBisiesto = false;
    	if((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)){
    		esBisiesto = true;
    	}
        return esBisiesto;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un año: ");
        int año = sc.nextInt();

        if (esBisiesto(año))
            System.out.println(año + " es bisiesto.");
        else
            System.out.println(año + " no es bisiesto.");
    }
}
