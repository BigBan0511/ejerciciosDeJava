package examenanteriores2t;

import java.util.Scanner;

public class DestinoCercanias extends Destinos{
    private String comunidad;

    public DestinoCercanias() {
        super();
        this.comunidad = "";
        Scanner datos = new Scanner(System.in);
        boolean valido = false;
        do {            
            try {
                datos = new Scanner(System.in);
                System.out.println("Introduzca el nombre del destino");
                nombreDestino = datos.nextLine();
                if(nombreDestino.equals("")){
                    throw new Exception();
                }
                System.out.println("Introduzca el numero de billetes");
                numBilletes = datos.nextInt();
                if(numBilletes == 0){
                    throw new Exception();
                }
                System.out.println("Introduzca el precio del billete");
                precioBillete = datos.nextDouble();
                if(precioBillete == 0){
                    throw new Exception();
                }
                System.out.println("Introduzca la comunidad de destino");
                datos = new Scanner(System.in);
                this.comunidad = datos.nextLine();
                if(this.comunidad.equals("")){
                    throw new Exception();
                }
                valido = true;
            } catch (Exception e) {
                System.out.println("Has introducido mal los datos, introducelos de nuevo");
            }
        } while (valido == false);
    }
    
    public void mostrarDestino(){
        System.out.println("Destino de cercanias a " + this.nombreDestino
                                    + "\nEn la comunidad " + this.comunidad
                                    + "\nPor un precio de " + this.precioBillete
                                    + "\nDel que quedan " + this.numBilletes + " billetes");
    }
}
