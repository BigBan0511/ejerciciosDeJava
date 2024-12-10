
package pooo;

public class POOO {

    public static void main(String[] args) {
        Persona persona1 = new Persona("Jorge", 33);

        persona1.obtenerInformacion();
    }
    
}

class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
            
        this.nombre = nombre;
        this.edad = edad;
    }

    public void obtenerInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " anos");
    }
}
