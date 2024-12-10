package ejercicioscondicionales2;

import java.util.Scanner;

public class ConversorEurosPesetas {

    public static void main(String[] args) {
        Scanner datos=new Scanner (System.in);
        System.out.println("¿Qué quieres convertir?");
        System.out.println("1- De Pesetas a Euros");
        System.out.println("2- De Euros a Pesetas");
        int opcion=datos.nextInt();
        if(opcion==1){
            System.out.println("Introduce la cantidad de pesetas a convertir");
            double pesetas=datos.nextDouble();
            System.out.println(pesetas + " Pesetas son " + pesetas/166.286 + " €");
        }else if(opcion==2){
            System.out.println("Introduce la cantidad de € a convertir en Pesetas");
            double euros=datos.nextDouble();
            System.out.println(euros + " euros son " + euros*166.286 + " Pesetas");
        }else{
            System.out.println("OPCIÓN NO VÁLIDA");
        }
    }
}
