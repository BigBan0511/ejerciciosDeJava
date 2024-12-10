package ejerciciosiniciales;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        
        //CONSIDERAMO EL 0 PAR y POSITIVO
        int elNumero;
        boolean par;
        boolean positivo;
        Scanner datos=new Scanner (System.in);
        System.out.println("Introduce el nº");
        elNumero=datos.nextInt();
        
        if(elNumero%2==0)
            par=true;
        else
            par=false;
        
        if(elNumero>=0)
            positivo=true;
        else
            positivo=false;
        
        if(par)
            System.out.println("El nº es par");
        else
            System.out.println("El nº es impar");
        
        if(positivo)
            System.out.println("El nº es positivo");
        else
            System.out.println("El nº es negativo");
            
    }
    
}
