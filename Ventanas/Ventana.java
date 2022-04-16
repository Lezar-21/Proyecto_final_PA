package Proyecto_Final.Ventanas;

import Proyecto_Final.java_clases.Consumidor;
import Proyecto_Final.java_clases.Productor;
import javax.swing.JFrame;

public class Ventana extends JFrame {
    MiPanel mp;
    public Ventana(String titulo){
        super(titulo);
        this.setBounds(10,10,800,400);

        

        mp = new MiPanel(this);
        this.add(mp);

        Consumidor c = new Consumidor();
        c.setName("consumidor 1");
        c.start();

        Consumidor c1 = new Consumidor();
        c1.setName("consumidor 2");
        c1.start();

        Productor p = new Productor(mp);
        p.setName("productor 1");
        p.start();

        Productor p1 = new Productor(mp);
        p1.setName("productor 2");
        p1.start();
        
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
