package ejercicio2interfaces;

public class Publicacion {
    private int codigo;
    private String titulo;
    private int añoPublic;

    public Publicacion(int codigo, String titulo, int añoPublic) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.añoPublic = añoPublic;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getAñoPublic() {
        return añoPublic;
    }

    @Override
    public String toString() {
        return "El codigo es: " + this.codigo +
                "\nEl titulo es: " + this.titulo +
                "\nEl ano de publicacion es: " + this.añoPublic;
    }
    
}
