package ejercicio2interfaces;

public class Ejercicio2Interfaces {

    public static void main(String[] args) {
        
    }
    
    public static int cuentaPrestados(Object[] p1){
        int contador = 0;
        for (Object publicacion : p1) {
            if (publicacion instanceof Prestable) {
                Prestable prestable = (Prestable) publicacion;
                if (prestable.prestado()) {
                    contador++;
                }
            }
        }
        return contador;
    }
    
}
