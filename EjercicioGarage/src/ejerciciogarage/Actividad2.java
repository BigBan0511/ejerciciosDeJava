package ejerciciogarage;

public class Actividad2 {

    public static void main(String[] args) {
        Garaje miGarage = new Garaje();
        Motor m1 = new Motor(130);
        Motor m2 = new Motor(350);
        Coche c1 = new Coche("Ford","Fiesta",m1);
        Coche c2 = new Coche("Citroen","C15",m2);
        //miGarage.devolverCoche();
        miGarage.aceptarCoche(c2, "aceite");
        miGarage.aceptarCoche(c1, "Filtro de particulas");
        System.out.println(c1.getPrecioAcumuladoAverias());
        System.out.println(c1.getLitrosAceite());
        miGarage.devolverCoche();
        System.out.println(c1.getPrecioAcumuladoAverias());
    }
    
}
