package ejercicioclasesabstractas;

public class EjercicioClasesAbstractas2 {

    public static void main(String[] args) {
        Mp3Player mp3 = new Mp3Player("Amarillo", "Japon", 50, "Extraordinariamente mala");
        Tv tv1 = new Tv(55, "Japon", 1110, "Absurda");
        Libro l1 = new Libro(1945, "Mein Kampf", 3000, "Espectacular");
        
        Producto[] arrayProd = {mp3,tv1,l1};
        
        for (int x = 0; x < arrayProd.length; x++) {
            arrayProd[x].mostrarAtributos();
            System.out.println(" y el precio con descuento es " + arrayProd[x].precioConDescuento());
        }
        
    }
    
}
