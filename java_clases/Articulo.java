package Proyecto_Final.java_clases;

import Proyecto_Final.Ventanas.MiPanel;

import java.awt.Graphics2D;

public class Articulo {
    int index;
    int x = 0, y = 0,  velX, velY, tam;    
    MiPanel mp;

    //prueba
    public Articulo(int index){
    }
    public Articulo(){
    }

    public void dibujarArticulo(Graphics2D g2){

        switch(index){
            case 0 : g2.fillOval(241, 160, 54, 54);
            break;
            case 1 : g2.fillOval(305, 214, 54, 54);
            break;
            case 2 : g2.fillOval(390, 160, 54, 54);
            break;
            case 3 : g2.fillOval(454, 214, 54, 54);
            break;
            case 4 : g2.fillOval(538, 160, 54, 54);
            break;
            case 5 : g2.fillOval(241, 256, 54, 54);
            break;
            case 6 : g2.fillOval(305, 310, 54, 54);
            break;
            case 7 : g2.fillOval(390, 256, 54, 54);
            break;
            case 8 : g2.fillOval(454, 310, 54, 54);
            break;
            case 9 : g2.fillOval(538, 256, 54, 54);
            break;
            default : System.out.println("ERROR!!!!!!!!!!");
        }

    }
    
}