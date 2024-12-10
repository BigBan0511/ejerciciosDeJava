package ejerciciosstrings;

import java.util.Scanner;

public class Ej6AmpliadoConMetodos {

    //Las variables estáticas están fuera de cualquier función y pueden ser
    //usadas por cualquier función estática.
    public static Scanner datos= new Scanner (System.in);

    //Esta función para hacer su trabajo necesita recibir como parámetro
    //una cadena. Los parámetros van entre paréntesis y les pongo
    //el nombre que me de la gana.
    public static int pedirSubCadenas(String laCadena){
        //Cuerpo de la función
        int subcadenas;
        do{
            System.out.println("Introduce el numero de subcadenas que deseas cortar");
            subcadenas=datos.nextInt();
        }while(subcadenas<2 || subcadenas>laCadena.length());
        
        return subcadenas;
    }
    
    public static String pideCadena(){
        String cadena;
        do{
            System.out.println("Introduce la cadena a trocear");
            cadena=datos.nextLine();
        }while (cadena.length()<2);
        return cadena;
    }
    
    public static void main(String[] args) {
        //Para llamar a una función, debemos poner su nombre y los parámetros
        //que necesite para funcionar.
        String cadena=pideCadena();
        int numSubCadenas=pedirSubCadenas(cadena);
        System.out.println("Vamos a hacer " + numSubCadenas + " subcadenas");
    }
    
}
