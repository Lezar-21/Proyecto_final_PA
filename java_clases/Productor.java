package Proyecto_Final.java_clases;

import Proyecto_Final.Ventanas.MiPanel;

public class Productor extends Thread{

    MiPanel mp;
    public Productor(MiPanel mpx){
        this.mp = mpx;
    }
  
    @Override
    public void run(){
        while(true){
            try {
                ProductoConsumidor.monitor.push();
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}
