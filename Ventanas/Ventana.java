package Proyecto_Final.Ventanas;

import javax.swing.JFrame;

public class Ventana extends JFrame {
    
    public Ventana(String titulo){
        super(titulo);
        this.setBounds(10,10,800,400);
        MiPanel mp = new MiPanel(this);
        this.add(mp);
        
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
