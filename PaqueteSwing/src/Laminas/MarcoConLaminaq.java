package Laminas;

import javax.swing.JFrame;

public class MarcoConLaminaq extends JFrame{

    public MarcoConLaminaq(){
        super();
        setSize(600, 450);
        setLocation(400, 200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Lamina l1 = new Lamina();
        add(l1);
    }
    
}
