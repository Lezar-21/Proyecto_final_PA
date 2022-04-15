package Proyecto_Final.java_clases;

import java.io.InterruptedIOException;
import java.util.ArrayList;

public class Monitor {
    static final int NUM_MAX = 10;
    ArrayList<Articulo> cola = new ArrayList<>();
    int cont = 0;
    
    public Monitor(){
    }

    public synchronized void push() throws InterruptedException{
        while(cont == NUM_MAX){
            wait();
        }
        cola.add(new Articulo(cont));
        System.out.println("Productor: "+Thread.currentThread().getName()+" produce en "+ cont);
        cont ++;
        notify();
    }

    //elimina el frente
    public synchronized Articulo pop() throws InterruptedException{
        notify();
        while(cont <= 0){
            wait();
        }
        Articulo eliminar = cola.get(0);
        cola.remove(0);
        cont --;
        return eliminar;
    }

    public Articulo peek(){
        return cola.get(0);
    }

}
