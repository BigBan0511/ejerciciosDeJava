package composiciondeclase;


public class ComposicionDeClase {

   
    public static void main(String[] args) {
        /*Ciudadano c1=new Ciudadano("Alejandro González", "Aranjuez", 40, "3453454F");
        System.out.println(c1);
        c1.cumplirAños();
        System.out.println(c1);*/
        Poblacion aranjuez=new Poblacion("Aranjuez", "28300", "España");
        aranjuez.añadirCiudadano();
        aranjuez.añadirCiudadano();
        aranjuez.añadirCiudadano();
        aranjuez.mostrarCiudadanos();
    }

}
