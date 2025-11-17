
public class Variables {

	public static void main(String[] args) {
		// Tenemos variables pritivas
		int edad = 89;
		int numeroTarjetasCredito = 2;
		int numeroSeguridadSocial = 28979898;
		System.out.println(edad);
		System.out.println(numeroSeguridadSocial);
		System.out.println(numeroTarjetasCredito);
		edad = 90;
		System.out.println(edad);
		
		double peso = 78.9;
		System.out.println(peso);
		
		float altura = 190.5F;
		System.out.println(altura);
		
		byte edad2 = 90;
		
		boolean estaCasado = false;
		estaCasado = true;
		
		long taraDeUnPortaviones = 10_000_000_000L;
		System.out.println(taraDeUnPortaviones);
		
		char primeraLetra = 'A';
		
		//El String no es un primitivo, es una clase
		String nombre = "Félix";
		System.out.println(nombre);

	}

}
