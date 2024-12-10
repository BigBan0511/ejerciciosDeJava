/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosifelsehoja;

import java.util.Scanner;

public class Socios {

    public static void main(String[] args) {
        Scanner datos=new Scanner (System.in);
        int cuota=800;
        System.out.println("Introduce tu edad:");
        int edad=datos.nextInt();
        int descuentoMayores=(cuota*40)/100;
        int descuentoMenoresPadres=(cuota*45)/100;
        int descuentoMenoresNoPadres=(cuota*25)/100;
        System.out.println("Si tus padres son socios escribe true, si no lo son escribe false");
        boolean preguntaPadres =datos.nextBoolean();
        if (edad>65) {
            System.out.println("La cuota a pagar será " + (cuota-descuentoMayores));
        }else{
            if (edad<21 && preguntaPadres==true) {
                System.out.println("La cuota a pagar sería " + (cuota-descuentoMenoresPadres));
            }else{
                if (edad<21 && preguntaPadres==false)
                {
                    System.out.println("La cuota a pagar seria " + (cuota-descuentoMenoresNoPadres));
                }
                    
            
            }
                
                
        
            }
        }
}
