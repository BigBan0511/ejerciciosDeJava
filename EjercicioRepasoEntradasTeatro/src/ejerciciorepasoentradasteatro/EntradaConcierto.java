package ejerciciorepasoentradasteatro;

public class EntradaConcierto extends Entradas{
    private String estilo;
    private String[] estilos = {"Jazz","Flamenco","Heavy Metal","Clasica","Pop"};

    public EntradaConcierto() {
        super();
        int num = (int)(Math.random()*this.estilos.length);
        for (int x = 0; x < this.estilos.length; x++) {
            if(x == num){
                this.estilo = this.estilos[x];
            }
        }
        setPrecio(30);
    }
    
    @Override
    public void mostrarEntradas() {
        System.out.println("Esto es un concierto");
        super.mostrarEntradas();
        System.out.println("El estilo de musica es " + this.estilo);
    }
    
    
}
