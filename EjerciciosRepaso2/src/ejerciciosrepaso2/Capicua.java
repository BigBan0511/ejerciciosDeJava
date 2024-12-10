package ejerciciosrepaso2;

import java.util.Scanner;

public class Capicua {
    
    public static boolean esCapicua(int num) {
        boolean capicua = true;
        String numeroStr = Integer.toString(num);
        
        String inverso = "";
        for (int i = (numeroStr.length() - 1); i >= 0; i--) {
            inverso = inverso + numeroStr.charAt(i);
        }

        for (int i = 0; i < numeroStr.length(); i++) {
            for (int j = (numeroStr.length() - 1); j >=0; j--) {
                if(numeroStr.charAt(i) != inverso.charAt(j)){
                    capicua = false;
                }
            }
        }
        return capicua;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero de dos cifras o más");
        int numero = sc.nextInt();
        do {            
            if(numero < 10){
                System.out.println("El numero no es de dos cifras o mayor, escribelo otra vez");
                numero= sc.nextInt();
            }
        } while (numero < 10);
        
        if(esCapicua(numero)){
            System.out.println("El numero es capicua");
        }else{
            System.out.println("El numero no es capicua");
        }
        
    }
    
}
