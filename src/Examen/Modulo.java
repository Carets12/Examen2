package Examen;
import java.util.ArrayList;

public class Modulo {
	String nombre;
	int horaDuracion;
	
	ArrayList<Profesor> profesores;
	ArrayList<Alumno> alumnos;
	
	public Modulo(String nombre, int horaDuracion) {
		this.nombre = nombre;
		this.horaDuracion = horaDuracion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getHoraDuracion() {
		return horaDuracion;
	}

	public void setHoraDuracion(int horaDuracion) {
		this.horaDuracion = horaDuracion;
	}

	public ArrayList<Profesor> getProfesores() {
		return profesores;
	}

	public void setProfesores(ArrayList<Profesor> profesores) {
		this.profesores = profesores;
	}

	public ArrayList<Alumno> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(ArrayList<Alumno> alumnos) {
		this.alumnos = alumnos;
	}
	
	public Alumno menorEdad(Alumno a){
		for(int i = 0; alumnos.size() < i;i++){
			if(a.getEdad() < 18){
				alumnos.add(a);
					}
			}
		return a;
	}
		
	@Override
	public String toString() {
		return "Alumnos " + alumnos.size() + "Profesores " + profesores.size() 
		+ "nombre_modulo " + nombre + "hora_modulo " + horaDuracion;
	}
	
	
	
}
