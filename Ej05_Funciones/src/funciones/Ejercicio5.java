package funciones;

public class Ejercicio5 {

	public static void main(String[] args) {
		double hipotenusa = calcularHipotenusa(4, 4);
		System.out.println(hipotenusa);
		
		System.out.println(calcularHipotenusa(5, 5));

	}
	
	public static double calcularHipotenusa(double cateto1, double cateto2) {
		double cuadradoCateto1 = cateto1 * cateto1;
		double cuadradoCateto2 = cateto2 * cateto2;
		double sumaCuadradoCatetos = cuadradoCateto1 + cuadradoCateto2;
		double hipotenusa = Math.sqrt(sumaCuadradoCatetos);
		return hipotenusa;
	}

}
