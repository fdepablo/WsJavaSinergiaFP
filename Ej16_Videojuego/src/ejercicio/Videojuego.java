package ejercicio;

public class Videojuego {
	int id;
	String nombre;
	/* 0 al 10 */
	double puntuacion;
	double precio;
	/* DD/MM/YYYY */
	String fecha;
	boolean esSegundaMano;
	
	public Videojuego() {
		fecha = "01/01/1970";
	}
	
	public Videojuego(int id, String nombre, double puntuacion, double precio
			, String fecha, boolean esSegundaMano) {
		this.id = id;
		this.nombre = nombre;
		this.puntuacion = puntuacion;
		this.precio = precio;
		this.fecha = fecha;
		this.esSegundaMano = esSegundaMano;
	}
	
	public Videojuego(String nombre, String fecha) {
		this.nombre = nombre;
		this.fecha = fecha;
	}
	
	public void mostrar() {
		System.out.println("Datos del videojuego");
		System.out.println("--------------------");
		System.out.println("ID: " + this.id);
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Puntuacion: " + this.puntuacion);
		System.out.println("Precio: " + this.precio);
		System.out.println("Fecha: " + this.fecha);
		if(this.esSegundaMano) {
			System.out.println("El juego es de segunda mano");
		}else {
			System.out.println("El juego es nuevo");
		}
	}
	
	public void mostrarNombrePuntuacion() {
		System.out.println("El juego se llama: " + this.nombre + " y tiene una "
				+ "puntuación de " + this.puntuacion);
	}
	
	public void mostrarPrecioLibras() {
		double precioEnLibras = this.precio * 0.86;
		System.out.println("El precio del videojugo " + this.nombre + " en libras "
				+ "es de: " + precioEnLibras);
	}
	
	public void mostrarFechaAmericana() {
		String[] arrayFecha = this.fecha.split("/");
		String dia = arrayFecha[0];//DD
		String meses = arrayFecha[1];//MM
		String anio = arrayFecha[2];//YYYY
		
		String fechaAmericana = anio + "-" + meses + "-" + dia;
		System.out.println("La fecha en formato americano es: " + fechaAmericana);
	}
	
	public double obtenerPrecioConDescuento() {
		double precioFinal = this.precio;
		if(this.esSegundaMano) {
			precioFinal = this.precio * 0.70;
		}
		return precioFinal;
	}
	
	public void mostrarEsJugable() {
		if(this.puntuacion >= 5) {
			System.out.println("El videjuego es jugable");
		}else {
			System.out.println("El videojuego no es recomendable");
		}
	}
	
	public void mostrarNumerosNaturales() {
		for(int i = (int)this.puntuacion; i <= 10; i++) {
			System.out.println(i);
		}
	}
	
	public boolean esMasCaro(Videojuego v) {
		double diferenciaPrecio = this.precio - v.precio;
		if(diferenciaPrecio > 0) {
			return false;
		}else {
			return true;
		}
	}
}
