package Proyecto_Final.java_clases;


public class Consumidor extends Thread{

    @Override
    public void run(){
        try {   
            while(true){
                System.out.println("El consumidor: "+Thread.currentThread().getName()+" consume "+ ProductoConsumidor.monitor.pop().p);
                sleep(500);
            }   
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
