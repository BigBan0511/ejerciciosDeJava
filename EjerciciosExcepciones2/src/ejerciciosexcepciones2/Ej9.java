package ejerciciosexcepciones2;

import java.util.Scanner;

public class Ej9 {

    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        String sigue;
        int guardarNum = 0;
        int media = 0;
        int contador = 0;
        try{
            do {
                System.out.println("Introduce una nota");
                int nota = datos.nextInt();
                if(nota < 0 || nota > 10){
                    throw new NotaMal("La nota debe de estar entre 0 y 10");
                }
                contador ++;
                System.out.println("Desea seguir?");
                sigue = datos.next();
                if(!sigue.equalsIgnoreCase("S")){
                    throw new SoloAceptoS("Debes de introducir S");
                }
                guardarNum = guardarNum + nota;
            } while (sigue.equalsIgnoreCase("S"));
            media = guardarNum / contador;
        }catch(NotaMal e){
            System.out.println(e.getMessage());
        }catch(SoloAceptoS x){
            System.out.println(x.getMessage());
        }
    }
    
}
