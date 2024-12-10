package ejercicioclasesabstractas;

public class Libro extends Producto{
    private int añoPublicacion;
    private String titulo;

    public Libro(int añoPublicacion, String titulo, double precioNormal, String calidad) {
        super(precioNormal, calidad);
        this.añoPublicacion = añoPublicacion;
        this.titulo = titulo;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public double precioConDescuento() {
        return 7;
    }
    
    
}
