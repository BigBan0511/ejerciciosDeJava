package examen1trimestre;

import java.util.Scanner;

public class Ejercicio2 {
    //ZONA DE DECLARACION DE METODOS ESTATICOS
    public static Scanner datos=new Scanner(System.in);
    public static int limiteSuperior;
    public static int limiteInferior;
    
    //ZONA DE DECLARACION DE METODOS ESTATICOS
    public static int[] creaIniArray(){
        int tam;
        do{
            System.out.println("Introduce la longitud del array");
            tam=datos.nextInt();
        }while(tam<=0);
        int [] miArray = new int [tam];
        return miArray;
    }
    
    public static boolean esPrimoConLimite (int numero, int inf, int sup){
        boolean valido=true;
        if(numero<inf || numero>sup || numero==0){
            valido=false;
        }
        //Comenzamos en num-1 porque él mismo si se divide
        //Me paro en el 2 porque se que el 1 divide cualquier nº
        for (int x = numero-1; x>1; x--) {
            if(numero%x==0)
                valido=false;
        }
        return valido;
    }
    
    public static void pideLimites(){
        boolean valido=false;
        do {            
            System.out.println("Introduce el limite inferior");
            limiteInferior = datos.nextInt();
            System.out.println("Introduce el limite superior");
            limiteSuperior = datos.nextInt();
            if(limiteInferior>=0 && limiteSuperior>=0 && limiteInferior<limiteSuperior){
                valido=true;
            }else{
                System.out.println("Limites no validos, asegurate de que sean superiores a 0 y superior mayor que inferior");
            }
        } while (valido==false);
    }
    
    public static int[] rellenarArray(int[] miArray){
        int valor;
        for(int x=0; x<miArray.length; x++){
            do{
                System.out.println("Introduce el valor de la pos " + x);
                valor=datos.nextInt();
            }while (esPrimoConLimite(valor, limiteInferior, limiteSuperior)==false);
            miArray[x] = valor;
        }
        return miArray;
    }
    
    public static void mostrarArray(int [] miArray){
        for (int x = 0; x < miArray.length; x++) {
            System.out.println(miArray[x]);
        }
    }

    public static void main(String[] args) {
        int [] array1=creaIniArray();
        pideLimites();
        array1=rellenarArray(array1);
        mostrarArray(array1);
    }
    
}
