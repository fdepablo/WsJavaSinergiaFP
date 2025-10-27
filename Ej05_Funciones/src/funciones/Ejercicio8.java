package funciones;

public class Ejercicio8 {

	public static void main(String[] args) {
		System.out.println(calcularNotaFinal(4, 7, 8, 9, 10));
		System.out.println(calcularNotaFinal(6, 1, 3, 8, 8));

	}
	
	public static double calcularNotaFinal(double parcial1,
											double parcial2,
											double parcial3,
											double examenFinal,
											double trabajoFinal) {
		
		double parciales55 = ((parcial1 + parcial2 + parcial3) / 3) * 0.55;
		double examenFinal30 = examenFinal * 0.30;
		double trabajoFinal15 = trabajoFinal * 0.15;
		double notaFinal = parciales55 + examenFinal30 + trabajoFinal15;
		return notaFinal;
	}

}
