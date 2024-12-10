package ejerciciosdestring;

import java.util.Scanner;


public class Ejercicios11Adelante {

    public static Scanner datos=new Scanner(System.in);
    
    public static void ejercicio11(){
        System.out.println("Introduce la cadena total");
        String cadena1=datos.nextLine();       
        System.out.println("Introduce la subcadena");
        String cadena2=datos.nextLine();
        if(cadena1.startsWith(cadena2))
            System.out.println("OK");
        else
            System.out.println("NO OK");
    }
    
    public static void ejercicio11Ampliacion(){
        boolean fallo=false;
        System.out.println("Introduce la cadena total");
        String cadena1=datos.nextLine();       
        System.out.println("Introduce la subcadena");
        String cadena2=datos.nextLine();
        if(cadena1.length()<cadena2.length())
            System.out.println("Asi no...");
        else{
            //Recorro cada caracter de la cadena2 y lo comparo con el de
            //la cadena 1, si encuentro un caracter diferente pongo fallo a true
            for(int x=0; x<cadena2.length();x++){
                if(cadena2.charAt(x)!=cadena1.charAt(x))
                    fallo=true;
            } 
            if(fallo)
                System.out.println("NO OK");
            else
                System.out.println("OK");
        }
    }
    
    public static int cuentaEspacios(String laCadena){
        int cantidadPalabras=1;
        for(int x=0; x<laCadena.length();x++){
            if(laCadena.charAt(x)==' ')
                cantidadPalabras++;
        }
        return cantidadPalabras;
    }
    
    public static void ejercicio13(String nombreCompleto){
        String iniciales="";
        //Sabemos que el primer caracter es una inicial
        iniciales=iniciales+nombreCompleto.charAt(0);
        iniciales=iniciales+".";
        for(int x=1; x<nombreCompleto.length(); x++){
            if(nombreCompleto.charAt(x)==' '){
                //La siguiente letra es una inicial y la quiero
                //guardar en el String
                iniciales=iniciales+nombreCompleto.charAt(x+1);
                iniciales=iniciales+".";
            }
        }iniciales=iniciales.toUpperCase();
        System.out.println(iniciales);
    }
    
    public static String ejercicio14(String cadenaInicial){
        String cadenaInvertida="";
        for(int x=cadenaInicial.length()-1;x>=0;x--){
            cadenaInvertida=cadenaInvertida+cadenaInicial.charAt(x);
        }
        return cadenaInvertida;
    }
    
    public static String pideCadena(){
        System.out.println("Introduce una cadena de caracteres");
        String laCadena=datos.nextLine();
        return laCadena;
    }
    
    public static boolean ejercicio15(String cadena, String subcadena){
        if(subcadena.length()>cadena.length())
            return false;
        int matches=0;
        for(int x=0; x<cadena.length();x++){
            //Voy a ir recorriendo la cadena inicial
            if(cadena.charAt(x)==subcadena.charAt(0)){
                for(int y=0; y<subcadena.length();y++){
                    if(cadena.charAt(x+y)==subcadena.charAt(y))
                        matches++;
                    if(matches==subcadena.length())
                        return true;
                }
                matches=0;
            }
        }return false;
    }
    
    public static void main(String[] args) {
        //Puedo usar como parámetro de una función, otra función
        //siempre que lo que devuelva la segunda sea de la misma
        //naturaleza que el parámetro que necesita la primera
        //ejercicio13(pideCadena());
        //System.out.println(ejercicio14(pideCadena()));
        /*String cadenaNormal=pideCadena();
        String invertida=ejercicio14(cadenaNormal);
        System.out.println(invertida);*/
        boolean hayMatch=ejercicio15(pideCadena(), pideCadena());
        System.out.println(hayMatch);
    }

}
