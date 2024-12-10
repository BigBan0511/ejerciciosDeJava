package ejercicioclasesabstractas;

public class EjercicioClasesAbstractas {

    public static void main(String[] args) {
        Humano h1 = new Humano("Chicote", "Humano");
        Humano h2 = new Humano("Pablo Motos", "Humano");
        Mono m1 = new Mono("Chimpance", "Mono");
        Mono m2 = new Mono("Lemur", "Mono");
        SerVivo[] arraySeresVivos = {h1,h2,m1,m2};
        
        for (int x = 0; x < arraySeresVivos.length; x++) {
            arraySeresVivos[x].caminar();
            arraySeresVivos[x].comer();
            arraySeresVivos[x].comunicarse();
            arraySeresVivos[x].respirar();
            System.out.println("El tiempo de embarazo es de " + arraySeresVivos[x].tiempoDeEmbarazo());
        }
    }
    
}
