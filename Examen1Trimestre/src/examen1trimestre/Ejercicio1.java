package examen1trimestre;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner datos=new Scanner(System.in);
        int numero=0;
        int contadorNum=0;
        int sumaTotal=0;
        int numMayor=0;
        int posMax=1;
        do{
            System.out.println("Introduce un numero");
            numero=datos.nextInt();
            if(numero>=0){
                contadorNum++;
                sumaTotal=sumaTotal+numero;
                if(numero>numMayor){
                numMayor=numero;
                posMax=contadorNum;
                }
            }
        }while (numero>=0);
        if (contadorNum>0){
            double media=sumaTotal/contadorNum;
            System.out.println("La cantidad de numeros positivos y 0 introducidos es: " + contadorNum);
            System.out.println("El numero mayor es: " + numMayor);
            System.out.println("El valor medio de todos ellos es: " + media);
            System.out.println("La posicion del valor maximo es: " + posMax);
        }else
            System.out.println("No has introducido ningun numero valido");
    }
    
}
