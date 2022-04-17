package Proyecto_Final.Ventanas;

import javax.swing.JPanel;

import Proyecto_Final.java_clases.Articulo;

import java.awt.Color;
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
        //a.dibujarArticulo(g2);
        int derecha = 530;
        int abajo = 165;
        g2.drawLine(132 , 83 , 132, 142);
        g2.drawLine(132 ,142, 100, 180);
        g2.drawLine(132, 142, 160, 180);
        g2.drawLine(132, 100, 176, 68);
        g2.drawLine(132, 100, 87, 71);
        g2.setColor(Color.BLACK);
        g2.fillOval(105, 39, 55, 44);

        //productos de arriba
        g2.fillOval(241, 160, 54, 54);
        g2.fillOval(305, 214, 54, 54);
        g2.fillOval(390, 160, 54, 54);
        g2.fillOval(454, 214, 54, 54);
        g2.fillOval(538, 160, 54, 54);
        
        //productos de abajo
        g2.fillOval(241, 256, 54, 54);
        g2.fillOval(305, 310, 54, 54);
        g2.fillOval(390, 256, 54, 54);
        g2.fillOval(454, 310, 54, 54);
        g2.fillOval(538, 256, 54, 54);
    }
    
}
