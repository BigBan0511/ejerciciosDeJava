package ejemploclasesabstractas;

public class EjemploClasesAbstractas {

    public static void main(String[] args) {
        //No está permitido hacer instancias(objetos) de las clases abstractas
        //Animal miAnimal = new Animal(80, 10, "Selva");
        Gato miGato = new Gato("Siames", false, 30, 3, "MERCADONA");
        System.out.println(miGato);
    }
    
}
