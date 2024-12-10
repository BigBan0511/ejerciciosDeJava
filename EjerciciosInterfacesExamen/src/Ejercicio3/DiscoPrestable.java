package Ejercicio3;

import ejerciciosinterfacesexamen.Prestable;

public class DiscoPrestable extends Disco implements Prestable{
    private boolean prestado;

    public DiscoPrestable(String titulo, String autor, String formato, double duracion, String genero) {
        super(titulo, autor, formato, duracion, genero);
        this.prestado = false;
    }

    @Override
    public void prestar() {
        this.prestado = true;
    }

    @Override
    public void devolver() {
        this.prestado = false;
    }

    @Override
    public boolean prestado() {
        if(this.prestado){
            System.out.println("Esta prestado");
            return this.prestado;
        }else{
            System.out.println("No esta prestado");
            return this.prestado;
        }
    }
 
}
