package ejemploherencia;

public class Perro extends Animal{
    private String razaPerro;
    private String nombre;
    private boolean tieneCollar;
    private boolean malaLeche;

    public Perro(String razaPerro, String nombre, boolean tieneCollar, boolean malaLeche, double altura, double peso, String nombreCientifico, String color, boolean pelaje, String tipoAlimentacion) {
        super(altura, peso, nombreCientifico, color, pelaje, tipoAlimentacion);
        this.razaPerro = razaPerro;
        this.nombre = nombre;
        this.tieneCollar = tieneCollar;
        this.malaLeche = malaLeche;
    }
    
    public void mearDentroCasa(){
        System.out.println("Voy a joder a mi dueño jijiji");
    }
    
    public void cariñoso(){
        if(nombre.equalsIgnoreCase("Princesa")){
            this.malaLeche=true;
        }
    }
    
    //SOBRESCRITURA DE MÉTODOS:
    //Se produce cuando queremos que alguna clase fija de la clase madre
    //tenga uno de sus métodos especializado, es decir, con un comportamiento
    //diferente al de la clase madre. Si el método está sobrecargado en la clase hija
    //cuando llame al método un objeto de esa clase, el método se comportará como
    //se haya sobrescrito, si una clase heredada no sobrescribe el método, cuando un objeto
    //de esta clase llame al método, se ejecutará el de la clase madre
    @Override
    public void dormir(){
        System.out.println("Voy a dormir pero antes me cagaré en la cama de mi amo");
        System.out.println("XDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD");
    }
}
