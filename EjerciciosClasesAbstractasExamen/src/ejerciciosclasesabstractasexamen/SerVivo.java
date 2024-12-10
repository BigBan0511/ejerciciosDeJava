package ejerciciosclasesabstractasexamen;

public abstract class SerVivo {
    private String tipo;

    public SerVivo(String tipo) {
        this.tipo = tipo;
    }
    
    public void respirar(){
        System.out.println("Respiro");
    }
    
    public void comer(){
        System.out.println("como");
    }
    
    public abstract void caminar();
    
    public abstract void comunicarse();
    
    public abstract int tiempoDeEmbarazo();

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
