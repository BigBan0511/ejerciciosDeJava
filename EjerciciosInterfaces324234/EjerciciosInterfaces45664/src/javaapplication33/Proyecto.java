package javaapplication33;

public class Proyecto extends Publicacion implements Prestable{
    private String nombreCarrera;
    private boolean prestado;

    public Proyecto(String nombreCarrera, int codigo, String titulo, int añoPublic) {
        super(codigo, titulo, añoPublic);
        this.nombreCarrera = nombreCarrera;
    }

    @Override
    public void prestar() {
        System.out.println("El libro se ha prestado");
        this.prestado = true;
    }

    @Override
    public void devolver() {
        System.out.println("El libro se ha devuelto");
        this.prestado = false;
    }

    @Override
    public boolean prestado() {
        if(this.prestado){
            System.out.println("El libro esta prestado");
            return true;
        }else{
            System.out.println("El libro esta libre de pedir prestado");
            return false;
        }
        
    }
    
    public int compareTo(Proyecto otroProyecto){
        return Integer.compare(this.getCodigo(), otroProyecto.getCodigo());
    }
    
}
