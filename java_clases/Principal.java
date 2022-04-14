package Proyecto_Final.java_clases;

import java.util.concurrent.Semaphore;

import Proyecto_Final.Ventanas.Ventana;

public class Principal {
    public static void main(String[] args) {
        //new Ventana("wea asimetrica");  
        Thread t1 = new Thread(new Consumidor());
        Thread t2 = new Thread(new Productor());
            t1.start();
            t2.start();    

    }
}
