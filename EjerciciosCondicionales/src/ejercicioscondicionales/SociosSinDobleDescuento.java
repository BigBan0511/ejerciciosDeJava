
package ejercicioscondicionales;

import java.util.Scanner;

public class SociosSinDobleDescuento {

    public static void main(String[] args) {
        final int cuotaBase=800;
        double cuotaFinal;
        //EN CASO DE QUE LOS MAYORES DE 65 TENGAN PADRES SOCIOS
        Scanner datos=new Scanner(System.in);
        System.out.println("Intyroduce tu edad:");
        int edad=datos.nextInt();
        if(edad<21){
            System.out.println("¿Son tus padres socios del club?");
            boolean padresSocios=datos.nextBoolean();
            if(padresSocios==true){
                //Cuando en un if no ponemos si tiene que ser V o F
                //siempre lo evalua como V
                cuotaFinal=cuotaBase-cuotaBase*0.45;
                cuotaFinal=cuotaFinal-cuotaFinal*0.25;
            }else{
                //Es menor de 21 años pero los padres NO SON SOCIOS
                cuotaFinal=cuotaBase-cuotaBase*0.25;
            }
        }else{
            //El soocio tiene más de 21 años
            if(edad>65){
                cuotaFinal=cuotaBase-cuotaBase*0.45;
            }else{
                //NO TIENEN NINGÚN DESCUENTO
                cuotaFinal=cuotaBase;
            }
        }
        //FUERA DE TODOS LOS IF
        System.out.println("La cuota de este socio es: " + cuotaFinal);
    }
} 

