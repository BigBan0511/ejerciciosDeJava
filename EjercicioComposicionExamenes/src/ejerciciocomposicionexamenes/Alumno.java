package ejerciciocomposicionexamenes;

import java.util.Scanner;

public class Alumno {
    private String nombre;
    private String DNI;
    private int edad;
    private String grupo;
    private Examen [] losExamenes;
    private double [] lasNotas;
    private double media;
    private int examenesRealizados;
    private Scanner datos;

    public Alumno(String nombre, String DNI, int edad, String grupo, Examen[] losExamenes) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.edad = edad;
        this.grupo = grupo;
        this.losExamenes = losExamenes;
        this.lasNotas = new double [6];
        this.examenesRealizados=0;
        this.datos=new Scanner(System.in);
    }
    
    public void ponerNota(){
        //Proteger el acceso a limites del array
        if(this.examenesRealizados==this.losExamenes.length)
            System.out.println("Ya se han introducido todas las notas");
        else{
            System.out.println("Introuce la nota del examen de " +
                this.losExamenes[this.examenesRealizados].getNombreAsignatura());
            this.lasNotas[this.examenesRealizados]=this.datos.nextDouble();
            this.examenesRealizados++;
        }//Si ya he puesto todas las notas, ahora debo calcular la media
        if(this.examenesRealizados==this.losExamenes.length)
            calcularMedia();
    }
    
    public void calcularMedia(){
        //Inicializo la media a 0 porque no estaba inicializada
        this.media=0;
        for(int x=0; x<this.lasNotas.length; x++)
            //Voy sumando las nuevas medias
            this.media=this.media+this.lasNotas[x];
        this.media=this.media/this.examenesRealizados;
       
    }
    
    public String toString(){
        String respuesta="Información de " + this.nombre + ": \nDNI: " + this.DNI + "\nEdad:" + this.edad + "\nGrupo: " + this.grupo
                +"\nNotas:\n";
        //PASO 1: Recorro el array de examenes y de notas, parta saber los examenes que no se han realizado
        //uso el contador, realizo dos for uno que va de 0 al contador y otro que va desde el contador al length
        //del array
        for(int x=0; x<this.examenesRealizados;x++){
            //En este for están los exámenes que si he realizado
            respuesta+="Nota del examen de " + this.losExamenes[x].getNombreAsignatura()+": " + this.lasNotas[x] +"\n";
        }//Hacemos otro for que recorre los exámenes que no he realizado
        for(int x=this.examenesRealizados; x<this.losExamenes.length;x++){
            respuesta+="El examen de " + this.losExamenes[x].getNombreAsignatura() + " aun no se ha realizado.\n";
        }
        if(this.examenesRealizados==this.losExamenes.length){
            respuesta+="Su media es: " + this.media;
        }else{
            respuesta+="No se ha calculado la media";
        }
        return respuesta;
    }
    
    
    
}
