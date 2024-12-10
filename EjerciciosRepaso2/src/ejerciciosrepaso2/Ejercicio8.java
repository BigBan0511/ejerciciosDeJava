package ejerciciosrepaso2;

public class Ejercicio8 {
    public static String letras = "ZYXWVUTSRQPONMLKJIHGFEDCBA";
    public static String cambio = "";

    public static void main(String[] args) {
        for (int x = 0; x < 26; x++) {
            for (int y = x; y < 26; y++) {
                System.out.print(letras.charAt(y));
            }
            System.out.println();
        }
    }
}
