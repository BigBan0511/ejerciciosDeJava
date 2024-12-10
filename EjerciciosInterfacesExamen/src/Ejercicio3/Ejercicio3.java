package Ejercicio3;

import ejerciciosinterfacesexamen.EjerciciosInterfacesExamen;

public class Ejercicio3 {

    public static void main(String[] args) {
        DiscoPrestable dp1 = new DiscoPrestable("Batman", "Pene", "mkv", 22, "Romance");
        DiscoPrestable dp2 = new DiscoPrestable("Robbin", "No", "mp4", 69, "Terror");
        DiscoPrestable dp3 = new DiscoPrestable("La 33", "EL NANO", "amr", 33, "Fantasia");
        Disco[] d1 = {dp1,dp2,dp3};
        ((DiscoPrestable)d1[0]).prestar();
        ((DiscoPrestable)d1[2]).prestar();
        EjerciciosInterfacesExamen.cuentaPrestados(d1);
    }
    
}
