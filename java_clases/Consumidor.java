package Proyecto_Final.java_clases;


public class Consumidor implements Runnable{

    @Override
    public void run(){
        while(true){
            this.regionCritica();
            this.regionNoCritica();
        }
    }

    

    public void regionCritica(){
        System.out.println("Proceso 0");
        System.out.println("_______________________");
        System.out.println("quitando valor: "+ProductoConsumidor.mComp.pop().p);
    }

    public void regionNoCritica(){

    }
}
