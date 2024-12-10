
package programacionejemploserializacion;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class Alumno implements Serializable{
    private String nombre;
    private String apellido;
    private int edad;
    private ArrayList <String> asignaturas;

    public Alumno(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.asignaturas = new ArrayList<>();
    }
    
    public void matricularAsignatura (String laAsignatura){
        this.asignaturas.add(laAsignatura);
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public String toString(){
        String info= "El nombre del alumno es " + this.nombre +
                "\n El apellido del alumno es " + this.apellido + 
                "\n La edad del alumno es " + this.edad + 
                "\n Esta matriculado en las siguientes asignaturas: ";
        for (String actual : this.asignaturas){
            info=info+"\n-" + actual;
        }
        return info;
    }
    
    
    
    
}
