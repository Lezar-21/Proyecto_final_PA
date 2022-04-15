package Proyecto_Final.java_clases;

public class Productor extends Thread{
  
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
