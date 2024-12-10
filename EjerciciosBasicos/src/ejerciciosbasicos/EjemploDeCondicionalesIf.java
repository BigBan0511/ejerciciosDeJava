/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosbasicos;

/**
 *
 * @author GSW1A8570413
 */
public class EjemploDeCondicionalesIf {

    public static void main(String[] args) {
        double tasaAlcolemia=0.25;
        double miTasa=0.5;
        /*Para comprobar una condición usamos la palabra reservada if,
        necesitamos usar operadores lógicos;
        Operadores Lógicos:
            == Igualdad
            != Distinto
            > Mayor que otra cosa
            < Menor que otra cosa
            >= Mayor o igual a otra cosa
            <= Menor o igual a otra cosa
        */
        if(miTasa>=tasaAlcolemia) {
            System.out.println("La has cagao");
            System.out.println("Atente a las consecuencias");
        }
        System.out.println("Tu tasa de alcohol es " + miTasa);
    }
    
}
