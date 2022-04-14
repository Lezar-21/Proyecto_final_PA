package Proyecto_Final.java_clases;

public class Productor implements Runnable{
  
    @Override
    public void run(){
        while(true){
            this.regionCritica();
            this.regionNoCritica();
        }
    }

    public void regionCritica(){
        System.out.println("Proceso 1");
        System.out.println("_______________________");
        ProductoConsumidor.mComp.push(new Articulo(ProductoConsumidor.mComp.count()));
        System.out.println("Ingresando valor: "+ProductoConsumidor.mComp.peek().p);
    }

    public void regionNoCritica(){

    }
}
