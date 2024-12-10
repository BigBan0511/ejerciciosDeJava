package expra;

import java.util.Scanner;

public class EXPRA {
    public static Scanner datos=new Scanner(System.in);
    public static int limiteInferior;
    public static int limiteSuperior;
    
    public static int [] creaIniArray(){
        int tam;
        int [] miArray;
        do{
        System.out.println("Introduce el tamaño del array");
        tam=datos.nextInt();
        miArray=new int [tam];
        }while(tam<=0);
        return miArray;
    }
    
    public static boolean esPrimoConLimite(int numero, int inf, int sup){
        boolean valido=true;
        if (numero>sup || numero<inf || numero==0){
            valido=false;
        }
        for (int x = numero-1; x > 1; x--) {
            if(numero%x==0){
                valido=false;
            }
        }
        return valido;
    }
    
    public static void pideLimites(){
        do {            
            System.out.println("Introduce el limite Superior");
            limiteSuperior=datos.nextInt();
            System.out.println("Introduce el limite Inferior");
            limiteInferior=datos.nextInt();
        } while (limiteSuperior<limiteInferior || limiteSuperior<0);
    }
    
    public static int [] rellenarArray(int [] miArray){
        int numero;
        for (int x = 0; x < miArray.length; x++) {
            do{
            System.out.println("Introduce el numero " + x);
            numero=datos.nextInt();
            }while(esPrimoConLimite(numero, limiteInferior, limiteSuperior)==false);
            miArray[x]=numero;
        }
        return miArray;
    }
    
    public static int[] mostrarArray(int[] miArray){
        for (int x = 0; x < miArray.length; x++) {
            System.out.println(miArray[x]);
        }
        return miArray;
    }

    public static void main(String[] args) {
        int [] miArrayXD=creaIniArray();
        pideLimites();
        miArrayXD=rellenarArray(miArrayXD);
        for (int x = 0; x < miArrayXD.length; x++) {
            System.out.println(miArrayXD[x]);
        }
    }
    
}
