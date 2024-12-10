package ejercicioclasesabstractas;

public class Mp3Player extends ProductoElectronico{
    private String color;

    public Mp3Player(String color, String madeIn, double precioNormal, String calidad) {
        super(madeIn, precioNormal, calidad);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public int tiempoDeGarantia() {
        return 2;
    }

    @Override
    public double precioConDescuento() {
        return 25;
    }

    @Override
    public void mostrarAtributos() {
        super.mostrarAtributos();
        System.out.print("  y el mp3 es de color " + this.color);
    }
    
    
}
