package ejercicioexamenconobjetos;

import java.util.Scanner;

public class Examen {
    private Fecha laFecha;
    private Hora laHora;
    private String nombreAsignatura;
    private int aula;
    private Scanner datos;

    public Examen(Fecha fechaExamen, Hora horaExamen) {
        this.datos=new Scanner(System.in);
        this.laFecha = laFecha;
        this.laHora = laHora;
        System.out.println("Introduce la asignatura del examen:");
        this.nombreAsignatura=this.datos.nextLine();
        System.out.println("Introduce el aula del examen:");
        this.aula=this.datos.nextInt();
    }
    
    public void mostrarExamen(){
        System.out.println("La fecha del examen es: " + this.laFecha);
        System.out.println("La hora del examen es: " + this.laHora);
        System.out.println("El aula del examen es: " + this.aula);
        System.out.println("La asignatura del examen es: " + this.nombreAsignatura);
    }
    
    public String toString(){
        return "El examen es de " + this.nombreAsignatura + 
                "\nA las " + this.laHora + " del dia " +this.laFecha +
                "\nAula: " + this.aula;
    }

    public String getNombreAsignatura() {
        return nombreAsignatura;
    }

    public int getAula() {
        return aula;
    }

    public Fecha getFechaExamen() {
        return laFecha;
    }

    public Hora getHoraExamen() {
        return laHora;
    }
    
    
    
}
