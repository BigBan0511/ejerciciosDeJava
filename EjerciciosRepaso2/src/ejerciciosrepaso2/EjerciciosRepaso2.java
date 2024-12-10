package ejerciciosrepaso2;

import java.util.Scanner;


public class EjerciciosRepaso2 {
    
    public static String getNombreClase(){
        return "EjerciciosRepaso2";
    }
    
    public static void pintarEscalera(String cadena){
        //Tenemos que pintar tantas líneas como caracteres tenga mi cadena
        for(int x=0; x<cadena.length();x++){
            //Este bucle controla la línea que quiero pintar 
            for(int y=0; y<cadena.length()-x;y++){
                //Este segundo for es el que pinta sin saltar linea
                System.out.print(cadena.charAt(y));
            //Cuando ya he pintado, hago el salto de linea
            }System.out.println();
        }
    }
    
    public static void pintarEscaleraEliminaPimer(String cadena){
        //Tenemos que pintar tantas líneas como caracteres tenga mi cadena
        for(int x=0; x<cadena.length();x++){
            //Este bucle controla la línea que quiero pintar 
            for(int y=x; y<cadena.length();y++){
                //Este segundo for es el que pinta sin saltar linea
                System.out.print(cadena.charAt(y));
            //Cuando ya he pintado, hago el salto de linea
            }System.out.println();
        }
    }
    
    public static Scanner datos=new Scanner(System.in);
    public static boolean esCapicua(){
        boolean capicua=true;
        System.out.println("Introduce un número");
        String elNum=datos.next();
        for(int x=0; x<elNum.length()/2; x++){
            if(elNum.charAt(x)!=elNum.charAt(elNum.length()-1-x))
                capicua=false;
        }
        return capicua;
    }
    
    public static boolean esCapicuaNeg(){
        boolean capicua=true;
        System.out.println("Introduce un número");
        String elNum=datos.next();
        if(elNum.charAt(0)=='-'){
            String aux="";
            for(int x=1; x<elNum.length();x++){
                aux=aux+elNum.charAt(x);
            }
            elNum=aux;
        }for(int x=0; x<elNum.length()/2; x++){
            if(elNum.charAt(x)!=elNum.charAt(elNum.length()-1-x))
                capicua=false;
        }
        return capicua;
            
        
    }
    
    public static boolean esCapicua2(){
        System.out.println("Introduce un número");
        String elNum=datos.next();
        //Creo otro String vacio y recorro el primero al revés, voy pegando los
        //valores en el nuevo String y al final comparo.
        String reverso="";
        for(int x=elNum.length()-1;x>=0; x--)
            reverso=reverso+elNum.charAt(x);
        boolean capicua=elNum.equals(reverso);
        return capicua;
    }
    
    public static void alturas(int cantidad){
        int [] lasAlturas=new int [cantidad];
        int media=0;
        int inf=0;
        int sup=0;
        for(int x=0; x<lasAlturas.length;x++){
            System.out.println("Introduce una altura nº" + (x+1));
            lasAlturas[x]=datos.nextInt();
            media=media+lasAlturas[x];
        }media=media/cantidad;
        for(int x=0; x<lasAlturas.length;x++){
            if(lasAlturas[x]>media)
                sup++;
            else if(lasAlturas[x]<media)
                inf++;
        }
        System.out.println("Se han contado " + inf + " alturas inferiores a la media");
        System.out.println("Se han contado " + sup + " alturas superiores a la media");
    }

   
    public static void main(String[] args) {
        /*String c=" Hola soy Juanito    ";
        String [] prueba=c.split(" ");
        String aux="";
        for(int x=0; x<prueba.length-1;x++){
            aux=aux+prueba[x];
            aux=aux+" ";
        }
            
        System.out.println(aux);*/
        EjerciciosRepaso2.esCapicua();
    }

}
