package teatro;

import java.util.ArrayList;
import java.util.Scanner;

public class Teatro {
    private ArrayList <Entradas> lasEntradas;
    private double recaudacion;

    public Teatro() {
        this.lasEntradas=new ArrayList<>(7);
        this.recaudacion=0;
    }
    
    //Vamos a hacer que añadir espectculo llene de espectáculos el array
    public void añadirEspectaculo(){
        int posicion=1;
        do{
            //Genero un nº entre 1 y 3
            int tipoEspectaculo=(int)(Math.random()*3)+1;
            switch (tipoEspectaculo){
                case 1:
                    //Si ha salido 1 genero la entrada de Opera
                    EntradaOpera entradaOpera=new EntradaOpera();
                    //Para poder meter la entrada dentro del array
                    if(posicion==entradaOpera.getNumDia()){
                        //En este caso añadimos al array, podemos añadirla por polimorfismo
                        this.lasEntradas.add(entradaOpera);
                        posicion++;
                    }break;
                case 2:
                    EntradasConcierto entradaConcierto=new EntradasConcierto();
                    if(posicion==entradaConcierto.getNumDia()){
                        this.lasEntradas.add(entradaConcierto);
                        posicion++;
                    }break;
                case 3:
                    EntradaTeatro entradaTeatro=new EntradaTeatro();
                    if(posicion==entradaTeatro.getNumDia()){
                        this.lasEntradas.add(entradaTeatro);
                        posicion++;
                    }break;
            }
        }while(posicion<8);
    }
    
    public void mostrarEspectaculos(){
        for(Entradas actual : this.lasEntradas)
            actual.mostrarEntradas();
    }
    
    public void vendeEntrada(){
        Scanner datos=new Scanner(System.in);
        System.out.println("¿Para qué día quieres comprar la entrada?");
        char dia=datos.next().toUpperCase().charAt(0);
        switch (dia){
            case 'L':
                //hay que comprobar que quedan entradas
                if(this.lasEntradas.get(0).getCantidad()>0){
                    this.lasEntradas.get(0).ventaEntradas();
                    this.recaudacion=this.recaudacion+this.lasEntradas.get(0).getPrecio();
                }else{
                    System.out.println("No quedan entradas para ese día");
                }break;
            case 'M':
                //hay que comprobar que quedan entradas
                if(this.lasEntradas.get(1).getCantidad()>0){
                    this.lasEntradas.get(1).ventaEntradas();
                    this.recaudacion=this.recaudacion+this.lasEntradas.get(0).getPrecio();
                }else{
                    System.out.println("No quedan entradas para ese día");
                }break;
            case 'X':
                //hay que comprobar que quedan entradas
                if(this.lasEntradas.get(2).getCantidad()>0){
                    this.lasEntradas.get(2).ventaEntradas();
                    this.recaudacion=this.recaudacion+this.lasEntradas.get(0).getPrecio();
                }else{
                    System.out.println("No quedan entradas para ese día");
                }break;
            case 'J':
                //hay que comprobar que quedan entradas
                if(this.lasEntradas.get(3).getCantidad()>0){
                    this.lasEntradas.get(3).ventaEntradas();
                    this.recaudacion=this.recaudacion+this.lasEntradas.get(0).getPrecio();
                }else{
                    System.out.println("No quedan entradas para ese día");
                }break;
            case 'V':
                //hay que comprobar que quedan entradas
                if(this.lasEntradas.get(4).getCantidad()>0){
                    this.lasEntradas.get(4).ventaEntradas();
                    this.recaudacion=this.recaudacion+this.lasEntradas.get(0).getPrecio();
                }else{
                    System.out.println("No quedan entradas para ese día");
                }break;
            case 'S':
                //hay que comprobar que quedan entradas
                if(this.lasEntradas.get(5).getCantidad()>0){
                    this.lasEntradas.get(5).ventaEntradas();
                    this.recaudacion=this.recaudacion+this.lasEntradas.get(0).getPrecio();
                }else{
                    System.out.println("No quedan entradas para ese día");
                }break;
            case 'D':
                //hay que comprobar que quedan entradas
                if(this.lasEntradas.get(6).getCantidad()>0){
                    this.lasEntradas.get(6).ventaEntradas();
                    this.recaudacion=this.recaudacion+this.lasEntradas.get(0).getPrecio();
                }else{
                    System.out.println("No quedan entradas para ese día");
                }break;
            default:
                System.out.println("Día no válido");
        }
    }
    
}
