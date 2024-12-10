package ejerciciosdeforanidados;


public class Ejercicio1 {

   
    public static void main(String[] args) {
        //El bucle exterior (el de las x) nos va a ir controlando
        //en que fila estamos, el bucle de las y nos controlará la
        //columno.
        //En cada pasada de y pintare un * y en cada pasada de x
        //al final haré un salto de línea.
        for(int x=0; x<4; x++){
            for(int y=0; y<4; y++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
