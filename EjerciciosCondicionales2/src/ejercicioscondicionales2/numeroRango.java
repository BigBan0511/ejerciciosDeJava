package ejercicioscondicionales2;

import java.util.Scanner;

public class numeroRango {

    public static void main(String[] args) {
        Scanner datos=new Scanner (System.in);
        /*System.out.println("Introduce un nº para ver si está entre 1-100");
        int num=datos.nextInt();
        if(num>=1 && num<=100)
            System.out.println("Estás en rango");
        else
            System.out.println("No estás en rango");*/
        System.out.println("Introduce el límite inferior del rango");
        int limiteInf=datos.nextInt();
        System.out.println("Introduce el límite superior del rango");
        int limiteSup=datos.nextInt();
        //Voy a comprobar si los limites son buenos, y en caso
        //de que no lo sean los intercambio
        if(limiteInf>limiteSup){
            //Si esto ocurre, debo intercambiar los valores
            int auxiliar=limiteInf;
            limiteInf=limiteSup;
            limiteSup=auxiliar;
        }
        System.out.println("Introduce un nº para ver si está en rango");
        int num=datos.nextInt();
        if(num>=limiteInf && num<=limiteSup)
            System.out.println("El nº " + num + " está entre " 
                    + limiteInf + " y " + limiteSup);
        else
            System.out.println("ERROR: El nº " + num + " no está entre " 
                    + limiteInf + " y " + limiteSup);
    }
}
