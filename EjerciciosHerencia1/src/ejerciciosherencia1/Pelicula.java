package ejerciciosherencia1;

import java.util.Scanner;

public class Pelicula extends Multimedia{
    private Scanner datos = new Scanner(System.in);
    private String actorPrincipal;
    private String actrizPrincipal;

    public Pelicula(String actorPrincipal, String actrizPrincipal, String titulo, String autor, String formato, int duracion) {
        super(titulo, autor, formato, duracion);
        this.actorPrincipal = actorPrincipal;
        this.actrizPrincipal = actrizPrincipal;
        if(this.actorPrincipal == null || this.actrizPrincipal == null){
            System.out.println("Introduce al menos uno");
            this.actorPrincipal = this.datos.nextLine();
        }
    }

    @Override
    public String toString() {
        //En info guardamos la informacion de Multimedia
        String info = super.toString();
        //Añadimos a info la informacion propia de la pelicula
        info = info + "\nSu actor principal es: " + this.actorPrincipal + 
                "\nSu actriz principal es: " + this.actrizPrincipal;
        return info;
    }
}
