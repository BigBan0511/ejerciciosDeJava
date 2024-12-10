package ejercicio2;

public class Mp3Player extends ProductoElectronico{
    private String color;

    public Mp3Player(String color, String madeIn, double precioNormal, String calidad) {
        super(madeIn, precioNormal, calidad);
        this.color = color;
    }

    @Override
    public double precioConDescuento() {
        return 25;
    }

    @Override
    public int tiempoDeGarantia() {
        return 3;
    }

    @Override
    public String toString() {
        return super.toString() + this.color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
}
