package clasesjavaejemplospooo;

//Nombres de clases siempre en mayúsculas

import java.util.Scanner;

public class Guerrero {
    public Scanner datos=new Scanner (System.in);
    //Nombre de atributos o métodos, siempre en minúsculas
    //ZONA DE DEFINICIÓN DE ATRIBUTOS
    private int vida;
    private int ataque;
    private String nombre;
    private int defensa;
    private String habilidadEspecial;
    //Cuando creamos un guerrero siempre es de nivel 1, por eso
    //no necesito pasarle un parámetro
    private int nivel = 1;
    
    //Vamos a definir el constructor que se encargará de 
    //inicializar estos atributos. Normalmente le pasaremos
    //al constructor los valores de los atributos como parámetro
    //Podemos usar el nombre de los atributos u otros nombres
    public Guerrero(int laVida, int elAtaque, String elNombre, int laDefensa, String laHabilidad){
        vida=laVida;
        ataque=elAtaque;
        nombre=elNombre;
        defensa=laDefensa;
        habilidadEspecial=laHabilidad;
    }
    
    public void mostrarGuerrero(){
        //Puedo acceder a las variables de la clase porque las he
        //definido como atributos, si no no podría
        System.out.println("Tu guerrero se llama: " + nombre);
        System.out.println("La vida de tu guerrero es de: " + vida);
        System.out.println("El ataque de tu guerrero es de: " + ataque);
        System.out.println("La defensa de tu guerrero es: " + defensa);
        System.out.println("La habilidad de tu guerrero es de: " + habilidadEspecial);
        System.out.println("Su nivel es: " + nivel);
    }
    
    public void subirNivel(){
        this.vida=this.vida+15;
        this.ataque=this.ataque+5;
        this.defensa=this.defensa+5;
        this.nivel++;
    }
    
    public void recibirGolpe(int elGolpe){
        if(defensa>elGolpe){
            System.out.println("Recibiste 0 de dmg");
        }else{
            System.out.println("Has recibido " + (elGolpe-defensa) + " de dmg");
            this.vida=vida - (elGolpe-defensa);
            if(vida<=0){
                morir();
            }
            System.out.println("La vida es de " + vida);
        }
    }
    
    public void tomarPocion(String laPocion, int valorPocion){
        if(valorPocion>0){
            switch (laPocion) {
                case "vida":
                    this.vida=this.vida+valorPocion;
                    System.out.println("Has recuperado " + valorPocion + " ps");
                    break;
                case "ataque":
                    this.ataque=this.ataque+valorPocion;
                    System.out.println("Has sumado " + valorPocion + " dmg");
                    break;
                case "defensa":
                    this.defensa=this.defensa+valorPocion;
                    System.out.println("Has sumado " + valorPocion + " puntos de defensa");
                    break;
                case "veneno":
                    if(valorPocion>=this.vida){
                        System.out.println("Has restado " + valorPocion + " ps debido al veneno");
                        morir();
                    }else{
                        this.vida=this.vida-valorPocion;
                        System.out.println("Has restado " + valorPocion + " ps debido al veneno");
                    }
                    break;
                case "agua":
                    System.out.println("Te has hidratado");
                    break;
                default:
                    System.out.println("Esta pocion no se puede usar");
            }
        }else if (valorPocion<=0){
            System.out.println("La pocion no ha surtido efecto");   
        }
    }
    
    public void morir(){
        System.out.println("Has muerto");
        this.vida=0;
        this.ataque=0;
        this.defensa=0;
        this.nivel=0;
        this.habilidadEspecial=null;
        this.nombre=null;
    }
    
    //El método set es un método público que se encarga de darle un valor
    //a una propiedad o atributo de un objeto, el cual está encapsulado en
    //la clase correspondiente, es decir, está con la palabra private.
    public void setVida(int parametroVida){
        this.vida = parametroVida;
    }
    
    //El método get al igual que el set, es un método público, 
    //pero el get se encarga de mostrar un valor a una propiedad 
    //o atributo de un objeto declarado con private
    public int getVida(){
        return vida;
    }
}
