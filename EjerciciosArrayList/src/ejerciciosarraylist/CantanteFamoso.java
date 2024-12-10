package ejerciciosarraylist;

import java.util.Scanner;

public class CantanteFamoso {
    private Scanner datos = new Scanner(System.in);
    private String nombre;
    private String discoConMasVentas;

    public CantanteFamoso(String nombre, String discoConMasVentas) {
        this.nombre = nombre;
        this.discoConMasVentas = discoConMasVentas;
    }

    public CantanteFamoso() {
        System.out.println("Introduce el nombre del cantante");
        this.nombre = this.datos.nextLine();
        System.out.println("Introduce la cancion mas exitosa del cantante en cuestion");
        this.discoConMasVentas = this.datos.nextLine();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDiscoConMasVentas() {
        return discoConMasVentas;
    }

    public void setDiscoConMasVentas(String discoConMasVentas) {
        this.discoConMasVentas = discoConMasVentas;
    }
    
    
}
