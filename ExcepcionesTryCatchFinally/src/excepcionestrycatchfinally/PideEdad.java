package excepcionestrycatchfinally;

import java.util.Scanner;

public class PideEdad {
    
    public static void pideEdad(){
        Scanner datos = new Scanner (System.in);
        System.out.println("Introduce tu edad");
        int edad = datos.nextInt();
        System.out.println(edad);
    }

    public static void main(String[] args) {
        try{
            pideEdad();
        }catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
        }
    }
    
}
