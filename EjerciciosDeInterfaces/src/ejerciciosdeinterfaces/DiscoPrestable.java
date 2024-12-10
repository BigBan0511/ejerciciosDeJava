package ejerciciosdeinterfaces;

public class DiscoPrestable extends Disco implements Prestable{
    private boolean prestado;

    public DiscoPrestable(String titulo, String autor, String formato, double duracion, String genero) {
        super(titulo, autor, formato, duracion, genero);
        this.prestado = false;
    }
    
    public void prestar() {
        if(this.prestado)
            System.out.println("El CD ya está prestado");
        else{
            System.out.println("Se ha prestado el CD");
            this.prestado=true;
        }
    }
    @Override
    public void devolver() {
        if(this.prestado){
            System.out.println("Gracias por devolver el CD");
            this.prestado=false;
        }else{
            System.out.println("El CD no está prestado por lo que no se puede devolver");
        }
    }
    @Override
    public boolean prestado() {
        if(this.prestado){
            System.out.println("El CD está prestado");
            return true;
        }else{
            System.out.println("El CD no está prestado");
            return false;
        }
         
    }
    
    
    
}
