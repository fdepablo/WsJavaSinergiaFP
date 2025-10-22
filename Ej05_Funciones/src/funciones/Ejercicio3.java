package funciones;

public class Ejercicio3 {

	public static void main(String[] args) {
		double perimetro = calcularPerimetro(2, 5);
		System.out.println(perimetro);
				
		System.out.println(calcularPerimetro(6, 4));
	}
	
	public static double calcularPerimetro(double base, double altura) {
		double perimetro = (base + altura) * 2;
		return perimetro;
	}

}
