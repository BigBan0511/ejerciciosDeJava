package ejercicioscondicionales;
import java.util.Scanner;

public class EscribeOrdenadosTresNumeros {

    public static void main(String[] args) {
        Scanner datos=new Scanner(System.in);
        double x, y, z;
        System.out.println("Introduce el valor de la x:");
        x=datos.nextDouble();
        System.out.println("Introduce el valor de la y:");
        y=datos.nextDouble();
        System.out.println("Introduce el valor de la z:");
        z=datos.nextDouble();
        //Voy a apostar que la x es el nº más grande
        if(x>y && x>z){
            //Si entro dentro de este if la x es la mayor
            //compruebo si y es mayor que z
            if(y>z){
                //Ya se que el orden es x,y,z
                System.out.println(x + ", " + y + ", " + z);
            }else{
                //Ya sabemos que z es mayor que y
                //Ya tenemos el orden x, z, y
                System.out.println(x + ", " + z + ", " + y);
            }
            //Apuesto a que la y es el más grande
        }else if(y>x && y>z){
            //Ya sabemos que la y es la más grande
            if(x>z){
                //Comprobamos si la x es el segundo
                System.out.println(y + ", " + x + ", " + z);
            }else{
                //Si esntro en este else la z es mayor que la x
                System.out.println(y + ", " + z + ", " + x);
            }
        }else{
            //Ya sabemos que la z es la más grande
            //Solo compruebo quien es mayor entre x e y
            if(x>y){
                System.out.println(z + ", " + x + ", " + y);
            }else{
                System.out.println(z + ", " + y + ", " + x);
            }
        }
    }
    
}
