package Proyecto_Final.java_clases;

import Proyecto_Final.Ventanas.MiPanel;
import java.awt.Graphics2D;

//la clase "Articulo" funciona como nodo para la cola llamada "Monitor" 
public class Articulo {
    Articulo siguiente;
    int p;//prueba

    int x = 0, y = 0,  velX, velY, tam;    
    MiPanel mp;

    //prueba
    public Articulo(int valor){
        this.p = valor;
        this.siguiente = null;
    }

    public int getDato(){
        return p;
    }

    //
    public Articulo getSiguiente(){
        return siguiente;
    }

    public void setSiguiente(Articulo siguiente){
        this.siguiente = siguiente;
    }

    public Articulo(MiPanel mpx, int xx, int xy, int xvel, int xtam){
        this.mp = mpx;
        this.x = xx;
        this.y = xy;
        this.velX = xvel;
        this.velY = xvel;
        this.tam = xtam;
    }
    public void dibujarArticulo(Graphics2D g2){

        g2.fillOval(x,y,tam,tam);

      }
}