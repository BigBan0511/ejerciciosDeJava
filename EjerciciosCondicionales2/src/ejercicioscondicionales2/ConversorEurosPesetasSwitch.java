package ejercicioscondicionales2;

import java.util.Scanner;

public class ConversorEurosPesetasSwitch {

    public static void main(String[] args) {
        Scanner datos=new Scanner (System.in);
        System.out.println("¿Qué quieres convertir?");
        System.out.println("1- De Pesetas a Euros");
        System.out.println("2- De Euros a Pesetas");
        int opcion=datos.nextInt();
        switch(opcion){
            case 1:
                System.out.println("Introduce la cantidad de pesetas a convertir");
                double pesetas=datos.nextDouble();
                System.out.println(pesetas + " Pesetas son " + pesetas/166.286 + " €");
            break;
            case 2:
                System.out.println("Introduce la cantidad de € a convertir en Pesetas");
                double euros=datos.nextDouble();
                System.out.println(euros + " euros son " + euros*166.286 + " Pesetas");
            break;
            default:
                System.out.println("OPCIÓN NO VÁLIDA");
            break;
        }
    }
    
}
