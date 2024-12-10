package ejerciciosdeclasesi;

public class probarCoche {

    public static void main(String[] args) {
        Coche primerCoche=new Coche("Ferrari","F40",1987,"Amarillo", 450);
        Coche segundoCoche=new Coche("Honda","NSX",1990,"Negro", 280);
        primerCoche.compararCoche(segundoCoche);
    }
    
}
