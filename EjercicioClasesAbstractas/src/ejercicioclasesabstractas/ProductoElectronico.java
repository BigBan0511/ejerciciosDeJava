package ejercicioclasesabstractas;

public abstract class ProductoElectronico extends Producto{
    private String madeIn;

    public ProductoElectronico(String madeIn, double precioNormal, String calidad) {
        super(precioNormal, calidad);
        this.madeIn = madeIn;
    }

    public String getMadeIn() {
        return madeIn;
    }

    public void setMadeIn(String madeIn) {
        this.madeIn = madeIn;
    }
    
    public abstract int tiempoDeGarantia();
}
