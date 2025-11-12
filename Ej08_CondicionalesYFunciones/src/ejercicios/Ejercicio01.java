package ejercicios;

import java.util.Scanner;

public class Ejercicio01 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la base: ");
        double base = sc.nextDouble();

        System.out.print("Introduce el exponente: ");
        double exponente = sc.nextDouble();

        System.out.print("Tipo de operación (1=potencia, 2=raíz): ");
        int tipo = sc.nextInt();

        double resultado = operacionMatematica(base, exponente, tipo);
        System.out.println("Resultado: " + resultado);
    }
    
    public static double operacionMatematica(double base, double exponente, int tipo) {
        if (tipo == 1) {
        	double potencia = Math.pow(base, exponente); 
            return potencia;
        } else if (tipo == 2) {
            return Math.pow(base, 1.0 / exponente);
        } else {
            System.out.println("Tipo no válido.");
            return 0;
        }
    }
}