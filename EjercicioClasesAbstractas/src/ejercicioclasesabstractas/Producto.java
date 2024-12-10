package ejercicioclasesabstractas;

public abstract class Producto {
    private double precioNormal;
    private String calidad;

    public Producto(double precioNormal, String calidad) {
        this.precioNormal = precioNormal;
        this.calidad = calidad;
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
    
    public abstract double precioConDescuento();
    
    public void mostrarAtributos(){
        System.out.println("El precio es de " + this.precioNormal + " y es de calidad " + this.calidad);
    }
}
