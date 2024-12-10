package ejerciciosdeclasesi;

public class probarCuentaCorriente {

    public static void main(String[] args) {
        CuentaCorriente nuevaCuenta= new CuentaCorriente(20000, "Pedro Alfonso");
        nuevaCuenta.mostrarSaldoActual();
        
        nuevaCuenta.ingresarRetirarPrestamoDinero(2000000000);
        nuevaCuenta.mostrarSaldoActual();
    }
    
}
