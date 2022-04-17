package Proyecto_Final.Ventanas;


import Proyecto_Final.java_clases.Productor;
import Proyecto_Final.java_clases.Consumidor;
import javax.swing.JFrame;

public class Ventana extends JFrame {
    MiPanel mp;
    public Ventana(String titulo){
        super(titulo);
        this.setBounds(10,10,800,600);

        mp = new MiPanel(this);
        this.add(mp);

        Consumidor c = new Consumidor();
        c.setName("consumidor 1");
        iniciarThread(c);

        // Consumidor c1 = new Consumidor();
        // c1.setName("consumidor 2");
        // mp.startThreat(c1);

        Productor p = new Productor(mp);
        p.setName("productor 1");
        iniciarThread(p);

        // Productor p1 = new Productor(mp);
        // p1.setName("productor 2");
        // mp.startThreat(p1); 
        
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    //este metodo usa generics para poder funcionar tanto con productores como con consumidores
    public <T extends Thread> void iniciarThread (T t){
        t.start();
    }


    public <T extends Thread> void finalizarThread (T t){
        while(true){
            t.wait();
        }
    }
}
