package ejercicioscondicionales;

import java.util.Scanner;

public class EsFechaValidaTodos31{

    public static void main(String[] args) {
        Scanner datos=new Scanner(System.in);
        boolean diaValido, mesValido, añoValido;
        int dia, mes, año;
        System.out.println("Introduce un valor para el día:");
        dia=datos.nextInt();
        System.out.println("Introduce un valor para el mes:");
        mes=datos.nextInt();
        System.out.println("Introduce un valor para el año:");
        año=datos.nextInt();
        if(dia>0 && dia<=31){
            diaValido=true;
        }else{
            diaValido=false;
        }if(mes>0 && mes<=12)
            mesValido=true;
        else
            mesValido=false;
        if(año>0 && año<=9999)
            añoValido=true;
        else
            añoValido=false;
        System.out.println("El día introducido es el " + dia + 
                " y es valido=" + diaValido );
        System.out.println("El mes introducido es el " + mes + 
                " y es valido=" + mesValido );
        System.out.println("El año introducido es el " + año + 
                " y es valido=" + añoValido );
    }
    
}
