package ejerciciosinterfacesexamen;

public class Publicacion {
    String codigo;
    String titulo;
    int añoPublicacion;

    public Publicacion(String codigo, String titulo, int añoPublicacion) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.añoPublicacion = añoPublicacion;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    @Override
    public String toString() {
        return "Publicacion{" + "codigo=" + codigo + ", titulo=" + titulo + ", a\u00f1oPublicacion=" + añoPublicacion + '}';
    }
    
    
}
