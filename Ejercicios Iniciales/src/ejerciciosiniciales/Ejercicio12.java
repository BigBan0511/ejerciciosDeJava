package ejerciciosiniciales;

import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {
        Scanner datos=new Scanner(System.in);
        double media=0;
        int totalNum=0;
        int actual;
        do{
            System.out.println("Introduce una nota");
            actual=datos.nextInt();
            totalNum++;
            //Por ahora, la media actua como un totalSuma
            media=media+actual;
        }while(actual!=0);
        //Decremento el total para que no cuente el 0
        totalNum--;
        media=media/totalNum;
        System.out.println("La media de los nºs es: " + media);
        System.out.println("Has introducido " + totalNum + " nºs");
    }
    
}
