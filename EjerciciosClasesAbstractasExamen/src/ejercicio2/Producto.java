package ejercicio2;

public abstract class Producto {
    private double precioNormal;
    private String calidad;

    public Producto(double precioNormal, String calidad) {
        this.precioNormal = precioNormal;
        this.calidad = calidad;
    }
    
    public abstract double precioConDescuento();

    public String toString() {
        return "El precio es: " + this.precioNormal + "\n calidad: " + this.calidad;
    }

    public double getPrecioNormal() {
        return precioNormal;
    }

    public void setPrecioNormal(double precioNormal) {
        this.precioNormal = precioNormal;
    }

    public String getCalidad() {
        return calidad;
    }

    public void setCalidad(String calidad) {
        this.calidad = calidad;
    }
}
