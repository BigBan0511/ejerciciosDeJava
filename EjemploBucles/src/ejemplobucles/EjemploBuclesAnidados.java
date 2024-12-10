package ejemplobucles;

public class EjemploBuclesAnidados {

    public static void main(String[] args) {
        //Vamos a hacer bucles anidados, esto significa que
        //por cada iteración del bucle exterior, yo voy a ejecutar
        //todas las iteraciones del bucle interior
        
        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < 10; y++) {
                System.out.println("Estamos en x= " +x);
                System.out.println("Estamos en y= " +y);
            }
        }
    }
    
}
