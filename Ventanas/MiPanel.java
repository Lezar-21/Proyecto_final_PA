package Proyecto_Final.Ventanas;

import javax.swing.JPanel;

import Proyecto_Final.java_clases.Articulo;
import Proyecto_Final.java_clases.Consumidor;
import Proyecto_Final.java_clases.Productor;
import Proyecto_Final.java_clases.Monitor;
import Proyecto_Final.java_clases.ProductoConsumidor;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

public class MiPanel extends JPanel{
    Ventana v;
    int contProduct = 0;
    ArrayList<Productor> producList = new ArrayList<>();
    int contConsum = 0;
    ArrayList<Consumidor> consumList = new ArrayList<>();

    public ArrayList<Articulo> ArticList = new ArrayList<>();

    public MiPanel(Ventana vx){
        this.v=vx;
        this.setFocusable(true);    
    }


    public void nuevoProductor(Productor t){
        producList.add(t);
        contProduct ++;
    }
    public void nuevoConsumidor(Consumidor t){
        consumList.add(t);
        contConsum ++;
    }

    public void dibujarArticulos(Graphics2D g2){
        for(int i = 0;ArticList.size() <= i;i++){
            System.out.println("IIIIIIIIII: "+i);
            ArticList.get(i).dibujarArticulo(g2);;
        }
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        //a.dibujarArticulo(g2);
        //int derecha = 530;
        //int abajo = 165;


        if(contProduct == 1){
            producList.get(0).dibujarProductor(g2,0);
        }
        if(contProduct == 2){
            producList.get(0).dibujarProductor(g2,0);
            producList.get(1).dibujarProductor(g2,165);
        }
        if(contProduct == 3){
            producList.get(0).dibujarProductor(g2,0);
            producList.get(1).dibujarProductor(g2,165);
            producList.get(2).dibujarProductor(g2,330);
        }

        if(contConsum == 1){
            consumList.get(0).dibujarConsumidor(g2,0);
        }
        if(contConsum == 2){
            consumList.get(0).dibujarConsumidor(g2,0);
            consumList.get(1).dibujarConsumidor(g2,165);
        }
        if(contConsum == 3){
            consumList.get(0).dibujarConsumidor(g2,0);
            consumList.get(1).dibujarConsumidor(g2,165);
            consumList.get(2).dibujarConsumidor(g2,330);
        }

        System.out.println("Tamano de arcticlist: "+ArticList.size());
        
        this.dibujarArticulos(g2);
        //SProductoConsumidor.monitor.dibujarProductos(g2);

        /*productos de arriba
        g2.fillOval(241, 160, 54, 54);
        g2.fillOval(305, 214, 54, 54);
        g2.fillOval(390, 160, 54, 54);
        g2.fillOval(454, 214, 54, 54);
        g2.fillOval(538, 160, 54, 54);
        
        //productos de abajo
        g2.fillOval(241, 256, 54, 54);
        g2.fillOval(305, 310, 54, 54);
        g2.fillOval(390, 256, 54, 54);
        g2.fillOval(454, 310, 54, 54);
        g2.fillOval(538, 256, 54, 54);
        */
    }
    
}
