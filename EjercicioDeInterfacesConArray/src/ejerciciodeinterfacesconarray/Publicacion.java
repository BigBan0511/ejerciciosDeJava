
package ejerciciodeinterfacesconarray;

public class Publicacion {
    private String codigo;
    private String titulo;
    private int añoPublicacion;

    public Publicacion(String codigo, String titulo, int añoPublicacion) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.añoPublicacion = añoPublicacion;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    @Override
    public String toString() {
        return "El titulo de la publicación es: " + this.titulo + "\nEl código de la publicación es: " +
                this.codigo +"\nEl año de publicación es: " + this.añoPublicacion;
    }
    
    
}
