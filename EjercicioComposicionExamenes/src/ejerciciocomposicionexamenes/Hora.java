package ejerciciocomposicionexamenes;

public class Hora {
    private int hora;
    private int minuto;

    public Hora(int hora, int minuto) {
        this.hora = hora;
        this.minuto = minuto;
    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }
    
    public String toString(){
        return this.hora+":"+this.minuto;
    }

    
    public void nuevaHora(int hora, int minuto) {
        this.hora = hora;
        this.minuto = minuto;
    }
    
    
    
    
    
}
