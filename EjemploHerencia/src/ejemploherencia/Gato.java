package ejemploherencia;

//Para indicar que un Gato es hijo de un animal usamos la palabra EXTENDS
public class Gato extends Animal{
    //Vamos a definir los atributos propios de los Gatos, teniendo en cuenta
    //que han heredado todos los atributos de Animal
    private String razaGatuna;
    private String tipoMaullido;
    private boolean soyAdorable;
    private boolean soyTravieso;

    public Gato(String razaGatuna, String tipoMaullido, boolean soyAdorable, boolean soyTravieso, double altura, double peso, String nombreCientifico, String color, boolean pelaje, String tipoAlimentacion) {
        super(altura, peso, nombreCientifico, color, pelaje, tipoAlimentacion);
        this.razaGatuna = razaGatuna;
        this.tipoMaullido = tipoMaullido;
        this.soyAdorable = soyAdorable;
        this.soyTravieso = soyTravieso;
    }
    
    public void maullar(){
        System.out.println("MiauuuuUUU");
    }
    
    public void cazarInecto(){
        System.out.println("Mira que cucarachita, se la llevre a la cama a mi amo");
    }
}
