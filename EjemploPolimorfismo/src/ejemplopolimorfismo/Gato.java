package ejemplopolimorfismo;

public class Gato extends Animal{
    private String raza;
    private String tipoPelaje;

    public Gato(String raza, String tipoPelaje, int edad, String tipo, double peso) {
        super(edad, tipo, peso);
        this.raza = raza;
        this.tipoPelaje = tipoPelaje;
    }
    
    @Override
    public void hacerSonido(){
        System.out.println("MIAUUUUU MIAUUUU");
    }
    
    @Override
    public void cumplirAñosHumanos(){
        this.edad=this.edad+5;
    }

    public String getRaza() {
        return raza;
    }

    public String getTipoPelaje() {
        return tipoPelaje;
    }
    
    
    
    
}
