package Proyecto_Final.java_clases;

import java.io.InterruptedException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.awt.Graphics2D;

public class Monitor {
    final int NUM_MAX = 11;
    public LinkedList<Articulo> cola = new LinkedList<>();
    public int cont = 0; 
    
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

    // public void dibujarProductos(Graphics2D g2){
    //     //arreglar esto
    //     for(int i=0; i < cola.size();i++){
    //         System.out.println("lugar "+i+" band "+band[i]);
    //         if(band[i]==true){
    //             cola.get(i).dibujarArticulo(g2);
    //         } 
    //     }
    // }

}
