package Proyecto_Final.java_clases;

import Proyecto_Final.Ventanas.MiPanel;

import java.awt.Graphics2D;
import java.awt.Color;

public class Productor extends Thread{
    int[] x = {132,100,160,176,87,105,55};
    int[] y = {83,142,180,100,68,71,39,44};

    MiPanel mp;
    public Productor(MiPanel mpx){
        this.mp = mpx;
    }
  
    @Override
    public void run(){
        while(true){
            try {
                this.producir();
                this.agregarArticulo();
                sleep(2500); 
            } catch (InterruptedException e) {
                //TODO: handle exception
            }     
        }
    }
    
    public void dibujarProductor(Graphics2D g2, int abajo){
        
        g2.drawLine(x[0] , y[0] + abajo , x[0], y[1] + abajo );
        g2.drawLine(x[0] ,y[1] + abajo , x[1], y[2] + abajo );
        g2.drawLine(x[0], y[1] + abajo , x[2], y[2] + abajo );
        g2.drawLine(x[0], y[3] + abajo , x[3], y[4] + abajo );
        g2.drawLine(x[0], y[3] + abajo , x[4], y[5] + abajo );
        g2.setColor(Color.BLACK); 
        g2.fillOval(x[5],y[6] + abajo , x[6], y[7] );
    }

    public void producir(){
        try{
            ProductoConsumidor.monitor.push();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void agregarArticulo(){
        int cont = ProductoConsumidor.monitor.cont;
        Articulo aux = ProductoConsumidor.monitor.cola.get(cont-1);
        mp.ArticList.add(aux);
        mp.repaint(); 
    }

}
