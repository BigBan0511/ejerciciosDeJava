/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosdeinterfaces;

/**
 *
 * @author Alejandro
 */
public class Proyecto extends Publicacion implements Prestable, Comparable<Publicacion>{
    private String nombreCarrera;
    private boolean prestado;

    public Proyecto(String nombreCarrera, String codigo, String titulo, int añoPublicacion) {
        super(codigo, titulo, añoPublicacion);
        this.nombreCarrera = nombreCarrera;
        this.prestado=false;
    }
    @Override
    public void prestar() {
        if(this.prestado)
            System.out.println("El Proyecto ya está prestado");
        else{
            System.out.println("Se ha prestado el Proyecto");
            this.prestado=true;
        }
    }
    @Override
    public void devolver() {
        if(this.prestado){
            System.out.println("Gracias por devolver el Proyecto");
            this.prestado=false;
        }else{
            System.out.println("El Proyecto no está prestado por lo que no se puede devolver");
        }
    }
    @Override
    public boolean prestado() {
        if(this.prestado){
            System.out.println("El Proyecto está prestado");
            return true;
        }else{
            System.out.println("El Proyecto no está prestado");
            return false;
        }
         
    }

    @Override
    public int compareTo(Publicacion p){
        return this.getCodigo().compareTo(p.getCodigo());
    }
    
    
}
