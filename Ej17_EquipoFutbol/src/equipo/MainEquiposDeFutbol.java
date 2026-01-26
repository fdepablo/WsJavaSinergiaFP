package equipo;

public class MainEquiposDeFutbol {

	public static void main(String[] args) {
		Equipo equipo1 = new Equipo();
		equipo1.anioFundacion = 2100;
		equipo1.ciudad = "Albacete";
		equipo1.jugadores = new String[3];
		equipo1.jugadores[0] = "Paco";
		equipo1.jugadores[1] = "Hugo";
		equipo1.jugadores[2] = "Fernando";
		equipo1.nombre = "Real Mendrugo";
		
		String [] jugadores = {"Paco", "Hugo", "Fernando"};
		Equipo equipo2 = new Equipo("Real Mendrugo", "Albacete", 2020, jugadores);

		System.out.println(equipo1);
		System.out.println(equipo2);
		
		equipo1.mostrarJugadores();
		equipo2.mostrarJugadores();
		
		System.out.println(equipo1.existeJugador("Hugo"));
		System.out.println(equipo2.existeJugador("Hugo"));
		System.out.println(equipo2.existeJugador("Antonio"));
		
		System.out.println(equipo1.obtenerNumeroJugadores());
		System.out.println(equipo2.obtenerNumeroJugadores());
		
		System.out.println(equipo1.esAnioBisiesto());
		System.out.println(equipo2.esAnioBisiesto());
		
		System.out.println(equipo1.obtenerNumeroCaracteresCiudad());
		System.out.println(equipo2.obtenerNumeroCaracteresCiudad());
		
		System.out.println(equipo1.esAptoParaJugar());
		System.out.println(equipo2.esAptoParaJugar());
		
		System.out.println(equipo1.esDerby(equipo2));
		System.out.println(equipo2.esDerby(equipo1));
		
		System.out.println("---------------");
		System.out.println(equipo1.esIgual(equipo2));
	}

	
}
