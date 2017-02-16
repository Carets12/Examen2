package Examen;
import java.util.ArrayList;

//importa las bibliotecas que creas necesaria.
public class Curso{
  public static void main (String[]arg)
  {
	ArrayList<Modulo> modulo;
    Alumno alumno1 = new Alumno("joaquinto", "pocas luces", 13);
    Alumno alumno2 = new Alumno("alvaro" "elistillo de clase", 15);
    Alumno alumno3 = new Alumno(("antonio", "pedante sabelotodo", 43);
    Alumno alumno4 = new Alumno(("beatriz", "aprueba todo", 23);
    Alumno alumno3 = new Alumno(("carmen", "brillante brillante", 17);
    Profesor profesor1 = new Profesor("augusto" "mecargotodo", true);
    Profesor profesor2 = new Profesor("pedrito" "machacón", false);

    //crea un objeto de tipo modulo
    Modulo m = new Modulo();
    Profesor p = new Profesor();
    Alumno a = new Alumno();
    
    //añade los alumnos y los profesores
    public void addAlumnos (){
    	alumnos.add;
    	
    }
    public void  addProfesores(){
    	profesores.add;
    }

    //lee desde la clase scanner el nombre del módulo
    //y las horas del mismo, dichas horas deben estar comprendidas entre
    //3 a 8
    //usa una expresión regular para controlar el dato introducido
    //tanto para que sea un entero y esté en ese rango de valor
    //igual con el  nombre del módulo, deben ser solo letras
    //NO puede lanzarse una excepción por introducir un valor no entero
    //en el caso que la cantidad introducida no corresponda al rango anterior
    //o no sea una cadena de letras el nombre del módulo
    //se establecerá 6 horas en caso de una lectura errónea
    //y DEFAULT como nombre del ciclo  en caso incorrecto 

    //imprime la referencia del módulo
    System.out.println("La referencia del modulo es: " + modulo.get(nombre) );
    //imprime la lista de alumnos
    System.out.println("Los alumnos son : " + alumnos.size());
    //imprime la lista alumnes menores de edad
    System.out.println("Los alumnos menores son : " + alumnos.menorEdad());
    //imprime la lista de profesores
    System.out.println("Los profesores son : " + profesores.size());

  }
}
