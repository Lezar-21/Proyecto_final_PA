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
    public void startThreat(Thread t){
        t.start();
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
    }
    
}
