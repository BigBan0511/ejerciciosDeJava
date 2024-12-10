
package composiciondeclase;

public class Ciudadano {
    private String nombreCompeto;
    private String localidad;
    private int edad;
    private final String dni;

    public Ciudadano(String nombreCompeto, String localidad, int edad, String dni) {
        this.nombreCompeto = nombreCompeto;
        this.localidad = localidad;
        this.edad = edad;
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "El nombre del ciudadano es: " + this.nombreCompeto + 
                "\nLa edad del ciudadano es :" + this.edad + 
                "\nEl DNI del ciudadano es :" + this.dni + 
                "\nVive en " + this.localidad;
    }
    
    public void cumplirAños(){
        this.edad++;
        System.out.println("Ahora " + this.nombreCompeto + " tiene " + this.edad
        + " años, Felicidades!");
    }

    /**
     * @return the nombreCompeto
     */
    public String getNombreCompeto() {
        return nombreCompeto;
    }

    /**
     * @param nombreCompeto the nombreCompeto to set
     */
    public void setNombreCompeto(String nombreCompeto) {
        this.nombreCompeto = nombreCompeto;
    }

    /**
     * @return the localidad
     */
    public String getLocalidad() {
        return localidad;
    }

    /**
     * @param localidad the localidad to set
     */
    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the dni
     */
    public String getDni() {
        return dni;
    }
    
    
    
}
