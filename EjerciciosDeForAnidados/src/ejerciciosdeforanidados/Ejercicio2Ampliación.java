package ejerciciosdeforanidados;

import java.util.Scanner;


public class Ejercicio2Ampliación {

   
    public static void main(String[] args) {
        Scanner datos=new Scanner (System.in);
        boolean salida=false;
        int base, altura;
        do{
            //Dentro del bucle tendré la petición de datos
            System.out.println("Introduce la base del rectángulo");
            base=datos.nextInt();
            System.out.println("Introduce la altura lado del rectángulo");
            altura=datos.nextInt();
            //Vamos a comprobar que los datos son correctos
            //si lo son cambio salida y sino no
            if(base>0 && altura>0 && base>altura)
                salida=true;
            else
                System.out.println("Datos incorrectos");
        }while(salida==false);
        //Una vez tenemos los valores correctos vamos a resolver
        for(int x=0; x<altura; x++){
            //El primer for representa las filas 
            for(int y=0; y<base; y++){
                //Este segundo for representa las columnas
                System.out.print("* ");
            }
            //Saltamos de linea para ir a la siguiente fila
            System.out.println();
        }
        
        
    }

}
