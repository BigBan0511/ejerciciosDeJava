package calculadora;

import java.util.Scanner;

public class CalculadoraSinString {

    public static void main(String[] args) {
        Scanner datos=new Scanner (System.in);
        System.out.println("Que desea realizar?");
        System.out.println("1.Suma");
        System.out.println("2.Resta");
        System.out.println("3.Multiplicacion");
        System.out.println("4.Division");
        System.out.println("0.Salir");
        int eleccion=datos.nextInt();
        int s1,s2,resultado;
        if (eleccion==0)
            System.out.println("Gracias por usar la calculadora 1DAW");
        else{
        do{
            if(eleccion!=1 && eleccion!=2 && eleccion!=3 && eleccion!=4){
            System.out.println("Que desea realizar?");
            System.out.println("1.Suma");
            System.out.println("2.Resta");
            System.out.println("3.Multiplicacion");
            System.out.println("4.Division");
            System.out.println("0.Salir");
            eleccion=datos.nextInt();
        }
            
        }while(eleccion!=1 && eleccion!=2 && eleccion!=3 && eleccion!=4);
        if(eleccion==1){
                System.out.println("Introduce el primer valor");
                s1=datos.nextInt();
                System.out.println("Introduce el segundo valor");
                s2=datos.nextInt();
                
                resultado=s1+s2;
                
                System.out.println("El resultado es: " + resultado);
                eleccion=0;
            }else if(eleccion==2){
                System.out.println("Introduce el primer valor");
                s1=datos.nextInt();
                System.out.println("Introduce el segundo valor");
                s2=datos.nextInt();
                
                resultado=s1-s2;
                
                System.out.println("El resultado es: " + resultado);
                eleccion=0;
                
            }else if(eleccion==3){
                System.out.println("Introduce el primer valor");
                s1=datos.nextInt();
                System.out.println("Introduce el segundo valor");
                s2=datos.nextInt();
                
                resultado=s1*s2;
                
                System.out.println("El resultado es: " + resultado);
                eleccion=0;
            }else if(eleccion==4){
                System.out.println("Introduce el dividendo");
                double s1Division=datos.nextInt();
                System.out.println("Introduce el divisor");
                double s2Division=datos.nextInt();
                
                double resultadoDivision=s1Division/s2Division;
                
                System.out.println("El resultado es: " + resultadoDivision);
                eleccion=0;
            } 
                    }
        
        }
}
