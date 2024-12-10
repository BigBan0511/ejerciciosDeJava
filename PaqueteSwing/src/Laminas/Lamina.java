package Laminas;

import java.awt.FontMetrics;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Lamina extends JPanel{
    
    public void paintComponent(Graphics g){
        super.paintComponents(g);
        g.drawString("Estamos aprendiendo Swing", 100, 200);
        FontMetrics laFuente = g.getFontMetrics();
        int anchoTexto = laFuente.stringWidth("Estamos aprendiendo Switch");
        int alturaTexto = laFuente.getHeight();
        System.out.println();
        g.drawRect(98, 200-alturaTexto-2, 50, 50);
        
    }
}
