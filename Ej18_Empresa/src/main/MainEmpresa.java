package main;

import entidad.Trabajador;

public class MainEmpresa {

	public static void main(String[] args) {
		Trabajador t1 = new Trabajador("12345678P", "Jesus", 2000);
		Trabajador t2 = new Trabajador("8765432X", "Marta", 2500);
		
		System.out.println(t1.esDNIValido());
		System.out.println(t2.esDNIValido());
		
		System.out.println(t1.ganaMas(t2));
		System.out.println(t2.ganaMas(t1));

	}

}
