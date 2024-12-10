package ejerciciogarage;

public class Coche {
    private Motor motor;
    private String marca;
    private String modelo;
    private double precioAcumuladoAverias;

    public Coche(String marca, String modelo, Motor motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.precioAcumuladoAverias = 0;
    }
    
    public void acumularAveria(){
        this.precioAcumuladoAverias = this.precioAcumuladoAverias + Math.random()*1000;
    }

    public Motor getMotor() {
        return motor;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecioAcumuladoAverias() {
        return precioAcumuladoAverias;
    }
}
