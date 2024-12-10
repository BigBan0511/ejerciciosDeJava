package composiciondeclase;

import java.util.Scanner;

public class Poblacion {
    private final String poblacion;
    private final String cp;
    private final String pais;
    //La composición de clases consiste en tener como atributo de una clase
    //datos de otra clase diferente, en este caso el array de Ciudadanos que no
    //son ni datos primitivos ni String...
    private Ciudadano [] misCiudadanos;

    public Poblacion(String poblacion, String cp, String pais) {
        this.poblacion = poblacion;
        this.cp = cp;
        this.pais = pais;
        this.misCiudadanos=new Ciudadano[2];
    }
    
    public Ciudadano crearCiudadano(){
        Scanner datos=new Scanner(System.in);
        System.out.println("Introduce el nombre del ciudadano:");
        String nombre=datos.nextLine();
        System.out.println("Introduce la edad del ciudadano");
        int edad=datos.nextInt();
        System.out.println("Introduce el DNI del ciudadano:");
        //Lo hago para que no se salte el siguiente next
        datos.nextLine();
        String dni=datos.nextLine();
        Ciudadano actual=new Ciudadano(nombre, this.poblacion, edad, dni);
        return actual;
    }
    
    //hago el método sin redimensionar el array
    public void añadirCiudadano(){
        //PASO 1: Recorrer el array con un do-while
        boolean insertado=false;
        int x=0;
        do{
            //PASO 2: Busco el null para insertar el nuevo ciudadano
            if(this.misCiudadanos[x]==null){
                //PASO 3: inserto al ciudadano
                Ciudadano actual=crearCiudadano();
                this.misCiudadanos[x]=actual;
                insertado=true;
            }x++;
        }while(insertado==false && x<this.misCiudadanos.length);
        //PASO 4: Si después del do-while no he cambiado insertado
        //significa que ya no hay más espacio
        if(insertado==false)
            System.out.println("Tenemos la ciudad llena, vete a Ontigola");
    }
    
    public void mostrarCiudadanos(){
        for(int x=0; x<this.misCiudadanos.length;x++){
            if (this.misCiudadanos[x]!=null)
                System.out.println(this.misCiudadanos[x].toString());
        }
    }

    /**
     * @return the poblacion
     */
    public String getPoblacion() {
        return poblacion;
    }

    /**
     * @return the cp
     */
    public String getCp() {
        return cp;
    }

    /**
     * @return the pais
     */
    public String getPais() {
        return pais;
    }

    /**
     * @return the misCiudadanos
     */
    public Ciudadano[] getMisCiudadanos() {
        return misCiudadanos;
    }
    
    
    
    
}
