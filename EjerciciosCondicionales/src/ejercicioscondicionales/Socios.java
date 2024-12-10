package ejercicioscondicionales;

import java.util.Scanner;

public class Socios {

    public static void main(String[] args) {
        final int cuotaBase=800;
        double cuotaFinal;
        //EN CASO DE QUE LOS MAYORES DE 65 TENGAN PADRES SOCIOS
        Scanner datos=new Scanner(System.in);
        System.out.println("Intyroduce tu edad:");
        int edad=datos.nextInt();
        System.out.println("¿Son tus padres socios del club?");
        boolean padresSocios=datos.nextBoolean();
        if(padresSocios==false){
            //Los padres NO SON SOCIOS
            if(edad<21){
                cuotaFinal=cuotaBase-cuotaBase*0.25;
            }else if(edad>65){
                cuotaFinal=cuotaBase-cuotaBase*0.4;
            }else{
                //Tienes entre 21 y 65 años
                cuotaFinal=cuotaBase;
            }
        }else{
            //LOS PADRES SON SOCIOS
            //Aplicamos el descuento de tener padres socios
            cuotaFinal=cuotaBase-cuotaBase*0.45;
            if(edad<21){
                //Se aplican los dos descuentos
                cuotaFinal=cuotaFinal-cuotaFinal*0.25;
            }else if(edad>65){
                cuotaFinal=cuotaFinal-cuotaFinal*0.45;
            }
        }
        System.out.println("Tu cuota final es: " + cuotaFinal);
    }
    
}
