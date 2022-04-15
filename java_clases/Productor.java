package Proyecto_Final.java_clases;

public class Productor extends Thread{
  
    @Override
    public void run(){
        while(true){
            try {
                ProductoConsumidor.monitor.push();
            } catch (InterruptedException e) {
                //TODO: handle exception
            }
        }
    }
}
