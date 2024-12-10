package paqueteswing;

import java.util.Scanner;
import javax.swing.*;

public class Marco extends JFrame{
    private int alto;
    private int ancho;
    private Scanner datos=new Scanner(System.in);

    public Marco(int alto, int ancho){
        super();
        this.alto = alto;
        this.ancho = ancho;
        setSize(this.ancho, this.alto);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setTitle("RAUL CHUPA");
    }

    public Marco(){
        boolean salida=false;
        do{
            try{
                System.out.println("Introduce la altura del marco:");
                this.alto=datos.nextInt();
                if(this.alto<200)
                    throw new MiExcepcion("Altura no válida");
                System.out.println("Introduce el ancho del marco:");
                this.ancho=datos.nextInt();
                if(this.ancho<200)
                    throw new MiExcepcion("Ancho no válido");
                salida=true;
            }catch(MiExcepcion e){
                System.err.println(e.getMessage());
                this.datos=new Scanner(System.in);
            }catch(Exception e){
                System.err.println("Debes introducir un dato válido");
                this.datos=new Scanner(System.in);
            }
        }while(salida==false);
        setSize(this.ancho, this.alto);
        salida=false;
        do{
            System.out.println("Introuce una opción para que la ventana reaccione al pulsar la X:");
            System.out.println("1-Nada");
            System.out.println("2-Esconderse");
            System.out.println("3-Dispose");
            System.out.println("4-Cerrar");
            String opcion=datos.next();
            switch(opcion.charAt(0)){
                case '1':
                    setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                    salida=true;
                    break;
                case '2':
                    setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                    salida=true;
                    break;
                case '3':
                    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    salida=true;
                    break;
                case '4':
                    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    salida=true;
                    break;
                default:
                    System.err.println("Debes introducir una opción válida");
            }
        }while(salida==false);
        setVisible(true);
        setResizable(false);
    }
    
    public Marco(int alto, int ancho, int posx, int posy){
        this.alto = alto;
        this.ancho = ancho;
        setSize(this.ancho, this.alto);
        setLocation(posx, posy);
        setBounds(posx, posy, this.alto, this.ancho);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("RAUL CHUPA");
    }
    
}
