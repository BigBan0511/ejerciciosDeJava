package ejemploclasesabstractas;

public class Gato extends Animal{
    private String razaGato;
    private boolean peloso;

    public Gato(String razaGato, boolean peloso, double altura, double peso, String habitat) {
        super(altura, peso, habitat);
        this.razaGato = razaGato;
        this.peloso = peloso;
    }
    
    public String toString(){
        String elPadre = super.toString();
        if(peloso)
            return elPadre + " la raza del gato es " + this.razaGato + " y es un gato peloso";
        else
            return elPadre + " la raza del gato es " + this.razaGato + " y no es un gato peloso";
    }

    @Override
    public void alimentarse() {
        System.out.println("Soy un gato y me alimento de pienso y raspas de pescado");
    }
    
    public void alimentarse(String comida){
        if(comida.equalsIgnoreCase("pienso")){
            System.out.println("Mmm riquisimo el pienso");
        }else if(comida.equalsIgnoreCase("raspas")){
            System.out.println("Mmm riquisimas las raspas");
        }else{
            System.out.println("Puaj no me gusta asqueroso");
        }
    }
}
