package condicionales;

import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca el importe de la compra:");
		double importe = sc.nextDouble();
		double descuento = 0;
		
		if(importe >= 100) {
			descuento = 0.10;
		}else if(importe >= 50 && importe < 100) {
			descuento = 0.05;
		}
		
		double descuentoDelImporte = importe * descuento;
		double importeConDescuento = importe - descuentoDelImporte;
		System.out.println("El descuento aplicado es: " + (descuento * 100) + "%");
		System.out.println("El precio con el descuento es: " + importeConDescuento + "€");
	}
}
