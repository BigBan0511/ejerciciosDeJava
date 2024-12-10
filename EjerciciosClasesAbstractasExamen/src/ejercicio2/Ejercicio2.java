package ejercicio2;

public class Ejercicio2 {
    
    public static void main(String[] args) {
        Mp3Player mp1 = new Mp3Player("negro", "china", 100, "detestable");
        Tv tv1 = new Tv(1000000000, "Madagascar", 1999, "Putrefacta");
        Libro l1 = new Libro(1945, "Mein Kampf", 300, "Majestuosa");
        Producto[] miArray = {tv1,l1,mp1};
    }
    
}
