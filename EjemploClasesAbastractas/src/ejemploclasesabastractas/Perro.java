package ejemploclasesabastractas;

public class Perro extends Animal{
    private String razaPerro;
    private boolean muerde;
    private String color;

    public Perro(String razaPerro, boolean muerde, String color, double altura, double peso, String habitat) {
        super(altura, peso, habitat);
        this.razaPerro = razaPerro;
        this.muerde = muerde;
        this.color = color;
    }

    @Override
    public void alimentarse() {
        System.out.println("Me alimento de las sobras o de pienso");
    }

    @Override
    public void alimentarse(String comida) {
        if(comida.equalsIgnoreCase("pienso"))
            System.out.println("mmmm riquísimo el pienso");
        else if(comida.equalsIgnoreCase("sobras"))
            System.out.println("Mmmmm riquísimas las sobras");
        else
            System.out.println("No me gusta, dame pienso o sobras");
    }
    
    
    
    
    
}
