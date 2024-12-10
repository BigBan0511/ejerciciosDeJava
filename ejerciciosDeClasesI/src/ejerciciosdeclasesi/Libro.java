package ejerciciosdeclasesi;

import java.util.Scanner;

public class Libro {
    public Scanner datos=new Scanner(System.in);
    private String titulo;
    private String autor;
    private int anoPublicacion;
    private String genero;
    private boolean prestado=false;
    private String[] generosPosibles={"aventuras","ciencia","romance","etica","religion","historia","programacion"};
    
    public Libro(){
        System.out.println("Introduce el titulo del libro");
        titulo=datos.nextLine();
        System.out.println("Introduce el autor del libro");
        autor=datos.nextLine();
        do{
            System.out.println("Introduce el ano del libro");
            anoPublicacion=datos.nextInt();
        }while(anoPublicacion<1450 || anoPublicacion>2023);
        boolean salida=false;
        System.out.println("Introduce el genero del libro");
        do{
            this.genero=datos.nextLine();
            //vamos a hacer un for-each, consiste en crear una variable que
            //representa el valor actual de un array y esta variable
            //cambiará sola tomando en cada vuelta del bucle un valor diferente
            //del array
            for(String actual:this.generosPosibles){
                if(actual.equalsIgnoreCase(this.genero)){
                    salida=true;
                    //break;
                }
            }if(salida==false){
                System.out.println("Debes introducir uno de los generos validos");
            }
        }while (salida==false);
    }
    
    public void prestarLibro(){
        if (this.prestado=false){
            System.out.println("Ha cogido prestado este libro");
            this.prestado=true;
        }else{
            System.out.println("Ya ha cogido prestado este libro anteriormente");
        }
    }
    
    public void devolverLibro(){
        if(this.prestado=true){
            System.out.println("Ha devuelto el libro prestado");
            this.prestado=false;
        }else{
            System.out.println("Ya habia devuelto este libro");
        }
    }
    
    public void mostrarInfoLibro(){
        System.out.println("El titulo de este libro es: " + titulo);
        System.out.println("El autor de este libro es: " + autor);
        System.out.println("El ano de publicacion de este libro es: " + anoPublicacion);
        System.out.println("El genero de este libro es: " + genero);
        System.out.println("El libro esta prestado? " + prestado);
    }
    
    public boolean compararAutores(Libro otroLibro){
        if(this.autor.equalsIgnoreCase(otroLibro.autor)){
            return true;
        }else{
            return false;
        }
    }
    
    public void setTitulo(String parametroTitulo){
        this.titulo=parametroTitulo;
    }
    
    public void setAutor(String parametroAutor){
        this.autor=parametroAutor;
    }
    
    public void setAnoPublicacion(int parametroAnoPublicacion){
        this.anoPublicacion=parametroAnoPublicacion;
    }
    
    public void setGenero(String parametroGenero){
        this.genero=parametroGenero;
    }
    
    public void setPrestado(boolean parametroPrestado){
        this.prestado=parametroPrestado;
    }
    
    public void setGenerosPosibles(String[] parametroGenerosPosibles){
        this.generosPosibles=parametroGenerosPosibles;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public String getAutor(){
        return autor;
    }
    
    public int getAnoPublicacion(){
        return anoPublicacion;
    }
    
    public String getGenero(){
        return genero;
    }
    
    public boolean getPrestado(){
        return prestado;
    }
    
    public String[] getGenerosPosibles(){
        return generosPosibles;
    }
}
//CLASE CIUDADANO: atributos privados (String DNI, String nombre y apellidos, int edad y String localidad), 
//constructor pasado por parámetros, getter y setter, método cumplir años y método tuString() 
//que devuelva un String con toda la información del ciudadano.

//CLASE POBLACIÓN: String nombre poblacion, String codigo postal y String pais todos son constantes, array de ciudadanos,
//El constructor de la población recibe nombre poblacion, codigo postal y nombre del pais, 
//pone un array de ciudadanos de tamaño 15 (En el momento de crear el array de ciudadanos todos serán null)
//método añadirCiudadano(), crea un ciudadano llamando a su constructor y lo introduce en el array (sin un contador de ciudadanos),
//si ya ha llegado al final de capacidad del array duplica o añade a su tamaño sin perder los ciudadanos que ya tenía.