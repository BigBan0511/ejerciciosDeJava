package ejemplopolimorfismo;

public class Humano extends Animal{
    private String profesion;
    private boolean esFeliz;

    public Humano(String profesion, boolean esFeliz, int edad, String tipo, double peso) {
        super(edad, tipo, peso);
        this.profesion = profesion;
        this.esFeliz = esFeliz;
    }

    @Override
    public void hacerSonido(){
        System.out.println("Soy un humano y puedo hablar");
    }
    
    public boolean isEsFeliz() {
        return esFeliz;
    }

    public String getProfesion() {
        return profesion;
    }
}
