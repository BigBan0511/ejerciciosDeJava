package paqueteswing;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.*;

public class Ejercicio7 extends JFrame{
    private int alto;
    private int ancho;
    private Dimension d1 = new Dimension();

    public Ejercicio7(){
        super();
        Toolkit t1 = Toolkit.getDefaultToolkit();
        this.d1 = t1.getScreenSize();
        this.ancho = this.d1.width;
        this.alto = this.d1.height;
        setSize((this.ancho/2), (this.alto/2));
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation((this.d1.width / 2 - this.ancho / 2), (this.d1.height / 2 - this.alto / 2));
        
        ImageIcon icono = new ImageIcon("E:\\PROYECTOS\\PROGRAMACION\\PaqueteSwing\\madrid.png");
        setIconImage(icono.getImage());
    }
    
}
