package funciones;

public class Ejercicio4 {
	public static void main(String[] args) {
		int cajita = (int)calcularArea(4,5.35);
		System.out.println(cajita);
	}
	
	public static double calcularArea(double base, double altura) {
		double area = base * altura;
		return area;
	}
}
