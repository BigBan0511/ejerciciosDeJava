package ejercicioclasesabstractas;

public class Mono extends SerVivo{
    private String raza;

    public Mono(String raza, String tipo) {
        super(tipo);
        this.raza = raza;
    }

    @Override
    public void caminar() {
        System.out.println("Camino a 4 patas y trepo arboles");
    }

    @Override
    public void comer() {
        System.out.println("Como platanos");
    }

    @Override
    public void comunicarse() {
        System.out.println("Hago sonidos raros");
    }

    @Override
    public void respirar() {
        System.out.println("Respiro por la boca");
    }

    @Override
    public int tiempoDeEmbarazo() {
        return 4;
    }
    
    
}
