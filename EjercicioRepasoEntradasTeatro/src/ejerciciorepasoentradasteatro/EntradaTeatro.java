package ejerciciorepasoentradasteatro;

public class EntradaTeatro extends Entradas{
    private String categoria;
    private String[] categorias = {"Comedia","Drama","Amor"};

    public EntradaTeatro() {
        super();
        int num = (int)(Math.random()*3);
        for (int x = 0; x < this.categorias.length; x++) {
            if(x == num){
                this.categoria = this.categorias[x];
            }
        }
        setPrecio(40);
    }
    
    @Override
    public void mostrarEntradas() {
        System.out.println("Esto es un espectaculo de teatro");
        super.mostrarEntradas();
        System.out.println("La categoria de la obra es " + this.categoria);
    }
    
}
