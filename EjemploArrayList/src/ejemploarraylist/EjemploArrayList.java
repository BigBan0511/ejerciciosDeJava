package ejemploarraylist;

import java.util.ArrayList;

public class EjemploArrayList {

    public static void main(String[] args) {
        ArrayList <String> miListaString = new ArrayList();
        
        System.out.println(miListaString.size());
        
        miListaString.add("Hola");
        miListaString.add("Adios");
        miListaString.add("Esto es un ArrayList de Strings");
        System.out.println(miListaString.size());
        for (int i = 0; i < miListaString.size(); i++) {
            System.out.println("Elemento " + i + ": " + miListaString.get(i));
        }
        miListaString.add(1, "Nuevo elemento");
        for(String actual:miListaString){
            System.out.println(actual);
        }
        System.out.println(miListaString.contains("Hola"));
        System.out.println(miListaString.indexOf("puente"));
        miListaString.remove("Adios");
        for(String actual:miListaString){
            System.out.println(actual);
        }
        miListaString.clear();
        miListaString.clone();
        miListaString.set(2, "Polla y Huevos");
    }
    
}
