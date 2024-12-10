package ejerciciodeinterfacesconarray;

public class Revista extends Publicacion{
    private int numero;

    public Revista(int numero , String codigo, String titulo, int añoPublicacion) {
        super(codigo, titulo, añoPublicacion);
        this.numero=numero;
    }

    public int getNumero() {
        return numero;
    }
    
    public String toString() {
        String info=super.toString();
        info=info+"\nEl nº de la revista es: " + this.numero;
        return info;
    }
    
    
    
    
}
