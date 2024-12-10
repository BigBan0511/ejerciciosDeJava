package ejerciciosdeforanidados;
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner datos=new Scanner (System.in);
        System.out.println("Introduce la base de triángulo");
        int base=datos.nextInt();
        if(base<15 && base>0){
            //dibujamos el triángulo
            for(int x=0; x<base; x++){
                for(int y=0; y<base-x; y++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }else
            System.out.println("Base NO VÁLIDA");
    }

}
