package ejercicio;

public class VideojuegoEclipse {
	int id;
	String nombre;
	String fecha;
		
	public VideojuegoEclipse(String nombre) {
		super();
		this.nombre = nombre;
	}

	public VideojuegoEclipse(int id, String nombre, String fecha) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "VideojuegoEclipse [id=" + id + ", nombre=" + nombre + ", fecha=" + fecha + "]";
	}
	
	
	
}
