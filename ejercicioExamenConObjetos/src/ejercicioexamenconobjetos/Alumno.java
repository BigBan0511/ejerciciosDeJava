package ejercicioexamenconobjetos;

import java.util.Scanner;

public class Alumno {
    private Scanner datos = new Scanner(System.in);
    private String nombre;
    private String DNI;
    private int edad;
    private String grupo;
    private Examen [] misExamenes;
    private double [] notas;
    private double notaMedia;
    private int examenesRealizados;

    public Alumno(String nombre, String DNI, int edad, String grupo, Examen[] misExamenes) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.edad = edad;
        this.grupo = grupo;
        this.misExamenes = new Examen [6];
        this.notas = new double [6];
        this.notaMedia = 1;
        this.examenesRealizados = 0;
    }
    
    public void ponerNota(){
        if(this.examenesRealizados==this.misExamenes.length){
            System.out.println("Ya se han introducido todas las notas");
        }else{
            System.out.println("Introduce la nota del examen de " + this.misExamenes[this.examenesRealizados].getNombreAsignatura());
            this.notas[this.examenesRealizados] = this.datos.nextDouble();
            this.examenesRealizados++;
        }
        if(this.examenesRealizados == this.misExamenes.length)
            calcularMedia();
    }
    
    public String toString(){
        String respuesta = "";
        for (int x = 0; x < this.examenesRealizados; x++) {
            respuesta += "Nota del examen de " + this.misExamenes[x].getNombreAsignatura() + ": " + this.notas[x];
        }
        for (int x = this.examenesRealizados; x < this.misExamenes.length; x++) {
            respuesta += "El examen de " + this.misExamenes[x].getNombreAsignatura() + " aun no se ha realizado";
        }
        if(this.examenesRealizados == this.misExamenes.length){
            respuesta +="Su media es: " + this.notaMedia;
        }else{
            respuesta +="No se ha calculado la media";
        }
        return respuesta;
    }
    
    private void calcularMedia(){
        this.notaMedia = 0;
        for (int x = 0; x < this.notas.length; x++) {
            this.notaMedia = this.notaMedia + this.notas[x];
            
        }
        this.notaMedia = this.notaMedia/this.examenesRealizados;
    }

    public int getExamenesRealizados() {
        return examenesRealizados;
    }

    public Examen[] getMisExamenes() {
        return misExamenes;
    }

    public double getNotaMedia() {
        return notaMedia;
    }
    
    
    
}
