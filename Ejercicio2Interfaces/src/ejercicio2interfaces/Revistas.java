package ejercicio2interfaces;

public class Revistas extends Publicacion{
    private int numero;

    public Revistas(int codigo, String titulo, int añoPublic, int numero) {
        super(codigo, titulo, añoPublic);
        this.numero = numero;
    }

    @Override
    public String toString() {
        return super.toString() + "\nEl numero de la revista es: " + this.numero;
    }
    
    
    
}
