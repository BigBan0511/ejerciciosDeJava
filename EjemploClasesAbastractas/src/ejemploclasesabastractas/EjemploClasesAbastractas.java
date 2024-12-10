package ejemploclasesabastractas;

import java.util.ArrayList;

public class EjemploClasesAbastractas {
    public static void main(String[] args) {
        //No está permitido hacer instancias(objetos) de las clases abstractas
        //Animal miAnimal=new Animal(80, 10, "Selva"); 
        /*Gato miGato=new Gato("Siames", false, 30, 3, "Hogar");
        System.out.println(miGato);
        miGato.decirTamaño();
        miGato.alimentarse();
        miGato.alimentarse("pienso");
        System.out.println("-----------------");
        Perro miPerro=new Perro("Husky", true, "Gris", 500, 12, "Siberia");
        System.out.println(miPerro);
        miPerro.alimentarse();
        miPerro.alimentarse("raspas");*/
        //EJEMPLOS DE POLIMORFISMO
        /*Animal miAnimal=new Gato("Siames", true, 120, 2, "Hogar");
        ((Gato)(miAnimal)).maullar();
        Animal miAnimal2=new Perro("Husky", true, "Gris", 100, 12, "Siberia");
        if(miAnimal2 instanceof Gato)
            ((Gato)(miAnimal2)).maullar();*/
        //POLIMORFISMO EN ARRAYLIST
        ArrayList <Animal> losAnimales=new ArrayList();
        Animal miAnimal=new Gato("Siames", true, 120, 2, "Hogar");
        Animal miAnimal2=new Perro("Husky", true, "Gris", 100, 12, "Siberia");
        Gato elGato=new Gato("Persa", true, 50, 2, "Persia");
        Perro elPerro=new Perro("Golden", false, "Marrón", 100, 10, "Cualquiera");
        losAnimales.add(miAnimal);
        losAnimales.add(miAnimal2);
        losAnimales.add(elGato);
        losAnimales.add(elPerro);
        for(Animal actual : losAnimales){
            System.out.println(actual);
            if(actual instanceof Gato)
            ((Gato)(actual)).maullar();
        }
    }

}
