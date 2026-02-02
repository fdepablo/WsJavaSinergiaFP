package entidad;

public class MainEmpresa {

	public static void main(String[] args) {
		Trabajador t1 = new Trabajador("12345678P", "Jesus", 2000);
		Trabajador t2 = new Trabajador("8765432X", "Marta", 2500);
		
		System.out.println(t1.esDNIValido());
		System.out.println(t2.esDNIValido());
		
		System.out.println(t1.ganaMas(t2));
		System.out.println(t2.ganaMas(t1));
		
		System.out.println(t1.esIgual(t2));
		
		Empresa e1 = new Empresa();
		e1.NIF = "98989899P";
		e1.nombre = "Churreria San Antonio";
		
		Trabajador[] trabajadores = new Trabajador[2];
		trabajadores[0] = t1;
		trabajadores[1] = t2;
		
		e1.trabajadores = trabajadores;
		
		e1.mostrarTrabajadores();
		System.out.println(e1.existeTrabajador("6565745P"));
		
		Trabajador t3 = e1.existeTrabajador("12345678P");
		System.out.println(t3);		
		
		System.out.println(e1.obtenerNumeroDeTrabajadores());
		
	}

}
