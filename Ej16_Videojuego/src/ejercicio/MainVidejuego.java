package ejercicio;

public class MainVidejuego {

	public static void main(String[] args) {
		Videojuego v1 = new Videojuego();
		System.out.println(v1.fecha);
		
		Videojuego v2 = new Videojuego(2,"Sonic", 10, 15, "17/12/1990", true);
		Videojuego v3 = new Videojuego("Mario Bross", "15/03/1987");
		
		v2.mostrar();
		v2.mostrarNombrePuntuacion();
		
		v2.mostrarPrecioLibras();
		v2.mostrarFechaAmericana();
		System.out.println(v2.obtenerPrecioConDescuento());
		
		v2.mostrarEsJugable();
		v2.mostrarNumerosNaturales();
		
		v3.precio = 20;
		System.out.println(v2.esMasCaro(v3));
		
		VideojuegoEclipse ve = new VideojuegoEclipse(1, "Tomb Raider", "01/01/1999");
		System.out.println(ve);
	}

}
