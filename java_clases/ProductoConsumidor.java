package Proyecto_Final.java_clases;

import java.util.concurrent.Semaphore;

public class ProductoConsumidor {
    public static Monitor mComp = new Monitor();
    public static Productor p= new Productor();
    public static Consumidor c = new Consumidor();
}
