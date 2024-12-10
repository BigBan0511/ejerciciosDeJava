
package ejercicioscondicionales2;

import java.util.Scanner;

public class ClificaExamen {

    public static void main(String[] args) {
        Scanner datos=new Scanner (System.in);
        System.out.println("Introduce la nota");
        int nota=datos.nextInt();
        if(nota>=90 && nota<=100)
            System.out.println("Tu nota es una A");
        else if(nota>=80 && nota<=89)
            System.out.println("Tu nota es una B");
        else if(nota>=70 && nota<=79)
            System.out.println("Tu nota es una C");
        else if(nota>=60 && nota<=69)
            System.out.println("Tu nota es una D");
        else if(nota<60 && nota>=0)
            System.out.println("Tu nota es una F");
        else 
            System.out.println("NOTA NO VÁLIDA");
    }
    
}
