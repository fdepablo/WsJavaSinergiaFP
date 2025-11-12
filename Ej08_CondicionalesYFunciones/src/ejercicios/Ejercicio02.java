package ejercicios;
import java.util.Scanner;

public class Ejercicio02 {
    public static double precioFinal(double precio, int tipoCliente) {
        double descuento = 0;

        switch (tipoCliente) {
            case 1: 
            	descuento = 0; 
            	break;
            case 2: 
            	descuento = 0.10; 
            	break;
            case 3: 
            	descuento = 0.20; 
            	break;
            default:
                System.out.println("Tipo de cliente no válido.");
        }

        return precio - (precio * descuento);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el precio del producto: ");
        double precio = sc.nextDouble();

        System.out.print("Tipo de cliente (1-regular, 2-frecuente, 3-VIP): ");
        int tipo = sc.nextInt();

        double total = precioFinal(precio, tipo);
        System.out.println("Precio final: " + total);
    }
}
