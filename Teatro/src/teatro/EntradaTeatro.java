
package teatro;

public class EntradaTeatro extends Entradas{
    private String categoria;
    private String [] categorias={"Comedia", "Drama", "Amor"};

    public EntradaTeatro() {
        super();
        setPrecio(40);
        this.categoria=categorias[(int)(Math.random()*this.categorias.length)];
    }
    
    @Override
    public void mostrarEntradas(){
        System.out.println("Este espectáculo es un teatro");
        super.mostrarEntradas();
        System.out.println("La categoría de la obra es " + this.categoria);
    }
    
    
}
