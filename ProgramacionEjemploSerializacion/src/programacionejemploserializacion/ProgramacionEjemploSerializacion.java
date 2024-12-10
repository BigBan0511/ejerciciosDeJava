
package programacionejemploserializacion;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ProgramacionEjemploSerializacion {

    public static void matricular (Alumno elAlumno){
        elAlumno.matricularAsignatura("Lengua");
        elAlumno.matricularAsignatura("Matemáticas");
        elAlumno.matricularAsignatura("Música");
        elAlumno.matricularAsignatura("Filosofía");
    }
    
    public static void guardarClase(Clase unaClase){
        try {
            FileOutputStream miFlujo = new FileOutputStream("laClase.dat");
            ObjectOutputStream miObjetoCopia = new ObjectOutputStream(miFlujo);
            miObjetoCopia.writeObject(unaClase);
            miObjetoCopia.close();
            miFlujo.close();miObjetoCopia.close();
        }catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public static Clase cargarClase(){
        Clase laClase=null;
        try {
            FileInputStream elFlujoEntrada = new FileInputStream("laClase.dat");
            ObjectInputStream miObjetoCopia = new ObjectInputStream(elFlujoEntrada);
            laClase=(Clase)miObjetoCopia.readObject();
            miObjetoCopia.close();
            elFlujoEntrada.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ProgramacionEjemploSerializacion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ProgramacionEjemploSerializacion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProgramacionEjemploSerializacion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return laClase;
    }
    
    public static void main(String[] args) {
        /*Alumno elAlumno1 = new Alumno("María", "López", 23);
        Alumno elAlumno2 = new Alumno("Julia", "García", 30);
        Alumno elAlumno3 = new Alumno("Pedro", "Romeral", 32);
        Alumno elAlumno4 = new Alumno("Jhon", "Smith", 18);
        Alumno elAlumno5 = new Alumno("Antuan", "Sarkozy", 17);
        
        matricular(elAlumno1);
        matricular(elAlumno2);
        matricular(elAlumno3);
        matricular(elAlumno4);
        matricular(elAlumno5);
        
        Clase laClase = new Clase();
        laClase.añadirAlumno(elAlumno1);
        laClase.añadirAlumno(elAlumno2);
        laClase.añadirAlumno(elAlumno3);
        laClase.añadirAlumno(elAlumno4);
        laClase.añadirAlumno(elAlumno5);
        
        System.out.println(laClase.toString());
        guardarClase(laClase);*/
        
        Clase unClase = cargarClase();
        System.out.println(unClase.toString());
        
    }
    
}
