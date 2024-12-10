package ejercicio2;

public class Tv extends ProductoElectronico{
    private int tamaño;

    public Tv(int tamaño, String madeIn, double precioNormal, String calidad) {
        super(madeIn, precioNormal, calidad);
        this.tamaño = tamaño;
    }

    @Override
    public double precioConDescuento() {
        return 500;
    }

    @Override
    public int tiempoDeGarantia() {
        return 5;
    }
    
    
}
