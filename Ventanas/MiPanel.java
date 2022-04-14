package Proyecto_Final.Ventanas;

import javax.swing.JPanel;

import Proyecto_Final.java_clases.Articulo;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class MiPanel extends JPanel{
    Ventana v;
    Articulo a = new Articulo(this,10, 10, 10, 30);
    public MiPanel(Ventana vx){
        this.v=vx;
        this.setFocusable(true);
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        a.dibujarArticulo(g2);
    }
    
}
