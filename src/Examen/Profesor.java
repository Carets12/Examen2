package Examen;

public class Profesor {

	private String nombre;
	private String primerApellido;
	private String definitivo;
	
	public Profesor(String nombre, String primerApellido, String tipo) {
		this.nombre = nombre;
		this.primerApellido = primerApellido;
		this.definitivo = tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public String getPrimerApellido() {
		return primerApellido;
	}

	public String getTipo() {
		return definitivo;
	}

	@Override
	public String toString() {
		return "nombre_profesor " + nombre + " apellido_profesor " 
	+ primerApellido + " definitivo: " + definitivo;
	}
	
	
	
	
	
}
