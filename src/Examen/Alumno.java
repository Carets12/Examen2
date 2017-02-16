package Examen;

public class Alumno {
	private String nombre;
	private String apellidos;
	private int edad;
	
	public Alumno(String nombre, String apellidos, int edad) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}

	public Alumno(String string, int i) {
		// TODO Auto-generated constructor stub
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public int getEdad() {
		return edad;
	}

	@Override
	public String toString() {
		return "apellidos_alumno " + apellidos 
				+ "nombre_alumno " + nombre + "edad_alumno " + edad; 
	}
	
	
	
	
}
