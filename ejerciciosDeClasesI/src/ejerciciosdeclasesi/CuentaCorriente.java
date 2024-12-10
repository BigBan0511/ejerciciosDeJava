package ejerciciosdeclasesi;

import java.util.Scanner;

public class CuentaCorriente {
    public Scanner datos=new Scanner(System.in);
    
    private int saldoActual;
    private String nombreTitular;
    
    public CuentaCorriente(int elSaldoActual, String elNombreTitular){
        nombreTitular=elNombreTitular;
        saldoActual=elSaldoActual;
    }
    
    public int ingresarRetirarPrestamoDinero(int cantidad){
        System.out.println("Que operacion desea realizar: 1.Ingresar, 2.Retirar o 3.Prestamo");
        String eleccion = datos.nextLine();
        switch (eleccion) {
            case "1", "ingresar", "Ingresar", "INGRESAR":
                if(cantidad<0){
                    System.out.println("No puede ingresar numeros negativos");
                }else{
                    this.saldoActual = this.saldoActual+cantidad;
                }
                break;
            case "2", "retirar", "Retirar", "RETIRAR":
                if(this.saldoActual<=0){
                    System.out.println("No dispone de saldo para retirar");
                }else{
                    if(cantidad<0){
                        System.out.println("No puede retirar numeros negativos");
                    }else{
                        this.saldoActual = this.saldoActual-cantidad;
                    }
                }
                break;
            case "3", "Prestamo", "prestamo", "PRESTAMO":
                if(this.saldoActual>=10000){
                    if(cantidad<0){
                        System.out.println("No puede pedir un prestamo de numeros negativos");
                    }else{
                        this.saldoActual = this.saldoActual+cantidad;
                    }
                }else{
                    System.out.println("No tiene saldo suficiente para realizar un prestamo");
                }
                break;
            default:
                System.out.println("La operacion elegida no se puede hacer");
        }
        
        return cantidad;
    }
    
    public void mostrarSaldoActual(){
        System.out.println("Hola " +nombreTitular +  " su saldo es de " + saldoActual + " euros");
    }
    
    public void setSaldoActual(int parametroSaldoActual){
        this.saldoActual=parametroSaldoActual;
    }
    
    public void setNombreTitular(String parametroNombreTitular){
        this.nombreTitular=parametroNombreTitular;
    }
    
    public int getSaldoActual(){
        return saldoActual;
    }
    
    public String getNombreTitular(){
        return nombreTitular;
    }
    
    
}
