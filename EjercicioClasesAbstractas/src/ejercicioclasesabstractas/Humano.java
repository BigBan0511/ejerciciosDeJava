package ejercicioclasesabstractas;

public class Humano extends SerVivo{
    private String nombre;

    public Humano(String nombre, String tipo) {
        super(tipo);
        this.nombre = nombre;
    }
    
    @Override
    public void respirar(){
        System.out.println("Respiro por la nariz");
    }

    @Override
    public void caminar() {
        System.out.println("Camino con las dos piernas");
    }
    
    @Override
    public void comunicarse(){
        System.out.println("Hablo idiomas perfectamente y de manera fluida");
    }
    
    @Override
    public int tiempoDeEmbarazo(){
        return 9;
    }
    
}
