package ejerciciosclasesabstractasexamen;

public class Humano extends SerVivo{
    private String nombre;

    public Humano(String nombre, String tipo) {
        super(tipo);
        this.nombre = nombre;
    }

    @Override
    public void respirar() {
        System.out.println("Respiro malamente");
    }

    @Override
    public void caminar() {
        System.out.println("Ando caminando");
    }

    @Override
    public void comunicarse() {
        System.out.println("We speak español");
    }

    @Override
    public int tiempoDeEmbarazo() {
        return 69;
    }
    
    
}
