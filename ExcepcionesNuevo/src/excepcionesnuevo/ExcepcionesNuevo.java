package excepcionesnuevo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExcepcionesNuevo {

    public static void main(String[] args) {
        //Ejercicio 6 Ampliado
        boolean salida = false;
        while(salida == false){
            try {
                solicitaNombreEdad();
                salida = true;
            } catch (AñosNoValidosException e) {
                System.out.println(e.getMessage());
            }catch (ValorVacioNombreException a){
                System.out.println(a.getMessage());
            }catch (InputMismatchException x){
                System.out.println("Introduce una letra");
            }
        }
    }
    
    public static void solicitaNombreEdad() throws ValorVacioNombreException, AñosNoValidosException, InputMismatchException{
        Scanner datos = new Scanner(System.in);
        System.out.println("Introduce tu nombre: ");
        String nombre = datos.nextLine();
        System.out.println("Introduce tu edad: ");
        int edad = datos.nextInt();
        if(edad<0 || edad>122){
            throw new AñosNoValidosException("Debes introducir una edad entre 0 y 122");
        }else if(nombre.isBlank()){
            throw new ValorVacioNombreException("Debes introducir un nombre tonto");
        }else if(edad < 18){
            System.out.println("Eres menor de edad");
        }else if(edad > 17 && edad < 65){
            System.out.println("Eres un adulto");
        }else if(edad > 64){
            System.out.println("Eres un viejo");
        }
    }
    
}
