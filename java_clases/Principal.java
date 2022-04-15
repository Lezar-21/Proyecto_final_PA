package Proyecto_Final.java_clases;

import Proyecto_Final.Ventanas.Ventana;

public class Principal {
    public static void main(String[] args) {
        new Ventana("wea asimetrica");  
        Consumidor c = new Consumidor();
        c.setName("consumidor 1");
        c.start();

        Consumidor c1 = new Consumidor();
        c1.setName("consumidor 2");
        c1.start();

        Productor p = new Productor();
        p.setName("productor 1");
        p.start();

        Productor p1 = new Productor();
        p1.setName("productor 2");
        p1.start();

    }
}
