package ejemploclasesabastractas;
public class Gato extends Animal{
    private String razaGato;
    private boolean peloso;

    public Gato(String razaGato, boolean peloso, double altura, double peso, String habitat) {
        super(altura, peso, habitat);
        this.razaGato = razaGato;
        this.peloso = peloso;
    }
    
    public String toString(){
        String elPadre=super.toString();
        if(peloso)
            return elPadre + " la raza del gato es " + this.razaGato + " y es un gato peloso";
        else
            return elPadre + " la raza del gato es " + this.razaGato + " y no es un gato peloso";
    }
    
    @Override
    public void alimentarse(){
        System.out.println("Soy un gato y me alimento de pienso y raspas de pescado");
    }
    
    @Override
    public void alimentarse(String comida){
        if(comida.equalsIgnoreCase("pienso"))
            System.out.println("mmmm riquísimo el pienso");
        else if(comida.equalsIgnoreCase("raspas"))
            System.out.println("Mmmmm riquísimas las raspas");
        else
            System.out.println("No me gusta, dame pienso o raspas");
    }
    
    public void maullar(){
        System.out.println("MIauuuuu");
    }
    
}
