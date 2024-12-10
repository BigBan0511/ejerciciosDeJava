package ejercicioscondicionales;

import java.util.Scanner;

public class EsFechaValidaControlaMeses {

    /*
        MESES CON 31 DíAS: Enero, Marzo, Mayo, Julio, Agosto,
        Octubre y Diciembre (1,3,5,7,8,10,12)
        MESES CON 30 DÍAS:  (4, 6, 9, 11)
        MES CON 28 DÍAS: 2
     */
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        boolean diaValido = false, mesValido = false, añoValido = false;
        int dia, mes, año;
        System.out.println("Introduce un valor para el día:");
        dia = datos.nextInt();
        System.out.println("Introduce un valor para el mes:");
        mes = datos.nextInt();
        System.out.println("Introduce un valor para el año:");
        año = datos.nextInt();
        //PRIMER COMPRUEBO EN QUE MES ESTOY
        if (mes > 0 && mes <= 12){
            //El mes es correcto
            mesValido = true;
            if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8
                    || mes == 10 || mes == 12){
                //Estos son los meses de 31 días, debo comprobar que
                //el día sea correcto.
                if (dia > 0 && dia <= 31){
                    //Este día es correcto
                    diaValido = true;
                }
            }else if (mes == 2){
                if(dia>0 && dia<=28)
                    diaValido=true;
            }else{
                //Si entro else estoy en los meses de 30 días
                if(dia>0 && dia<=30)
                    diaValido=true;
            }
        }if(año>0 && año<=9999)
            añoValido=true;
        System.out.println("El dia es " + dia + ", es valido: " + diaValido);
        System.out.println("El mes es " + mes + ", es valido: " + mesValido);
        System.out.println("El año es " + año + ", es valido: " + añoValido);
    }
    
}
