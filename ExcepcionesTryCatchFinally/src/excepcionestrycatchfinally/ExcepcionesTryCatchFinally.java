package excepcionestrycatchfinally;

import java.util.Scanner;

public class ExcepcionesTryCatchFinally {

    public static void main(String[] args) {
        //Vamos a intentar controlar un acceso a un array fuera de límites
        Scanner datos = new Scanner (System.in);
        System.out.println("Introduce el tamaño del array");
        try{
            int tam = datos.nextInt();
            int [] prueba = new int [tam];
            for (int x = 0; x < prueba.length; x++) {
                System.out.println("Introduce el elemento " + x + " del array");
                prueba[x] = datos.nextInt();
            }
            for (int x = 0; x < prueba.length; x++) {
                System.out.println(prueba[x]);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
