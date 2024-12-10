package javaapplication33;

public class Libros extends Publicacion implements Prestable{
    private boolean prestado;

    public Libros(int codigo, String titulo, int añoPublic) {
        super(codigo, titulo, añoPublic);
        this.prestado = false;
    }

    @Override
    public String toString() {
        return super.toString() + "\nEsta prestado? " + this.prestado;
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
    
    
    
}
