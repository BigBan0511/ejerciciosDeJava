package ejerciciosiniciales;
public class Ejercicio8 {

    public static void main(String[] args) {
        int sumaTotal=0;
        for(int x=1; x<=20; x++){
            System.out.println("El parcial es: " + sumaTotal + "+" + x);
            sumaTotal=sumaTotal+x;
            System.out.println(sumaTotal);
        }
        System.out.println("---------------");
        System.out.println(sumaTotal);
    }
}
