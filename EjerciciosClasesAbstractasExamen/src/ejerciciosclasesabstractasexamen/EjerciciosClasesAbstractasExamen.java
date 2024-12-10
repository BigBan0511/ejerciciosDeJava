package ejerciciosclasesabstractasexamen;

public class EjerciciosClasesAbstractasExamen {

    public static void main(String[] args) {
        Humano h1 = new Humano("Pablo Motos", "Negro");
        Humano h2 = new Humano("Ibai Llanos", "Gordo");
        Mono m1 = new Mono("Peruano", "Lima");
        Mono m2 = new Mono("Mexicano", "Atracador");
        SerVivo[] miArray = {h1,m1,m2,h2};
        
        for (SerVivo actual : miArray) {
            actual.caminar();
            actual.comer();
            actual.comunicarse();
            actual.respirar();
        }
    }
    
}
