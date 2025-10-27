package funciones;

public class Ejercicio9 {

	public static void main(String[] args) {
		calcularSalario(1000, 8, 30);
		calcularSalario(900, 10, 25);
	}
	
	public static void calcularSalario(double salarioBase, 
			int horasExtra, 
			double precioHoraExtra) {
		
		double importeHorasExtraTrabajadas = horasExtra * precioHoraExtra;
		double salarioTotal = importeHorasExtraTrabajadas + salarioBase;
		System.out.println("el salario total es: " + salarioTotal);
	}

}
