package ejerciciosinterfacesexamen;

public class Revista extends Publicacion{
    private int numero;

    public Revista(int numero, String codigo, String titulo, int añoPublicacion) {
        super(codigo, titulo, añoPublicacion);
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Revista{" + "numero=" + numero + super.toString() + '}';
    }
    
    @Override
    public String getCodigo() {
        return codigo;
    }

    @Override
    public int getAñoPublicacion() {
        return añoPublicacion;
    }
    
}
