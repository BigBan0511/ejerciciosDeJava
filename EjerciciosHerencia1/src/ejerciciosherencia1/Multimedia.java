package ejerciciosherencia1;

import java.util.Scanner;

public class Multimedia {
    private Scanner datos = new Scanner(System.in);
    private String titulo;
    private String autor;
    private String formato;
    private int duracion;

    public Multimedia(String titulo, String autor, String formato, int duracion) {
        this.titulo = titulo;
        this.autor = autor;
        this.duracion = duracion;
        boolean valido = false;
        do {       
            switch (formato) {
                case "mp3","wav","midi","avi","mov","mpg","cdAudio","dvd":
                    valido = true;
                    this.formato = formato;
                    break;
                default:
                    System.out.println("NO VALIDO");
                    break;
            }
            this.formato = formato;
        } while (valido==false);
    }    

    @Override
    public String toString() {
        String info = "titulo: " + titulo + ", autor: " + autor + ", formato: " + formato + ", duracion: " + duracion;
        return info;
    }
    
    public boolean equals(Multimedia nuevo){
        boolean esIgual = false;
        //instanceof comprueba si lo que le he pasado es compatible con otra cosa, por ejemplo un Multimedia con un String o
        //un Multimedia con un Multimedia
        //if (otro instanceof Multimedia){
        //      Multimedia elemento=(Multimedia)otro;
        // .....................................................................
        //}
        if(nuevo.autor.equalsIgnoreCase(this.autor)){
            if(nuevo.titulo.equalsIgnoreCase(this.titulo)){
                esIgual = true;
                System.out.println(esIgual);
            }
        }else{
            esIgual = false;
            System.out.println(esIgual);
        }
        return esIgual;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getFormato() {
        return formato;
    }

    public int getDuracion() {
        return duracion;
    }
    
    
}
