package ejerciciosmetodos;

import java.util.Scanner;

public class EjerciciosMetodos {
    public static Scanner datos=new Scanner (System.in);
    
    public static int[] crearArray(){
        System.out.println("Introduce la longitud del array");
        int [] miArray=new int [datos.nextInt()];
        for (int x = 0; x < miArray.length; x++) {
            System.out.println("Introduce el valor " + x);
            miArray [x]=datos.nextInt();
        }
        return miArray;
}
    
    public static int sumaArray(int [] arrayASumar){
        int resultadoSuma=0;
        for (int x = 0; x < arrayASumar.length; x++) {
            resultadoSuma=resultadoSuma+arrayASumar[x];
        }
        return resultadoSuma;
    }
    
    public static int mayorEnArray(int [] arraicito){
        int numMayor=arraicito[0];
        for (int x = 0; x < arraicito.length; x++) {
            if (arraicito[x]>numMayor){
                numMayor=arraicito[x];
            }
        }
        return numMayor;
    }
    
    public static int sumaPares(int [] arrayASumarPares){
        int resultado=0;
        for (int x = 0; x < arrayASumarPares.length; x++) {
            if((arrayASumarPares[x]%2)==0){
                resultado= resultado + arrayASumarPares[x];
            }
        }
        return resultado;
    }
    
    public static int factorial(){
        System.out.println("Introduce un numero");
        int numero=datos.nextInt();
        int resultadoFactorial;
        int factorial=1;
        for (int x = numero; x > 0; x--) {
            factorial = factorial*x;
        }
        resultadoFactorial=factorial;
        System.out.println("El resultado es: " + resultadoFactorial);
        return resultadoFactorial;
    }
    
    public static int cambiarParametroInt(){
        System.out.println("Introduce un valor entero");
        int num=datos.nextInt();
        num=num+1;
        return num;
    }

    public static void main(String[] args) {
        int [] x=crearArray();
        int laSuma=sumaArray(x);
        System.out.println("El resultado de la suma del array es: " + laSuma);
        
        int numeroMayor=mayorEnArray(x);
        System.out.println("El mayor valor del array es: " + numeroMayor);
        
        int laSumaPares=sumaPares(x);
        System.out.println("El resultado de la suma de los pares es: " + laSumaPares);
    }
    
}
