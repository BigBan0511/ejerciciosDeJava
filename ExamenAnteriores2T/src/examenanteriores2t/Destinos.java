package examenanteriores2t;

public abstract class Destinos {
    protected String nombreDestino;
    protected int numBilletes;
    protected double precioBillete;

    public Destinos() {
        this.nombreDestino = "";
        this.numBilletes = 0;
        this.precioBillete = 0;
    }

    public String getNombreDestino() {
        return nombreDestino;
    }
    
}
