
package programacionejemploserializacion;

import java.io.Serializable;
import java.util.ArrayList;


public class Clase implements Serializable{
    private ArrayList <Alumno> losAlumnos;

    public Clase() {
        this.losAlumnos = new ArrayList<>();
    }
    
    public boolean añadirAlumno(Alumno elAlumno){
        return this.losAlumnos.add(elAlumno);
    }
    
    public String toString(){
        String info="Los alumnos de la clase son los siguientes:";
        for(Alumno actual : this.losAlumnos){
            info=info+"\n------------------------------\n";
            info=info+actual.toString();
        }
        return info;
    }
    
    
    
}
