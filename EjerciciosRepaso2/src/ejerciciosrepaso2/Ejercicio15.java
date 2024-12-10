package ejerciciosrepaso2;

import java.util.Scanner;

public class Ejercicio15 {

    public static void main(String[] args) {
        Scanner datos = new Scanner (System.in);
        System.out.println("Introduce el numero de passwords a generar:");
        int cantidad = datos.nextInt();
        Password [] misPass = new Password[cantidad];
        System.out.println("Introduce cual sera el tamaño de las password");
        int tam = datos.nextInt();
        boolean [] passFuerte = new boolean[cantidad];
        for (int x = 0; x < cantidad; x++) {
            //Genero password y guardo si es fuerte o no
            misPass[x] = new Password(tam);
            passFuerte[x] = misPass[x].esFuerte();
            System.out.print("Password: " + misPass[x].getContrasena());
            if(passFuerte[x]==true){
                System.out.println(" es fuerte");
            }else{
                System.out.println(" es debil");
            }
        }
    }
    
}
