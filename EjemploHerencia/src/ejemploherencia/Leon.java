package ejemploherencia;

public class Leon extends Animal{
    private String habitat;
    private String sexo;
    private int numDientes;
    private boolean soySalvaje;

    public Leon(String habitat, String sexo, int numDientes, boolean soySalvaje, double altura, double peso, String nombreCientifico, String color, boolean pelaje, String tipoAlimentacion) {
        super(altura, peso, nombreCientifico, color, pelaje, tipoAlimentacion);
        this.habitat = habitat;
        this.sexo = sexo;
        this.numDientes = numDientes;
        this.soySalvaje = soySalvaje;
    }

    public Leon(String habitat, String sexo, int numDientes, boolean soySalvaje, boolean pelaje) {
        super(pelaje);
        this.habitat = habitat;
        this.sexo = sexo;
        this.numDientes = numDientes;
        this.soySalvaje = soySalvaje;
    }
    
    public void rugir(){
        System.out.println("GRRRRRRRRRR");
    }
    
    public void cazarABambi(){
        System.out.println("Carne rica rica");
    }
}
