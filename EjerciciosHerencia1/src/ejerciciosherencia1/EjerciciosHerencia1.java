package ejerciciosherencia1;

public class EjerciciosHerencia1 {

    public static void main(String[] args) {
        Multimedia prueba = new Multimedia("Spider-Man 2", "Sony", "mp3", 190);
        Multimedia prueba2 = new Multimedia("Franco", "Espana", "mp3", 268);
        /*Multimedia prueba2 = new Multimedia("Spider-Man", "Sony", "mp3", "1:20:30");
        System.out.println(prueba.toString());
        prueba.equals(prueba2);*/
        //Pelicula pruebaPeli = new Pelicula(null, null, "Bob Esponja", "negro", "wav", 265);
        //System.out.println(pruebaPeli.toString());
        Multimedia[] nuevoMulti = {prueba,prueba2};
        ListaMultimedia nuevaLista = new ListaMultimedia(nuevoMulti, 2);
        Multimedia prueba3 = new Multimedia("aloha", "nigga", "wav", 365);
        nuevaLista.add(prueba3);
        System.out.println(nuevaLista.toString());
    }
    
}
