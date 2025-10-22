package funciones;

public class Ejercicio2 {
	public static void main(String[] args) {
		calcularPerimetro(2,5);
		calcularPerimetro(10, 6);
	}
	
	public static void calcularPerimetro(double base, double altura) {
		double perimetro = (base + altura) * 2;
		System.out.println("El perimetro es: " + perimetro);
	}
}
