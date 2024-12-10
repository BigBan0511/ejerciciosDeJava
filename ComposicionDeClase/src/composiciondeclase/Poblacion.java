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
    
    //La sobrecarga de métodos consiste en definir el mismo método con diferentes
    //parámetros en cada definición, a la hora de ejecutarse java decidira si usa
    //uno u otro dependiendo de cuantos parametros pasemos al metodo a la hora de
    //invocarlo. Vamos a hacer un constructor sin parámetros, que pida los datos
    //al usuario.
    
    public Poblacion(){
        Scanner datos = new Scanner (System.in);
        System.out.println("Introduce el nombre de la población:");
        this.poblacion=datos.nextLine();
        System.out.println("Introduce el CP de " + this.poblacion + " :");
        this.cp=datos.nextLine();
        System.out.println("Introduce en que pais se encuentra " + this.poblacion + " :");
        this.pais=datos.nextLine();
        System.out.println("Cuanta poblacion tiene " + this.poblacion + "?");
        this.misCiudadanos=new Ciudadano[datos.nextInt()];
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
    //SOBRECARGA AÑADIRCIUDADANO CON LOS PARÁMETROS NECESARIOS
    
     public Ciudadano crearCiudadano(String nombre, int edad, String dni) {
        return new Ciudadano(nombre, this.poblacion, edad, dni);
     }
    
    //hago el método sin redimensionar el array
    public void añadirCiudadano(Ciudadano unCiudadano){
        //PASO 1: Recorrer el array con un do-while
        boolean insertado=false;
        int x=0;
        do{
            //PASO 2: Busco el null para insertar el nuevo ciudadano
            if(this.misCiudadanos[x]==null){
                //PASO 3: inserto al ciudadano
                this.misCiudadanos[x]=unCiudadano;
                insertado=true;
            }x++;
        }while(insertado==false && x<this.misCiudadanos.length);
        //PASO 4: Si después del do-while no he cambiado insertado
        //significa que ya no hay más espacio
        if(insertado==false){
            ampliarArray();
            this.misCiudadanos[x] = unCiudadano;
        }
    }
    
    public void ampliarArray(){
        Ciudadano [] misCiudadanosAmpliado = new Ciudadano[this.misCiudadanos.length*2];
        for (int x = 0; x < misCiudadanos.length; x++) {
            this.misCiudadanos[x]=misCiudadanosAmpliado[x];
        }
        this.misCiudadanos = misCiudadanosAmpliado;
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
