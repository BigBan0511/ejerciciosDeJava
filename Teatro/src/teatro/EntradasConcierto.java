package teatro;

public class EntradasConcierto extends Entradas{
    private String estilo;
    private String [] losEstilos={"Jazz", "Flamenco", "Clasica", "Heavy metal", "Pop"};

    public EntradasConcierto() {
        super();
        //Quitamos el +1 opara que el mínimo sea 0 y el max length-1
        setPrecio(30);
        this.estilo=losEstilos[(int)(Math.random()*this.losEstilos.length)];
    }
    
    public void mostrarEntradas(){
        System.out.println("Este espectáculo es un concierto");
        super.mostrarEntradas();
        System.out.println("El estilo de música es " + this.estilo);
    }
    
    
}
