package ejercicios;
import java.util.Scanner;

public class Ejercicio05 {
    public static double calcularSalario(int horas, double tarifa) {
        if (horas > 40) {
            int extras = horas - 40;
            double salarioBase = 40 * tarifa;
            double salarioHorasExtra = extras * tarifa * 1.5; 
            double salarioTotal = salarioBase + salarioHorasExtra;
            return salarioTotal;
        } else {
        	double salarioTotal = horas * tarifa;
            return salarioTotal;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce las horas trabajadas: ");
        int horas = sc.nextInt();

        System.out.print("Introduce la tarifa por hora: ");
        double tarifa = sc.nextDouble();

        double salario = calcularSalario(horas, tarifa);
        System.out.println("Salario semanal: " + salario);
    }
}
