package ejerciciosclasesabstractasexamen;

public class Mono extends SerVivo{
    private String raza;

    public Mono(String raza, String tipo) {
        super(tipo);
        this.raza = raza;
    }

    @Override
    public void caminar() {
        System.out.println("Peru god");
    }

    @Override
    public void comunicarse() {
        System.out.println("Waton kuliao");
    }

    @Override
    public int tiempoDeEmbarazo() {
        return 1;
    }
    
    
}
