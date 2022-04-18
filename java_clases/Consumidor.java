package Proyecto_Final.java_clases;

import java.awt.Graphics2D;
import java.awt.Color;

public class Consumidor extends Thread{

    int[] x = {662,630,690,706,617,635,55};
    int[] y = {83,142,180,100,68,71,39,44};

    @Override
    public void run(){
        try {   
            while(true){
                System.out.println("El consumidor: "+Thread.currentThread().getName()+" consume ");
                sleep(500);
            }   
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    public void dibujarConsumidor(Graphics2D g2, int abajo){
        
        g2.drawLine(x[0] , y[0] + abajo , x[0], y[1] + abajo );
        g2.drawLine(x[0] ,y[1] + abajo , x[1], y[2] + abajo );
        g2.drawLine(x[0], y[1] + abajo , x[2], y[2] + abajo );
        g2.drawLine(x[0], y[3] + abajo , x[3], y[4] + abajo );
        g2.drawLine(x[0], y[3] + abajo , x[4], y[5] + abajo );
        g2.setColor(Color.BLACK); 
        g2.fillOval(x[5],y[6] + abajo , x[6], y[7] );
    }

}
