package ejerciciodeinterfacesconarray;

public class Libro extends Publicacion implements Prestable{
    private boolean prestado;

    public Libro(String codigo, String titulo, int añoPublicacion) {
        super(codigo, titulo, añoPublicacion);
       this.prestado=false;
    }

    @Override
    public String toString() {
        String info=super.toString();
        if(this.prestado)
            info=info+"\nEl libro está prestado en este momennto";
        else
            info=info+"\nEl libro no está prestado en este momennto";
        return info;
    }
    @Override
    public void prestar() {
        if(this.prestado)
            System.out.println("El libro ya está prestado");
        else{
            System.out.println("Se ha prestado el libro");
            this.prestado=true;
        }
    }
    @Override
    public void devolver() {
        if(this.prestado){
            System.out.println("Gracias por devolver el libro");
            this.prestado=false;
        }else{
            System.out.println("El libro no está prestado por lo que no se puede devolver");
        }
    }
    @Override
    public boolean prestado() {
        if(this.prestado){
            System.out.println("El libro está prestado");
            return true;
        }else{
            System.out.println("El libro no está prestado");
            return false;
        }
         
    }
}
