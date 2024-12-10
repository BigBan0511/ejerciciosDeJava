package ejerciciosinterfacesexamen;

public class Libro extends Publicacion implements Prestable{
    private boolean prestado;

    public Libro(String codigo, String titulo, int añoPublicacion) {
        super(codigo, titulo, añoPublicacion);
        this.prestado = false;
    }

    @Override
    public String toString() {
        return "Libro{" + "prestado=" + prestado + super.toString() + '}';
    }

    @Override
    public String getCodigo() {
        return codigo;
    }

    @Override
    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    @Override
    public void devolver() {
        this.prestado = false;
    }

    @Override
    public boolean prestado() {
        if(this.prestado){
            System.out.println("Esta prestado");
            return true;
        }else{
            System.out.println("No esta prestado");
            return false;
        }
    }

    @Override
    public void prestar() {
        this.prestado = true;
    }
    
    
    
}
