package ejerciciocomposicionexamenes;

import java.util.Scanner;

public class Examen {
    private Fecha laFecha;
    private Hora laHora;
    private String nombreAsignatura;
    private int aula;
    private Scanner datos;

    public Examen(Fecha laFecha, Hora laHora) {
        this.datos=new Scanner(System.in);
        this.laFecha = laFecha;
        this.laHora = laHora;
        System.out.println("Introduce la asignatura del examen:");
        this.nombreAsignatura=this.datos.nextLine();
        System.out.println("Introduce el aula del examen:");
        this.aula=this.datos.nextInt();
    }
    
    public String toString(){
        return "El examen es de " + this.nombreAsignatura + 
                "\nA las " + this.laHora + " del día " + this.laFecha +
                "\nAula: " + this.aula;
    }

    public Fecha getLaFecha() {
        return laFecha;
    }

    public Hora getLaHora() {
        return laHora;
    }

    public String getNombreAsignatura() {
        return nombreAsignatura;
    }

    public int getAula() {
        return aula;
    }

    public Scanner getDatos() {
        return datos;
    }
    
    
    
}
