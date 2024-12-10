package ejerciciorepasoentradasteatro;

import java.util.ArrayList;
import java.util.Scanner;

public class Teatro{
    private ArrayList <Entradas> entradas;
    private double recaudacion;

    public Teatro() {
        this.entradas = new ArrayList<>(7);
        this.recaudacion = 0;
    }
    
    //Vamos a hacer que añadir expectaculo llene de espectaculos el array
    public void añadirExpectaculo(){
        int posicion = 1;
        do {            
            int tipoEspectaculo = (int)(Math.random()*3)+1;
            switch (tipoEspectaculo) {
                case 1:
                    EntradasOpera entradaOpera = new EntradasOpera();
                    if(posicion==entradaOpera.getDia()){
                        this.entradas.add(entradaOpera);
                        posicion++;
                    }break;
                case 2:
                    EntradaConcierto c1 = new EntradaConcierto();
                    if(posicion==c1.getDia()){
                        this.entradas.add(c1);
                        posicion++;
                    }break;
                case 3:
                    EntradaTeatro entradaTeatro = new EntradaTeatro();
                    if(posicion==entradaTeatro.getDia()){
                        this.entradas.add(entradaTeatro);
                        posicion++;
                    }break;
            }
        } while (posicion<8);
    }
    
    public void mostrarExpectaculo(){
        for (Entradas actual : this.entradas) {
            actual.mostrarEntradas();
        }
    }
    
    public void vendeEntradas(){
        Scanner datos = new Scanner(System.in);
        System.out.println("Para que dia quieres la entrada?");
        char dia = datos.next().toUpperCase().charAt(0);
        switch (dia) {
            case 'L':
                if(this.entradas.get(0).getCantidad()>0){
                    this.entradas.get(0).ventaDeEntrada();
                    this.recaudacion = this.recaudacion + this.entradas.get(0).getPrecio();
                }
                break;
            case 'M':
                if(this.entradas.get(1).getCantidad()>0){
                    this.entradas.get(1).ventaDeEntrada();
                    this.recaudacion = this.recaudacion + this.entradas.get(0).getPrecio();
                }
                break;
            case 'X':
                if(this.entradas.get(2).getCantidad()>0){
                    this.entradas.get(2).ventaDeEntrada();
                    this.recaudacion = this.recaudacion + this.entradas.get(0).getPrecio();
                }
                break;
            case 'J':
                if(this.entradas.get(3).getCantidad()>0){
                    this.entradas.get(3).ventaDeEntrada();
                    this.recaudacion = this.recaudacion + this.entradas.get(0).getPrecio();
                }
                break;
            case 'V':
                if(this.entradas.get(4).getCantidad()>0){
                    this.entradas.get(4).ventaDeEntrada();
                    this.recaudacion = this.recaudacion + this.entradas.get(0).getPrecio();
                }
                break;
            case 'S':
                if(this.entradas.get(5).getCantidad()>0){
                    this.entradas.get(5).ventaDeEntrada();
                    this.recaudacion = this.recaudacion + this.entradas.get(0).getPrecio();
                }
            break;
            case 'D':
                if(this.entradas.get(6).getCantidad()>0){
                    this.entradas.get(6).ventaDeEntrada();
                    this.recaudacion = this.recaudacion + this.entradas.get(0).getPrecio();
                }
                break;
            default:
                System.out.println("Dia no valido");
        }
    }
    
}
