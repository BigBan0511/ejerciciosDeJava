package calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner datos=new Scanner (System.in);
        System.out.println("Que desea realizar?");
        System.out.println("1.Suma");
        System.out.println("2.Resta");
        System.out.println("3.Multiplicacion");
        System.out.println("4.Division");
        System.out.println("0.Salir");
        String eleccion=datos.next();
        switch (eleccion){
            case "Suma", "1", "suma", "SUMA":
                System.out.println("Introduce el primer valor");
                int s1=datos.nextInt();
                System.out.println("Introduce el segundo valor");
                int s2=datos.nextInt();
                
                int resultado=s1+s2;
                
                System.out.println("El resultado es: " + resultado);
                break;
            case "Resta", "2", "resta", "RESTA":
                System.out.println("Introduce el primer valor");
                s1=datos.nextInt();
                System.out.println("Introduce el segundo valor");
                s2=datos.nextInt();
                
                resultado=s1-s2;
                
                System.out.println("El resultado es: " + resultado);
                break;
                
            case "Multiplicacion", "3", "multiplicacion", "MULTIPLICACION":
                System.out.println("Introduce el primer valor");
                s1=datos.nextInt();
                System.out.println("Introduce el segundo valor");
                s2=datos.nextInt();
                
                resultado=s1*s2;
                
                System.out.println("El resultado es: " + resultado);
                break;
                
            case "Division", "4", "division", "DIVISION":
                System.out.println("Introduce el dividendo");
                double s1Division=datos.nextInt();
                System.out.println("Introduce el divisor");
                double s2Division=datos.nextInt();
                
                double resultadoDivision=s1Division/s2Division;
                
                System.out.println("El resultado es: " + resultadoDivision);
                break;
                
            case "0", "Salir", "SALIR":
                break;
                
            default:
                System.out.println("Opcion no valida, vuelve a intentarlo");
        }
    }
    
}
