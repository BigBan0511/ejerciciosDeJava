package ejerciciosarraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaCantantesFamosos {
    private Scanner datos = new Scanner(System.in);
    private ArrayList <CantanteFamoso> listaCantantesFamosos = new ArrayList();

    public void añadirCantantesFamosos(){
        String opcion;
        boolean valido = false;
        do {            
            try {
                System.out.println("Introduce los datos del cantante");
                CantanteFamoso nuevoCantante = new CantanteFamoso();
                this.listaCantantesFamosos.add(nuevoCantante);
                System.out.println("Desea introducir un nuevo cantante?");
                opcion = datos.nextLine();
                switch (opcion) {
                    case "S","s":
                        valido = true;
                        this.añadirCantantesFamosos();
                        break;
                    case "N","n":
                        valido = true;
                        break;
                }
            } catch (Exception e) {
                System.out.println("Introduce una opcion valida");
            }
        } while (valido == false);
    }

    public void mostrarLista(){
        CantanteFamoso nuevoCantante1 = new CantanteFamoso("Michael Jackson", "Thriller");
        CantanteFamoso nuevoCantante2 = new CantanteFamoso("Eminem", "Mocking Bird");
        this.listaCantantesFamosos.add(nuevoCantante1);
        this.listaCantantesFamosos.add(nuevoCantante2);
        for (int x = 0; x < this.listaCantantesFamosos.size(); x++) {
            System.out.println(this.listaCantantesFamosos.get(x).getNombre());
            System.out.println("  " + this.listaCantantesFamosos.get(x).getDiscoConMasVentas());
            System.out.println("");
        }
    }
}
